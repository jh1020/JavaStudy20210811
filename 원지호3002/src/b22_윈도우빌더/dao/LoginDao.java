package b22_À©µµ¿ìºô´õ.dao;

import java.sql.SQLSyntaxErrorException;

public interface LoginDao {
	public int login(String id, String password) throws SQLSyntaxErrorException;
	public String getLoginUserName (String id);
	
}
