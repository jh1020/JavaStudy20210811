package User.service;

import User.dao.SignUpDao;
import User.dao.SignUpDaoImpl;

public class SignUpServiceImpl implements SignUpService{
	
	private SignUpDao signUpDao;
	
	public SignUpServiceImpl() {
		signUpDao = new SignUpDaoImpl();
	}

	@Override
	public boolean isEmptyId(String id) {
		return id.length() != 0 ? true : false;
	}

	@Override
	public int idCheck(String id) {
		// flag == 0 중복확인 성공, 1 중복확인 실패, 2 빈값오류
		
		int flag = 2;
		
		if(isEmptyId(id)) {
			// db에서 아이디 중복확인
			flag = signUpDao.idCheck(id);
		}
		
		return flag;
	}
	
	@Override
	public String isEmptyValue(String[] values) {
		String msg = null;
		int errorIndex = 100;
		
		for(int i = 0; i < values.length; i++) {
			if(values[i].length() == 0 || values[i].equals("선택")) {
				errorIndex = i;
				break;
			}
		}
		
		if(errorIndex == 0) {
			msg = "아이디가 입력되지 않았습니다.";
		} else if(errorIndex == 1) {
			msg = "비밀번호가 입력되지 않았습니다.";
		} else if(errorIndex == 2) {
			msg = "비밀번호 확인이 입력되지 않았습니다.";
		} else if(errorIndex == 3) {
			msg = "이름이 입력되지 않았습니다.";
		} else if(errorIndex == 4) {
			msg = "연락처가 입력되지 않았습니다.";
		} else if(errorIndex == 5) {
			msg = "이메일이 입력되지 않았습니다.";
		} else if(errorIndex == 6) {
			msg = "성별이 선택되지 않았습니다.";
		} else {
			msg = "values is not null";
		}
		return msg;
	}
	
	@Override
	public String equalsPassword(String pwd, String repwd) {
		String msg = null;
		
		if(pwd.equals(repwd)) {
			msg = "password equals";
		} else {
			msg = "비밀번호가 일치하지 않습니다.\n 다시 입력하세요.";
		}
		
		return msg;
	}
	
	@Override
	public boolean signUp(String[] values) {
		return signUpDao.signUp(values);
	}
}









