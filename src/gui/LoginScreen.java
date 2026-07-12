package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldEmail;
	private JPasswordField pwdFldPassword;

	public LoginScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showWelcome();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(40, 40, 160, 48);
		add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Welcome Back");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(500, 80, 320, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Log In");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(360, 160, 280, 40);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(360, 240, 120, 32);
		add(lblNewLabel_2);
		
		txtFldEmail = new JTextField();
		txtFldEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFldEmail.setColumns(10);
		txtFldEmail.setBounds(360, 280, 600, 32);
		add(txtFldEmail);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(360, 328, 120, 32);
		add(lblNewLabel_3);
		
		pwdFldPassword = new JPasswordField();
		pwdFldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdFldPassword.setBounds(360, 368, 600, 32);
		add(pwdFldPassword);
		
		JButton btnSignUp = new JButton("Log in");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignUp.setBounds(360, 520, 600, 56);
		add(btnSignUp);
		
		JLabel lblNewLabel_5 = new JLabel("or");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(500, 600, 320, 20);
		add(lblNewLabel_5);
		
		JButton btnGuest = new JButton("Continue as Guest");
		btnGuest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuest.setBounds(360, 640, 600, 56);
		add(btnGuest);
	}

	
}
