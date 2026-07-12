package gui;

import javax.swing.JPanel;

import controller.MainFrame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class LoginScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldEmail;
	private JPasswordField pwdFldPassword;
	private ButtonGroup roleGroup;

	private JRadioButton rdCustomer;
	private String unsuccessfulMsg = "Login unsuccessful. Please try again.";
	

	private JRadioButton rdStaff;

	public LoginScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		roleGroup = new ButtonGroup();
		
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
		lblNewLabel_2.setBounds(360, 328, 120, 32);
		add(lblNewLabel_2);
		
		txtFldEmail = new JTextField();
		txtFldEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldEmail.setColumns(10);
		txtFldEmail.setBounds(360, 368, 600, 32);
		add(txtFldEmail);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(360, 416, 120, 32);
		add(lblNewLabel_3);
		
		pwdFldPassword = new JPasswordField();
		pwdFldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdFldPassword.setBounds(360, 456, 600, 32);
		add(pwdFldPassword);
		
		JButton btnLogin = new JButton("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = String.valueOf(txtFldEmail.getText());
				String password = String.valueOf(pwdFldPassword.getPassword());
				boolean isVerified;
				if (rdStaff.isSelected()) {
					isVerified = main.getStaffController().verifyStaff(email, password);
					if (isVerified) {
						String msg = "Login successful.\nWelcome back, " + main.getStaffController().getStaffbyEmail(email).getUsername() + " !";
						JOptionPane.showMessageDialog(null, msg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, unsuccessfulMsg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else if (rdCustomer.isSelected()) {
					isVerified = main.getCustomerController().verifyCustomer(email, password);
					 if (isVerified) {
						 String msg = "Login successful.\nWelcome back, " + main.getCustomerController().getCustomerbyEmail(email).getUsername() + " !";
						 JOptionPane.showMessageDialog(null, msg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					 }
					 else {
						 JOptionPane.showMessageDialog(null, unsuccessfulMsg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					 }
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(360, 540, 600, 56);
		add(btnLogin);
		
		JLabel lblNewLabel_5 = new JLabel("or");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(500, 608, 320, 20);
		add(lblNewLabel_5);
		
		JButton btnGuest = new JButton("Continue as Guest");
		btnGuest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuest.setBounds(360, 640, 600, 56);
		add(btnGuest);
		
		rdCustomer = new JRadioButton("Customer");
		rdCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdCustomer.setBounds(360, 280, 104, 32);
		roleGroup.add(rdCustomer);
		add(rdCustomer);
		
		rdStaff = new JRadioButton("Staff");
		rdStaff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdStaff.setBounds(464, 280, 111, 32);
		roleGroup.add(rdStaff);
		add(rdStaff);
		
		JLabel lblNewLabel_1_1 = new JLabel("Account type");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(360, 240, 320, 32);
		add(lblNewLabel_1_1);
	}

	
}
