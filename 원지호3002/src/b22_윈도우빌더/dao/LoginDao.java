package b22_���������.dao;

import java.sql.SQLSyntaxErrorException;

import b22_���������.dto.UserDto;

public interface LoginDao {
	public int login(String id, String password) throws SQLSyntaxErrorException;
	public String getLoginUserName (String id);
	public UserDto getUserDto(String id);
}
