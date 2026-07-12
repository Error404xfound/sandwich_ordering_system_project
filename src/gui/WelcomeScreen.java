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

public class WelcomeScreen extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public WelcomeScreen(MainFrame main) {
		this.main = main;
		
		setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("The Super Sandwich Store");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(360, 280, 600, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(500, 240, 320, 40);
		add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showLogin();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(360, 400, 600, 56);
		add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showSignUp();
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignUp.setBounds(360, 480, 600, 56);
		add(btnSignUp);
	}
}
