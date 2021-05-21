package com.ggozlo.ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

//@Repository
//@Scope(value = "singleton",proxyMode = ScopedProxyMode.DEFAULT)
public class OracleTicketRepository {

	private final JdbcTemplate jdbcTemplate;
	private final TransactionTemplate transactionTemplate;
	
//	@Autowired
	public OracleTicketRepository(JdbcTemplate jdbcTemplate, TransactionTemplate transactionTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.transactionTemplate = transactionTemplate;
	}

	public void tickeyBuy(final Ticket ticket) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				
				jdbcTemplate.update(new PreparedStatementCreator() {
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						String sql = "INSERT INTO CARD VALUES (?,?)";
						PreparedStatement psmt = con.prepareStatement(sql);
						psmt.setString(1, ticket.getName());
						psmt.setInt(2, ticket.getNum());
						return psmt;
					}
				});
				
				jdbcTemplate.update(new PreparedStatementCreator() {
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						String sql = "INSERT INTO TICKET VALUES (?,?)";
						PreparedStatement psmt = con.prepareStatement(sql);
						psmt.setString(1, ticket.getName());
						psmt.setInt(2, ticket.getNum());
						return psmt;
					}
				});
				
			}
		});
	}
	
	public List<Ticket> ticketList() throws SQLException {
		
//		return (ArrayList<Ticket>) jdbcTemplate.query("SELECT * FROM TICKET", new RowMapper<Ticket>() {
//			@Override
//			public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
//				return new Ticket(rs.getString(1), rs.getInt(2));
//			}
//		});
		
		return (ArrayList<Ticket>) jdbcTemplate.query("SELECT * FROM TICKET", new BeanPropertyRowMapper<Ticket>(Ticket.class));
		
	}
}

