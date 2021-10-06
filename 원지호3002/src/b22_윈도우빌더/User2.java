package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.dao.DeleteUserDao;
import b22_윈도우빌더.dao.DeleteUserDaoImpl;
import b22_윈도우빌더.dto.UserDto;
import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class User2 extends JFrame {
	
	private UserDto loginSession;

	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;
	private JTextField Login_id_tf;
	private JPasswordField Login_pwd_tf;
	private JTextField id_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JComboBox gender_cb;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private JLabel welcomMsg;
	private String[] gender_list = {"성별", "남성", "여성", "선택하지 않음"};
	
	
	private LoginService loginService;
	private SignUpService signUpService;
	private DeleteUserDao deleteUserDao;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User2 frame = new User2();
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
	public User2() {
		loginService = new LoginServiceImpl();
		signUpService = new SignUpServiceImpl();
		deleteUserDao = new DeleteUserDaoImpl(); 
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 445);
		mainCardPan = new JPanel();
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);
		cl_mainCardPan = new CardLayout();
		mainCardPan.setLayout(cl_mainCardPan);
		
		JPanel login_pan = new JPanel();
		mainCardPan.add(login_pan, "login_Pan");
		login_pan.setLayout(null);
		
		JLabel idLable = new JLabel("\uC544\uC774\uB514");
		idLable.setBounds(140, 139, 73, 23);
		idLable.setHorizontalAlignment(SwingConstants.RIGHT);
		login_pan.add(idLable);
		
		JButton Login_btn = new JButton("\uB85C\uADF8\uC778");
		Login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = loginService.loginTextCheack(Login_id_tf.getText(),Login_pwd_tf.getText());
				if(flag != 2) {
					String msg = null;
					if(flag == 0) {
						msg = "존재하지 않는 아이디입나다.";
						
					}else if (flag == 1){
						msg = "비밀번호를 다시 확인해 주세요";
					}else if (flag == 3) {
						msg = "아이디를 입력해 주세요";
					}else if (flag == 4) {
						msg = "비밀번호를 입력해 주세요";
					} 
						
					JOptionPane.showMessageDialog(null, msg, "경고", JOptionPane.WARNING_MESSAGE);
				}
				
				else {
					cl_mainCardPan.show(mainCardPan,"index_pan");
					loginSession = loginService.getUserDto(Login_id_tf.getName());
					welcomMsg.setText(loginSession.getUser_name() + "님 환영합니다.");
				}
			}
		});
		Login_btn.setBounds(398, 139, 73, 52);
		login_pan.add(Login_btn);
		
		Login_id_tf = new JTextField();
		Login_id_tf.setBounds(230, 139, 156, 23);
		Login_id_tf.setColumns(10);
		login_pan.add(Login_id_tf);
		
		JLabel pwdLable = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLable.setBounds(162, 173, 57, 15);
		pwdLable.setHorizontalAlignment(SwingConstants.RIGHT);
		login_pan.add(pwdLable);
		
		Login_pwd_tf = new JPasswordField();
		Login_pwd_tf.setBounds(230, 170, 156, 21);
		login_pan.add(Login_pwd_tf);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.setBounds(259, 221, 97, 23);
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
				
				Login_id_tf.setText("");
				Login_pwd_tf.setText("");
			}
		});
		login_pan.add(sign_up);
		
		JPanel signup_pan = new JPanel();
		mainCardPan.add(signup_pan, "sign_up_pan");
		signup_pan.setLayout(null);
		
		id_tf = new JTextField();
		id_tf.setBounds(258, 73, 116, 21);
		signup_pan.add(id_tf);
		id_tf.setColumns(10);
		
		name_tf = new JTextField();
		name_tf.setColumns(10);
		name_tf.setBounds(258, 161, 213, 21);
		signup_pan.add(name_tf);
		
		phone_tf = new JTextField();
		phone_tf.setColumns(10);
		phone_tf.setBounds(258, 192, 213, 21);
		signup_pan.add(phone_tf);
		
		email_tf = new JTextField();
		email_tf.setColumns(10);
		email_tf.setBounds(258, 223, 213, 21);
		signup_pan.add(email_tf);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(189, 76, 57, 15);
		signup_pan.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(189, 105, 57, 15);
		signup_pan.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(142, 133, 104, 15);
		signup_pan.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(189, 164, 57, 15);
		signup_pan.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(189, 195, 57, 15);
		signup_pan.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(189, 226, 57, 15);
		signup_pan.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(189, 257, 57, 15);
		signup_pan.add(lblNewLabel_6);
		
		JButton idcheack_btn = new JButton("\uC911\uBCF5\uD655\uC778");
		idcheack_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = signUpService.idCheck(id_tf.getText());
				if(flag == 2) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
				}else if(flag == 1) {
					JOptionPane.showMessageDialog(null, "존재하는 아이디입니다", "아이디 중복", JOptionPane.WARNING_MESSAGE);
				}else if(flag == 0) {
					int select = JOptionPane.showConfirmDialog(null, "사용가능한 아이디 입니다.\n사용하시겠습니까?", "아이디 확인", JOptionPane.YES_NO_OPTION);
					if(select == 0) {
						id_tf.setEditable(false);
					}
				}
			}
		});
		idcheack_btn.setBounds(374, 72, 97, 23);
		signup_pan.add(idcheack_btn);
		
		pwd_tf = new JPasswordField();
		pwd_tf.setBounds(258, 102, 213, 21);
		signup_pan.add(pwd_tf);
		
		repwd_tf = new JPasswordField();
		repwd_tf.setBounds(258, 130, 213, 21);
		signup_pan.add(repwd_tf);
		
		gender_cb = new JComboBox(gender_list);
		gender_cb.setModel(new DefaultComboBoxModel(new String[] {"\uC120\uD0DD", "\uB0A8\uC131", "\uC5EC\uC131", "\uC120\uD0DD\uD558\uC9C0 \uC54A\uC74C"}));
		gender_cb.setBounds(258, 254, 213, 21);
		signup_pan.add(gender_cb);
		
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
						JOptionPane.showMessageDialog(null,"회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
						cl_mainCardPan.show(mainCardPan, "login_Pan");
					}
				}
				
				
				
			}
		});
		sign_up_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sign_up_btn.setBounds(258, 285, 104, 23);
		signup_pan.add(sign_up_btn);
		
		JButton page_back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		page_back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "login_Pan");
				id_tf.setText("");
				id_tf.setEditable(true);
				pwd_tf.setText("");
				repwd_tf.setText("");
				name_tf.setText("");
				phone_tf.setText("");
				email_tf.setText("");
				gender_cb.setSelectedIndex(0);
			}
		});
		page_back_btn.setBounds(367, 285, 104, 23);
		signup_pan.add(page_back_btn);
		
		JPanel index_pan = new JPanel();
		mainCardPan.add(index_pan, "index_pan");
		index_pan.setLayout(null);
		
		welcomMsg = new JLabel("New label");
		welcomMsg.setBounds(12, 10, 57, 15);
		index_pan.add(welcomMsg);
		
		JButton Logout_btn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		Logout_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말 로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					cl_mainCardPan.show(mainCardPan,"login_pan");
					loginSession = null;
					Login_id_tf.setText("");
					Login_pwd_tf.setText("");
				}
			}
		});
		Logout_btn.setBounds(520, 6, 97, 23);
		index_pan.add(Logout_btn);
		
		JButton myPage_btn = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		myPage_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "mypage_pan");
			}
		});
		myPage_btn.setBounds(411, 6, 97, 23);
		index_pan.add(myPage_btn);
		
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
					Login_id_tf.setText("");
					Login_pwd_tf.setText("");
				}
			}
		});
		user_drop_btn.setBounds(520, 363, 97, 23);
		mypage_pan.add(user_drop_btn);
	}
}
