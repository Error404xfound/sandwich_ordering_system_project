package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;

public class SignUpScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldUsername;
	private JTextField txtFldEmail;
	private JPasswordField pwdFldPassword;
	private ButtonGroup roleGroup;

	private JRadioButton rdCustomer;

	private JRadioButton rdStaff;

	public SignUpScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		roleGroup = new ButtonGroup();
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(500, 80, 320, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(360, 288, 320, 32);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(360, 376, 120, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(360, 464, 120, 32);
		add(lblNewLabel_3);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = String.valueOf(txtFldUsername.getText());
				String email = String.valueOf(txtFldEmail.getText());
				String password = String.valueOf(pwdFldPassword.getPassword());
				String rolePlaceholder = "";
				int fillerID = 0;
				boolean isAdded;
				if (rdStaff.isSelected()) {
					isAdded = main.getStaffController().addStaff(username, email, password, fillerID, rolePlaceholder);
					if (isAdded) {
						String msg = "Sign up successful\nWelcome to the crew, " + username + " !";
						JOptionPane.showMessageDialog(null, msg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						String msg = "Sign up unsuccessful\nPlease use your company email address.";
						JOptionPane.showMessageDialog(null, msg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else if (rdCustomer.isSelected()) {
					isAdded = main.getCustomerController().addCustomer(username, email, password, fillerID);
					if (isAdded) {
						String msg = "Login successful\nLet's get munching, " + username + " !";
						JOptionPane.showMessageDialog(null, msg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						String msg = "Login unsuccessful\nPlease use a valid email address.";
						JOptionPane.showMessageDialog(null, msg, "Notification", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select an account type.", "Notification", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignUp.setBounds(360, 600, 600, 56);
		add(btnSignUp);
		
		txtFldUsername = new JTextField();
		txtFldUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldUsername.setBounds(360, 328, 600, 32);
		add(txtFldUsername);
		txtFldUsername.setColumns(10);
		
		txtFldEmail = new JTextField();
		txtFldEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldEmail.setBounds(360, 416, 600, 32);
		add(txtFldEmail);
		txtFldEmail.setColumns(10);
		
		pwdFldPassword = new JPasswordField();
		pwdFldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdFldPassword.setBounds(360, 504, 600, 32);
		add(pwdFldPassword);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showWelcome();
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(40, 40, 160, 48);
		add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Account type");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(360, 200, 320, 32);
		add(lblNewLabel_1_1);
		
		rdCustomer = new JRadioButton("Customer");
		rdCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdCustomer.setBounds(360, 240, 104, 32);
		roleGroup.add(rdCustomer);
		add(rdCustomer);
		
		rdStaff = new JRadioButton("Staff");
		rdStaff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdStaff.setBounds(464, 240, 111, 32);
		roleGroup.add(rdStaff);
		add(rdStaff);
		
	}
}
