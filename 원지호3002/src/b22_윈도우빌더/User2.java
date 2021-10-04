package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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

public class User2 extends JFrame {
	

	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;
	private JTextField id_texf;
	private JPasswordField passwordField;
	private JTextField id_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private String[] gender_list = {"성별", "남성", "여성", "선택하지 않음"};
	
	
	private LoginService loginService;
	private SignUpService signUpService;
	
	
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
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(398, 139, 73, 52);
		login_pan.add(btnNewButton);
		
		id_texf = new JTextField();
		id_texf.setBounds(230, 139, 156, 23);
		id_texf.setColumns(10);
		login_pan.add(id_texf);
		
		JLabel pwdLable = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLable.setBounds(162, 173, 57, 15);
		pwdLable.setHorizontalAlignment(SwingConstants.RIGHT);
		login_pan.add(pwdLable);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(230, 170, 156, 21);
		login_pan.add(passwordField);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.setBounds(259, 221, 97, 23);
		sign_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "sign_up_pan");
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
		
		JComboBox gender_cb = new JComboBox(gender_list);
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
						gender_cb.getSelectedItem().toString()
				};
				String errorMsg = signUpService.isEmptyValue(values);
				if(!errorMsg.equals("values is not null")) {
					JOptionPane.showMessageDialog(null, errorMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				}else {
					errorMsg = signUpService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(!errorMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null, errorMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
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
			}
		});
		page_back_btn.setBounds(367, 285, 104, 23);
		signup_pan.add(page_back_btn);
	}
}
