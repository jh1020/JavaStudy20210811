package b22_���������.service;

import b22_���������.dao.LoginDao;
import b22_���������.dao.LoginDaoImpl;

/**
 * 
 * MVC Model
 * 
 * M: model : DB�� �ٸ� �����͵��� ���� �� �ִ� ����(Dao, Dto, Vo, Bean)
 * V: View : ����ڰ� ���� ȭ��
 * C: Controller : ����ڿ��� � View�� �����ٰ����� ��Ʈ���Ͽ�����.
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
