package User.service;

import User.dao.LoginDao;
import User.dao.LoginDaoImpl;
import User.dto.UserDto;

/**
 * 
 * MVC Model
 * 
 * M: Model: DB나 다른 데이터들을 담을 수 있는 영역(DAO, DTO, VO, Bean)
 * V: View: 사용자가 보는 화면
 * C: Controller: 사용자에게 어떤 View를 보여줄건지만 컨트롤하여야함.
 *
 */

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;
	
	public LoginServiceImpl() {
		loginDao = new LoginDaoImpl();
	}
	
	@Override
	public int loginTextCheck(String id, String pwd) {
		int flag = 0;
		
		if(id.length() == 0) {
			flag = 3;
		}else if(pwd.length() == 0) {
			flag = 4;
		}else {
			flag = loginLogic(id, pwd);
		}
		return flag;
	}
	
	@Override
	public int loginLogic(String id, String pwd) {
		return loginDao.login(id, pwd);
	}
	
	@Override
	public UserDto getUserDto(String id) {
		return loginDao.getUserDto(id);
	}
}









