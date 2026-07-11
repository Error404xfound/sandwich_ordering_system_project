package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerSignUpScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldUsername;
	private JTextField txtFldEmail;
	private JPasswordField passwordField;

	public CustomerSignUpScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Let's get started");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(500, 80, 320, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Sign Up as a Customer");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(360, 160, 600, 40);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(360, 240, 320, 32);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(360, 328, 120, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(360, 408, 120, 32);
		add(lblNewLabel_3);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignUp.setBounds(360, 536, 600, 56);
		add(btnSignUp);
		
		txtFldUsername = new JTextField();
		txtFldUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldUsername.setBounds(360, 280, 600, 32);
		add(txtFldUsername);
		txtFldUsername.setColumns(10);
		
		txtFldEmail = new JTextField();
		txtFldEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldEmail.setBounds(360, 368, 600, 32);
		add(txtFldEmail);
		txtFldEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(360, 448, 600, 32);
		add(passwordField);
		
		JButton btnNewButton = new JButton("Back to login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showLogin();
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(40, 40, 160, 48);
		add(btnNewButton);
	}

	public void showLogin() {
		// TODO Auto-generated method
	}

}
