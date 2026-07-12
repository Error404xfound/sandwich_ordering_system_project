package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class StaffAccountScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public StaffAccountScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblStaffAccount = new JLabel("My Account");
		lblStaffAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffAccount.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblStaffAccount.setBounds(380, 80, 320, 48);
		add(lblStaffAccount);
	}

	public void showLogin() {
		// TODO Auto-generated method
	}

}
