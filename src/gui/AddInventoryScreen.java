package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class AddInventoryScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldUnitCost;
	private JTextField txtFldQuantity;
	private JTextField txtFldSupplier;

	public AddInventoryScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblAddInventory = new JLabel("Add Inventory");
		lblAddInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddInventory.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAddInventory.setBounds(380, 80, 320, 48);
		add(lblAddInventory);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(40, 40, 160, 48);
		add(btnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("Type: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(240, 200, 80, 40);
		add(lblNewLabel_1_1);
		
		JLabel lblType = new JLabel("[Menu Item Type]");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblType.setBounds(320, 200, 510, 40);
		add(lblType);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Menu Item");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(240, 264, 320, 32);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Unit Cost (SGD$)");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(680, 264, 160, 32);
		add(lblNewLabel_1_1_1_1);
		
		txtFldUnitCost = new JTextField();
		txtFldUnitCost.setText((String) null);
		txtFldUnitCost.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldUnitCost.setColumns(10);
		txtFldUnitCost.setBounds(680, 304, 160, 32);
		add(txtFldUnitCost);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(240, 304, 400, 32);
		add(comboBox);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQuantity.setBounds(240, 352, 320, 32);
		add(lblQuantity);
		
		txtFldQuantity = new JTextField();
		txtFldQuantity.setText((String) null);
		txtFldQuantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldQuantity.setColumns(10);
		txtFldQuantity.setBounds(240, 392, 600, 32);
		add(txtFldQuantity);
		
		JLabel lblSupplier = new JLabel("Supplier");
		lblSupplier.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSupplier.setBounds(240, 440, 320, 32);
		add(lblSupplier);
		
		txtFldSupplier = new JTextField();
		txtFldSupplier.setText((String) null);
		txtFldSupplier.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldSupplier.setColumns(10);
		txtFldSupplier.setBounds(240, 480, 600, 32);
		add(txtFldSupplier);
		
		JButton btnConfirm = new JButton("Confirm addition");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirm.setBounds(240, 600, 600, 56);
		add(btnConfirm);
	}

	public void showInventory() {
		// TODO Auto-generated method
	}
}
