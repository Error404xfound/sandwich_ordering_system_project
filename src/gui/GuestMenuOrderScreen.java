package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuestMenuOrderScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public GuestMenuOrderScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guest Menu\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(500, 80, 320, 48);
		add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showLogin();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(40, 40, 160, 48);
		add(btnBack);
	}

	public void showLogin() {
		// TODO Auto-generated method
	}

}
