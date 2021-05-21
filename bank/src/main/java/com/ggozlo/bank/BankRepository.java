package com.ggozlo.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Repository
public class BankRepository {

	private final JdbcTemplate jdbcTemplate;
	private final TransactionTemplate transactionTemplate;
	private Money wallet;
	
	@Autowired
	public void setMoney(Money money) {
		this.wallet = money;
	}

	@Autowired
	public BankRepository(JdbcTemplate jdbcTemplate, TransactionTemplate transactionTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.transactionTemplate = transactionTemplate;
	}
	
	public void createAccount(final String name) {
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException{
				String sql = "INSERT INTO ACCOUNT VALUES (?,0)";
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, name);
				return psmt;
			}
		});			
	}
	
	public List<Account> accountList() {
		return (ArrayList<Account>) jdbcTemplate.query("SELECT * FROM ACCOUNT",new BeanPropertyRowMapper<Account>(Account.class));
	}
	
	public void deposit(final String name, final int money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				jdbcTemplate.update(new PreparedStatementCreator() {
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						if(wallet.getMoney() < 0) {
							throw new SQLException("보유 금액을 초과한 입금은 불가능합니다!");
						}
						String sql = "UPDATE ACCOUNT SET MONEY = MONEY+? WHERE NAME = ?";
						PreparedStatement psmt = con.prepareStatement(sql);
						psmt.setInt(1, money);
						psmt.setString(2, name);
						wallet.setMoney(wallet.getMoney() - money);
						return psmt;
					}
				});
				
			}
		});
	
	
	}
	
	public void withdraw(final String name, final int money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				jdbcTemplate.update(new PreparedStatementCreator() {
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						String sql = "UPDATE ACCOUNT SET MONEY = MONEY - ? WHERE NAME = ? ";
						PreparedStatement psmt = con.prepareStatement(sql);
						psmt.setInt(1, money);
						psmt.setString(2, name);
						wallet.setMoney( wallet.getMoney() + money );
						return psmt;
					}
				});
			}
		});
		
	}
	
}
