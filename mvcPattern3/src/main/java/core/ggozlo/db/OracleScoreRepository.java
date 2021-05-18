package core.ggozlo.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;



@Component
@Repository
public class OracleScoreRepository {
	Connection conn;
	PreparedStatement psmt;
	ResultSet res;
	private final DataSource dataSource;
	
	@Autowired
	public OracleScoreRepository(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public void scoreSave(Score score) {
		try {
			conn = dataSource.getConnection();
			String sql = "INSERT INTO SCORE VALUES (?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, score.getName());
			psmt.setInt(2, score.getKor());
			psmt.setInt(3, score.getEng());
			psmt.setInt(4, score.getMat());
			psmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
				try {
					if(psmt != null) psmt.close();
					if(conn != null) conn.close();
				} 
				catch (SQLException e) {

					e.printStackTrace();
				}
		}
		
	}
	
	public List<Score> scorePrint() {
		List<Score> list = new ArrayList<Score>();
		
		try {
			conn = dataSource.getConnection();
			String sql = "SELECT * FROM SCORE ORDER BY KOR+ENG+MAT";
			psmt = conn.prepareStatement(sql);
			res = psmt.executeQuery();
			if(res.isBeforeFirst()) {
				while(res.next()) {
					list.add( new Score(
							res.getString(1), 
							res.getInt(2), 
							res.getInt(3), 
							res.getInt(4)));
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
				try {
					if(res != null) res.close();
					if(psmt != null) psmt.close();
					if(conn != null) conn.close();
				} 
				catch (SQLException e) {

					e.printStackTrace();
				}
		}
		
		return list;
		
	}
	
	
	
}
