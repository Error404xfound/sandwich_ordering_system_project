package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.Staff;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffAccountScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldUsername;
	private JPasswordField pwdFldPassword;
	private JLabel lblRole;
	private JLabel lblEmail;
	private Staff staffUser;
	private String role;
	private String email;


	public StaffAccountScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		
	    staffUser = (Staff) main.getCurrentUser();
	    role = staffUser.getRole();
	    email = staffUser.getEmail();

		
		
		JLabel lblStaffAccount = new JLabel("My Account");
		lblStaffAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffAccount.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblStaffAccount.setBounds(380, 80, 320, 48);
		add(lblStaffAccount);
		
		JLabel lblNewLabel_1_1 = new JLabel("Role:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(240, 200, 80, 40);
		add(lblNewLabel_1_1);
		
		lblRole = new JLabel("");
		lblRole.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRole.setBounds(330, 200, 510, 40);
		add(lblRole);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Username");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(240, 264, 320, 32);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(240, 352, 80, 32);
		add(lblNewLabel_2);
		
		txtFldUsername = new JTextField();
		txtFldUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldUsername.setColumns(10);
		txtFldUsername.setBounds(240, 304, 600, 32);
		add(txtFldUsername);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(240, 398, 120, 32);
		add(lblNewLabel_3);
		
		lblEmail = new JLabel("");
		lblEmail.setBounds(320, 352, 520, 32);
		add(lblEmail);
		
		pwdFldPassword = new JPasswordField();
		pwdFldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdFldPassword.setColumns(10);
		pwdFldPassword.setBounds(240, 438, 600, 32);
		add(pwdFldPassword);
		
		JButton btnUpdate = new JButton("Update details");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newUsername = txtFldUsername.getText();
				String newPwd = String.valueOf(pwdFldPassword.getPassword());
				int currentID = staffUser.getUserID();
				
				String error = main.getStaffController().editStaff(currentID, newUsername, newPwd);
				if (error == null) {
					
					JOptionPane.showMessageDialog(null, "Your account has been updated successfully.", "Notification", JOptionPane.INFORMATION_MESSAGE);
					
					staffUser = main.getStaffController().getStaffbyEmail(email);
					main.setCurrentUser(staffUser);
				}
				else {
					
					JOptionPane.showMessageDialog(null, error, "Notification", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUpdate.setBounds(240, 600, 600, 56);
		add(btnUpdate);
		
		JButton btnLogout = new JButton("Log out");
		btnLogout.setBackground(new Color(0, 128, 192));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setCurrentUser(null);
				main.showLogin();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(880, 0, 160, 48);
		add(btnLogout);
		
		JButton btnDelete = new JButton("Delete account");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(
						null, 
						"Are you sure you want to delete your account?",
						"Confirmation",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (choice == JOptionPane.YES_OPTION) {
					int currentUserID = main.getCurrentUser().getUserID();
					boolean isDeleted = main.getStaffController().deleteStaff(currentUserID);
					if (isDeleted) {
						
						JOptionPane.showMessageDialog(null, "Your account has been deleted successfully.", "Notification", JOptionPane.INFORMATION_MESSAGE);
						main.showLogin();
					}
					else {
						JOptionPane.showMessageDialog(null, "Your account could not be deleted. Please try again.", "Notification", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		btnDelete.setBackground(new Color(128, 0, 0));
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(880, 48, 160, 48);
		add(btnDelete);
		
		lblRole.setText(role);
		txtFldUsername.setText(main.getCurrentUser().getUsername());
		lblEmail.setText(email);
		pwdFldPassword.setText(main.getCurrentUser().getPassword());
		
		
	}
}