package b22_À©µµ¿ìºô´õ.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class SignUpDaoImpl implements SignUpDao{
	
	
	private DBConnectionMgr pool;
	
	public SignUpDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	
	@Override
	public int idCheck(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 2;
		
		
		try {
			con = pool.getConnection();
			sql = "select count(user_id) from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			flag = rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
}
