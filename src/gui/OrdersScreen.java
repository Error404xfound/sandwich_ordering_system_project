package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class OrdersScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public OrdersScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblSystemOrders = new JLabel("System Orders");
		lblSystemOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystemOrders.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSystemOrders.setBounds(380, 80, 320, 48);
		add(lblSystemOrders);
	}

	public void showOrdersSummary() {
		// TODO Auto-generated method
	}

	public void showOrderDetails() {
		// TODO Auto-generated method
	}

}
