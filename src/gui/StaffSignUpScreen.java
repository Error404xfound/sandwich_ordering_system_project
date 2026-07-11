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

public class StaffSignUpScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldUsername;
	private JTextField txtFldEmail;
	private JPasswordField pwdFldPassword;

	public StaffSignUpScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JButton btnBack = new JButton("Back to login");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showLogin();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(40, 40, 160, 48);
		add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Let's get started");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(500, 80, 320, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Sign Up as a Staff");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(360, 160, 280, 40);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(360, 328, 320, 32);
		add(lblNewLabel_1);
		
		txtFldUsername = new JTextField();
		txtFldUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFldUsername.setColumns(10);
		txtFldUsername.setBounds(360, 368, 600, 32);
		add(txtFldUsername);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(360, 408, 120, 32);
		add(lblNewLabel_2);
		
		txtFldEmail = new JTextField();
		txtFldEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFldEmail.setColumns(10);
		txtFldEmail.setBounds(360, 448, 600, 32);
		add(txtFldEmail);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(360, 496, 120, 32);
		add(lblNewLabel_3);
		
		pwdFldPassword = new JPasswordField();
		pwdFldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdFldPassword.setBounds(360, 536, 600, 32);
		add(pwdFldPassword);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignUp.setBounds(360, 624, 600, 56);
		add(btnSignUp);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(360, 280, 600, 32);
		add(comboBox);
		
		JLabel lblNewLabel_3_1 = new JLabel("Role");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(360, 240, 64, 32);
		add(lblNewLabel_3_1);
	}

	public void showLogin() {
		// TODO Auto-generated method
	}
}
