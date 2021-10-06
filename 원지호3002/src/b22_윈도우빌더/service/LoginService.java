package b22_孺紫辦網渦.service;

import b22_孺紫辦網渦.dto.UserDto;

public interface LoginService {
	public int loginLogic(String id, String pwd);
	public int loginTextCheack(String id, String pwd);
	public UserDto getUserDto(String id);
	
}
