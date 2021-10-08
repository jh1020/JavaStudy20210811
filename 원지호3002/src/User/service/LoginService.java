package User.service;

import User.dto.UserDto;

public interface LoginService {
	public int loginTextCheck(String id, String pwd);
	public int loginLogic(String id, String pwd);
	public UserDto getUserDto(String id);
}
