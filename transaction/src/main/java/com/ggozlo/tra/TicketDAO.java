package com.ggozlo.tra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Repository
public class TicketDAO {
	
	private  JdbcTemplate jdbcTemplate;
	private  PlatformTransactionManager transactionManager ;
	
	
	@Autowired
	public TicketDAO(JdbcTemplate jdbcTemplate, PlatformTransactionManager transactionManager) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.transactionManager = transactionManager;
	}
	

	public void buyTicket( final Ticket ticket) {
		TransactionDefinition definition = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(definition);
		try {
			
				jdbcTemplate.update(
					new PreparedStatementCreator() 
					{
						@Override
						public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
							PreparedStatement psmt;
							String sql = "INSERT INTO CARD VALUES (?,?)";
							psmt = con.prepareStatement(sql);
							psmt.setString(1, ticket.getIdNumber() );
							psmt.setInt(2, ticket.getTicketCount() );
							return psmt;
						}
					}
				);
		
				jdbcTemplate.update(
					new PreparedStatementCreator() {
						@Override
						public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
							PreparedStatement psmt;
							String sql = "INSERT INTO TICKET VALUES (?,?)";
							psmt = con.prepareStatement(sql);
							psmt.setString(1, ticket.getIdNumber() );
							psmt.setInt(2, ticket.getTicketCount() );
							return psmt;
						}
					}
				);
				transactionManager.commit(status);
				
		}
		catch (Exception e) {
			transactionManager.rollback(status);
		}

	}



		
	
}
