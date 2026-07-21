package gui;

import java.util.Vector;

import javax.swing.JPanel;

import controller.MainFrame;
import data.BreadType;
import data.Ingredient;
import data.ItemStock;
import data.MenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditInventoryScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private int itemStockIndex;
	private ItemStock itemStock;
	private JTextField txtFldUnitCost;
	private JTextField txtFldQuantity;
	private JTextField txtFldSupplier;
	private JComboBox comboBox;
	private JLabel lblType;
	private Vector<MenuItem> displayedMenuItems;

	public EditInventoryScreen(MainFrame main, ItemStock itemStock, int itemStockIndex) {
		this.main = main;
		this.itemStock = itemStock;
		this.itemStockIndex = itemStockIndex;
		setLayout(null);
		
		JLabel lblEditInventory = new JLabel("Edit Inventory");
		lblEditInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditInventory.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblEditInventory.setBounds(380, 80, 320, 48);
		add(lblEditInventory);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showInventory();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(40, 40, 160, 48);
		add(btnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("Type: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(240, 200, 80, 40);
		add(lblNewLabel_1_1);
		
		lblType = new JLabel("[Menu Item Type]");
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
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTypeLabel();
			}
		});
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
		
		JButton btnConfirm = new JButton("Confirm changes");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				MenuItem selectedMenuItem = null;
				if (index != -1) {
					selectedMenuItem = displayedMenuItems.get(index);
				}
				String result = main.getInventoryController().editItemStock(
						getItemStock().getItemStockID(),
						selectedMenuItem,
						txtFldUnitCost.getText(),
						txtFldQuantity.getText(),
						txtFldSupplier.getText());
				if (result == null) {
					JOptionPane.showMessageDialog(null, "Inventory item updated successfully.", "Notification", JOptionPane.INFORMATION_MESSAGE);
					main.showInventory();
				}
				else {
					JOptionPane.showMessageDialog(null, result, "Notification", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirm.setBounds(240, 600, 600, 56);
		add(btnConfirm);
		
		populateMenuItemComboBox();
		preloadFields();
	}

	public int getItemStockIndex() {
		return itemStockIndex;
	}

	public void setItemStockIndex(int itemStockIndex) {
		this.itemStockIndex = itemStockIndex;
	}

	public ItemStock getItemStock() {
		return itemStock;
	}

	public void setItemStock(ItemStock itemStock) {
		this.itemStock = itemStock;
	}

	private void populateMenuItemComboBox() {
		displayedMenuItems = main.getMenuController().getAllMenuItems();
		comboBox.removeAllItems();
		for (int i = 0; i < displayedMenuItems.size(); i++) {
			comboBox.addItem(displayedMenuItems.get(i).getName());
		}
	}

	private void preloadFields() {
		for (int i = 0; i < displayedMenuItems.size(); i++) {
			if (displayedMenuItems.get(i).getMenuItemID() == itemStock.getMenuitem().getMenuItemID()) {
				comboBox.setSelectedIndex(i);
				break;
			}
		}
		txtFldUnitCost.setText(String.format("%.2f", itemStock.getCost()));
		txtFldQuantity.setText(String.valueOf(itemStock.getQuantity()));
		txtFldSupplier.setText(itemStock.getSupplier());
	}

	private void updateTypeLabel() {
		int index = comboBox.getSelectedIndex();
		if (index == -1) {
			lblType.setText("[Menu Item Type]");
			return;
		}
		MenuItem selectedMenuItem = displayedMenuItems.get(index);
		if (selectedMenuItem instanceof BreadType) {
			lblType.setText("Bread");
		}
		else if (selectedMenuItem instanceof Ingredient) {
			lblType.setText("Ingredient");
		}
	}

}