package b20_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLSyntaxErrorException;

import db.DBConnectionMgr;

public class LoginDaoImpl {
	private DBConnectionMgr pool;
	
	public LoginDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	// 로그인 로직
	public int login(String id,String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 0;
		
		try {
			con = pool.getConnection();
			sql = "select count(um.user_id), count(ud.user_id) from"
					+ " user_mst"
					+ " nm left outer join user_mst ud on (ud.user_id = um.user_id and ud.user_password = ?)"
					+ "where um.user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, id);
			try {
			rs = pstmt.executeQuery();
			} catch (SQLSyntaxErrorException e) {
				System.out.println("sql문법오류");
			}
			
			
			rs.next();
			flag = rs.getInt(1) + rs.getInt(2);
			
				
			
		}catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 클래스 드라이버가 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("spl문법오류로 인해 ResultSet이 생성되지 않았습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return flag;
		
	}
	
	
}
