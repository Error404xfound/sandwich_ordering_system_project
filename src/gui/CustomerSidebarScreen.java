package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class CustomerSidebarScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public CustomerSidebarScreen(MainFrame main) {
		setBackground(new Color(192, 192, 192));
		setPreferredSize(new java.awt.Dimension(240, 720));
		this.main = main;
		setLayout(null);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOrder.setBackground(Color.LIGHT_GRAY);
		btnOrder.setBounds(0, 0, 240, 80);
		add(btnOrder);
		
		JButton btnOrderAgain = new JButton("Order Again");
		btnOrderAgain.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOrderAgain.setBackground(Color.LIGHT_GRAY);
		btnOrderAgain.setBounds(0, 80, 240, 80);
		add(btnOrderAgain);
		
		JButton btnCurrentOrders = new JButton("Current Orders");
		btnCurrentOrders.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCurrentOrders.setBackground(Color.LIGHT_GRAY);
		btnCurrentOrders.setBounds(0, 160, 240, 80);
		add(btnCurrentOrders);
		
		JButton btnLoyaltyDiscounts = new JButton("Loyalty Discounts");
		btnLoyaltyDiscounts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLoyaltyDiscounts.setBackground(Color.LIGHT_GRAY);
		btnLoyaltyDiscounts.setBounds(0, 240, 240, 80);
		add(btnLoyaltyDiscounts);
		
		JButton btnAccount = new JButton("My Account");
		btnAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAccount.setBackground(Color.LIGHT_GRAY);
		btnAccount.setBounds(0, 640, 240, 80);
		add(btnAccount);
	}

	public void showCurrentOrders() {
		// TODO Auto-generated method
	}

	public void showCustomerAccount() {
		// TODO Auto-generated method
	}

	public void showLoyalty() {
		// TODO Auto-generated method
	}

	public void showOrderAgain() {
		// TODO Auto-generated method
	}

	public void showMenuOrder() {
		// TODO Auto-generated method
	}

}
