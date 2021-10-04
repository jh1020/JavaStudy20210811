package b22_윈도우빌더.service;

import b22_윈도우빌더.dao.LoginDao;
import b22_윈도우빌더.dao.LoginDaoImpl;

/**
 * 
 * MVC Model
 * 
 * M: model : DB나 다른 데이터들을 담을 수 있는 영역(Dao, Dto, Vo, Bean)
 * V: View : 사용자가 보는 화면
 * C: Controller : 사용자에게 어떤 View를 보여줄건지만 컨트롤하여야함.
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
			loginLogic(id, pwd);
		}
		return flag;
	}

	@Override
	public int loginLogic(String id, String pwd) {
		return loginDao.login (id, pwd);
		
	}
	
	
}
