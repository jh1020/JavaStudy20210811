package User;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import User.dao.DeleteUserDao;
import User.dao.DeleteUserDaoImpl;
import User.dao.UpdateUserDao;
import User.dao.UpdateUserDaoImpl;
import User.dto.UserDto;
import User.service.LoginService;
import User.service.LoginServiceImpl;
import User.service.SignUpService;
import User.service.SignUpServiceImpl;
import java.awt.Font;

public class User extends JFrame {
	
	private UserDto loginSession;

	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;
	private JTextField login_id_tf;
	private JPasswordField login_pwd_tf;
	private JTextField id_tf;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JComboBox gender_cb;
	private JLabel welcomMsg;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};
	private JPasswordField new_pwd_tf;
	private JPasswordField new_repwd_tf;

	
	private LoginService loginService;
	private SignUpService signUpService;
	private DeleteUserDao deleteUserDao;
	private UpdateUserDao updateUserDao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		loginService = new LoginServiceImpl();
		signUpService = new SignUpServiceImpl();
		deleteUserDao = new DeleteUserDaoImpl();
		updateUserDao = new UpdateUserDaoImpl();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 552);
		mainCardPan = new JPanel();
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);
		cl_mainCardPan = new CardLayout();
		mainCardPan.setLayout(cl_mainCardPan);
		
		JPanel login_pan = new JPanel();
		mainCardPan.add(login_pan, "login_pan");
		login_pan.setLayout(null);
		
		login_id_tf = new JTextField();
		login_id_tf.setColumns(10);
		login_id_tf.setBounds(324, 176, 166, 29);
		login_pan.add(login_id_tf);
		
		JButton login_btn = new JButton("\uB85C\uADF8\uC778");
		login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = loginService.loginTextCheck(login_id_tf.getText(), login_pwd_tf.getText());
				if(flag != 2) {
					String msg = null;
					if(flag == 0) {
						msg = "존재하지 않는 아이디입니다.";
					}else if(flag == 1) {
						msg = "비밀번호를 다시 확인해 주세요.";
					}else if(flag == 3) {
						msg = "아이디를 입력해 주세요.";
					}else if(flag == 4) {
						msg = "비밀번호를 입력해 주세요.";
					}
					JOptionPane.showMessageDialog(null, msg, "경고", JOptionPane.WARNING_MESSAGE);
				}else {
					cl_mainCardPan.show(mainCardPan, "index_pan");
					loginSession = loginService.getUserDto(login_id_tf.getText());
					welcomMsg.setText(loginSession.getUser_name() + "님 환영합니다.");
				}
			}
		});
		login_btn.setBounds(504, 176, 84, 68);
		login_pan.add(login_btn);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(227, 181, 84, 15);
		login_pan.add(idLabel);
		
		JLabel pwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdLabel.setBounds(227, 221, 84, 15);
		login_pan.add(pwdLabel);
		
		login_pwd_tf = new JPasswordField();
		login_pwd_tf.setBounds(324, 214, 166, 29);
		login_pan.add(login_pwd_tf);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "sign_up_pan");
				id_tf.setText("");
				id_tf.setEditable(true);
				pwd_tf.setText("");
				repwd_tf.setText("");
				name_tf.setText("");
				phone_tf.setText("");
				email_tf.setText("");
				gender_cb.setSelectedIndex(0);
				
				login_id_tf.setText("");
				login_pwd_tf.setText("");
			}
		});
		sign_up.setBounds(362, 274, 123, 37);
		login_pan.add(sign_up);
		
		JPanel sign_up_pan = new JPanel();
		mainCardPan.add(sign_up_pan, "sign_up_pan");
		sign_up_pan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(260, 54, 57, 15);
		sign_up_pan.add(lblNewLabel);
		
		id_tf = new JTextField();
		id_tf.setBounds(330, 48, 127, 28);
		sign_up_pan.add(id_tf);
		id_tf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(260, 105, 57, 15);
		sign_up_pan.add(lblNewLabel_1);
		
		pwd_tf = new JPasswordField();
		pwd_tf.setBounds(330, 99, 219, 28);
		sign_up_pan.add(pwd_tf);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(232, 156, 85, 15);
		sign_up_pan.add(lblNewLabel_1_1);
		
		repwd_tf = new JPasswordField();
		repwd_tf.setBounds(330, 150, 219, 28);
		sign_up_pan.add(repwd_tf);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(260, 209, 57, 15);
		sign_up_pan.add(lblNewLabel_2);
		
		name_tf = new JTextField();
		name_tf.setColumns(10);
		name_tf.setBounds(330, 203, 219, 28);
		sign_up_pan.add(name_tf);
		
		JLabel lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(260, 262, 57, 15);
		sign_up_pan.add(lblNewLabel_3);
		
		phone_tf = new JTextField();
		phone_tf.setColumns(10);
		phone_tf.setBounds(330, 256, 219, 28);
		sign_up_pan.add(phone_tf);
		
		JLabel lblNewLabel_4 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(260, 310, 57, 15);
		sign_up_pan.add(lblNewLabel_4);
		
		email_tf = new JTextField();
		email_tf.setColumns(10);
		email_tf.setBounds(330, 304, 219, 28);
		sign_up_pan.add(email_tf);
		
		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(260, 366, 57, 15);
		sign_up_pan.add(lblNewLabel_5);
		
		gender_cb = new JComboBox(gender_list);
		gender_cb.setBounds(330, 359, 219, 28);
		sign_up_pan.add(gender_cb);
		
		JButton sign_up_btn = new JButton("\uAC00\uC785\uD558\uAE30");
		sign_up_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] values = {
						id_tf.getText(),
						pwd_tf.getText(),
						repwd_tf.getText(),
						name_tf.getText(),
						phone_tf.getText(),
						email_tf.getText(),
						gender_cb.getSelectedItem().toString(),
						Integer.toString(gender_cb.getSelectedIndex())
				};
				
				String errorMsg = signUpService.isEmptyValue(values);
				
				if(!errorMsg.equals("values is not null")) {
					JOptionPane.showMessageDialog(null, errorMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				}else {
					errorMsg = signUpService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(!errorMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null, errorMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}else {
						boolean flag = signUpService.signUp(values);
						JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
						cl_mainCardPan.show(mainCardPan, "login_pan");
					}
				}
				
				
			}
		});
		sign_up_btn.setBounds(330, 422, 97, 23);
		sign_up_pan.add(sign_up_btn);
		
		JButton id_chk_btn = new JButton("\uC911\uBCF5\uD655\uC778");
		id_chk_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = signUpService.idCheck(id_tf.getText());
				if(flag == 2) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
				}else if(flag == 1) {
					JOptionPane.showMessageDialog(null, "존재하는 아이디입니다.", "아이디 중복", JOptionPane.WARNING_MESSAGE);
				}else if(flag == 0) {
					int select = JOptionPane.showConfirmDialog(null, "사용가능한 아이디입니다.\n사용하시겠습니까?", "아이디 확인", JOptionPane.YES_NO_OPTION);
					if(select == 0) {
						id_tf.setEditable(false);
					}
				}
			}
		});
		id_chk_btn.setBounds(458, 48, 91, 28);
		sign_up_pan.add(id_chk_btn);
		
		JButton page_back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		page_back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "login_pan");
				
			}
		});
		page_back_btn.setBounds(452, 422, 97, 23);
		sign_up_pan.add(page_back_btn);
		
		JPanel index_pan = new JPanel();
		mainCardPan.add(index_pan, "index_pan");
		index_pan.setLayout(null);
		
		welcomMsg = new JLabel("New label");
		welcomMsg.setBounds(12, 10, 383, 26);
		index_pan.add(welcomMsg);
		
		JButton logout_btn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logout_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말 로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					cl_mainCardPan.show(mainCardPan, "login_pan");
					loginSession = null;
					login_id_tf.setText("");
					login_pwd_tf.setText("");
				}
			}
		});
		logout_btn.setBounds(728, 12, 97, 23);
		index_pan.add(logout_btn);
		
		JButton mypage_btn = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		mypage_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "mypage_pan");
			}
		});
		mypage_btn.setBounds(619, 12, 97, 23);
		index_pan.add(mypage_btn);
		
		JPanel mypage_pan = new JPanel();
		mainCardPan.add(mypage_pan, "mypage_pan");
		mypage_pan.setLayout(null);
		
		JButton user_drop_btn = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		user_drop_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말로 계정을 삭제하시겠습니까?", "회원탈퇴", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					boolean dropFlag = deleteUserDao.deleteUser(loginSession.getUser_id());
					cl_mainCardPan.show(mainCardPan, "login_pan");
					login_id_tf.setText("");
					login_pwd_tf.setText("");
				}
			}
		});
		user_drop_btn.setBounds(711, 453, 97, 23);
		mypage_pan.add(user_drop_btn);
		
		JLabel lblNewLabel_6 = new JLabel("\uB9C8\uC774\uD398\uC774\uC9C0");
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(335, 51, 126, 15);
		mypage_pan.add(lblNewLabel_6);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("\uC0C8 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(589, 118, 80, 15);
		mypage_pan.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("\uC0C8 \uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setBounds(572, 143, 97, 15);
		mypage_pan.add(lblNewLabel_7_1);
		
		new_pwd_tf = new JPasswordField();
		new_pwd_tf.setBounds(681, 115, 110, 18);
		new_pwd_tf.setEditable(false);
		mypage_pan.add(new_pwd_tf);
		
		new_repwd_tf = new JPasswordField();
		new_repwd_tf.setBounds(681, 140, 110, 18);
		new_repwd_tf.setEditable(false);
		mypage_pan.add(new_repwd_tf);
		
		JButton update_btn = new JButton("\uC218\uC815\uC644\uB8CC");
		update_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(new_pwd_tf.getText().equals(new_repwd_tf.getText())) {
					boolean flag = updateUserDao.updatePassword(loginSession.getUser_id(),new_pwd_tf.getText());
					if(flag == true) {
						loginSession.setUser_pwd(new_pwd_tf.getText());
						JOptionPane.showMessageDialog(null, "비밀번호 변경 완료", "완료", JOptionPane.INFORMATION_MESSAGE);
						new_pwd_tf.setEditable(false);
						new_repwd_tf.setEditable(false);
						update_btn.setEnabled(false);
						
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않스비낟.", "비밀번호확인", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		update_btn.setBounds(694, 168, 97, 23);
		update_btn.setEnabled(false);
		mypage_pan.add(update_btn);
		
		JButton update_pwd_btn = new JButton("\uBE44\uBC00\uBC88\uD638 \uC218\uC815");
		update_pwd_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				while(true) {
				String originPwd = JOptionPane.showInputDialog(null, "기존의 비밀번호를 입력해 주세요.", "비밀번호 수정",JOptionPane.YES_NO_OPTION);
				if(loginSession.getUser_pwd().equals(originPwd)) {
					new_pwd_tf.setEditable(true);
					new_repwd_tf.setEditable(true);
					update_btn.setEnabled(true);
					
					break;
				}else if(originPwd == null){
					break;
				}else {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
				}
			}
			}	
		});
		update_pwd_btn.setFont(new Font("굴림", Font.PLAIN, 11));
		update_pwd_btn.setBounds(589, 453, 110, 23);
		mypage_pan.add(update_pwd_btn);
	}
}
