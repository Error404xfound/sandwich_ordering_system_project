package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffSidebarScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public StaffSidebarScreen(MainFrame main) {
		setBackground(new Color(192, 192, 192));
		setPreferredSize(new java.awt.Dimension(240, 720));
		this.main = main;
		setLayout(null);
		
		JButton btnMenu = new JButton("Menu\r\n");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showMenu();
			}
		});
		btnMenu.setBackground(new Color(192, 192, 192));
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu.setBounds(0, 0, 240, 80);
		add(btnMenu);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showInventory();
			}
		});
		btnInventory.setBackground(new Color(192, 192, 192));
		btnInventory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnInventory.setBounds(0, 80, 240, 80);
		add(btnInventory);
		
		JButton btnOrders = new JButton("Orders");
		btnOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showOrders();
			}
		});
		btnOrders.setBackground(new Color(192, 192, 192));
		btnOrders.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOrders.setBounds(0, 160, 240, 80);
		add(btnOrders);
		
		JButton btnAnalytics = new JButton("Analytics");
		btnAnalytics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showAnalytics();
			}
		});
		btnAnalytics.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAnalytics.setBackground(Color.LIGHT_GRAY);
		btnAnalytics.setBounds(0, 240, 240, 80);
		add(btnAnalytics);
		
		JButton btnTier = new JButton("Loyalty Discount Manager");
		btnTier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showLoyaltyDiscountTierMng();
			}
		});
		btnTier.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTier.setBackground(Color.LIGHT_GRAY);
		btnTier.setBounds(0, 320, 240, 80);
		add(btnTier);
		
		JButton btnStaff = new JButton("My Account");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffAccount();
			}
		});
		btnStaff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnStaff.setBackground(Color.LIGHT_GRAY);
		btnStaff.setBounds(0, 648, 240, 80);
		add(btnStaff);
	}

}
