package b22_孺紫辦網渦;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import b22_孺紫辦網渦.service.LoginService;

import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class User {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User window = new User();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public User() {
		LoginService = new LoginService() {
			
			@Override
			public int loginTextCheack(String id, String pwd) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int loginLogic(String id, String pwd) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel idLable = new JLabel("\uC544\uC774\uB514");
		idLable.setHorizontalAlignment(SwingConstants.RIGHT);
		idLable.setBounds(78, 106, 73, 23);
		panel.add(idLable);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778 \uBC84\uD2BC");
		btnNewButton.setBounds(336, 108, 86, 54);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(167, 104, 156, 23);
		panel.add(textField);
		
		JLabel pwdLable = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLable.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdLable.setBounds(100, 140, 57, 15);
		panel.add(pwdLable);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 137, 156, 21);
		panel.add(passwordField);
	}
}
