package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.ItemStock;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InventoryScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public InventoryScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventory.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblInventory.setBounds(380, 80, 320, 48);
		add(lblInventory);
	}

	public void showAddInventory() {
		// TODO Auto-generated method
	}

	public void showEditInventory(int idx, ItemStock itemStock) {
		// TODO Auto-generated method
	}

}
