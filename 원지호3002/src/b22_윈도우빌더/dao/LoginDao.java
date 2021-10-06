package b22_孺紫辦網渦.dao;

import java.sql.SQLSyntaxErrorException;

import b22_孺紫辦網渦.dto.UserDto;

public interface LoginDao {
	public int login(String id, String password) throws SQLSyntaxErrorException;
	public String getLoginUserName (String id);
	public UserDto getUserDto(String id);
}
