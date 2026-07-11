package gui;

import javax.swing.JPanel;

import controller.MainFrame;


import javax.swing.JLabel;
import java.awt.Font;


import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JPasswordField pwdFldPassword;
	private JTextField txtFldEmail;

	public LoginScreen(MainFrame main) {
		this.main = main;
		
		setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("The Super Sandwich Store");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(360, 80, 600, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(500, 40, 320, 40);
		add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(360, 456, 600, 56);
		add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(360, 240, 120, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(360, 328, 120, 32);
		add(lblNewLabel_3);
		
		pwdFldPassword = new JPasswordField();
		pwdFldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdFldPassword.setBounds(360, 368, 600, 32);
		add(pwdFldPassword);
		
		JLabel lblNewLabel_4 = new JLabel("Log In");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(360, 160, 120, 40);
		add(lblNewLabel_4);
		
		txtFldEmail = new JTextField();
		txtFldEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldEmail.setColumns(10);
		txtFldEmail.setBounds(360, 280, 600, 32);
		add(txtFldEmail);
		
		JLabel lblNewLabel_5 = new JLabel("or");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(500, 540, 320, 20);
		add(lblNewLabel_5);
		
		JButton btnCustomerSignUp = new JButton("Sign up as a customer");
		btnCustomerSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showCustomerSignUp();
			}
		});
		btnCustomerSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCustomerSignUp.setBounds(360, 588, 280, 56);
		add(btnCustomerSignUp);
		
		JButton btnStaffSignUp = new JButton("Sign up as a staff");
		btnStaffSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffSignUp();
			}
		});
		btnStaffSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStaffSignUp.setBounds(680, 588, 280, 56);
		add(btnStaffSignUp);
	}
}
