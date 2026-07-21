package gui;

import java.util.Vector;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class AddIngredientScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldName;
	private JTextField txtFldPrice;
	private JTextField txtFldEstPrpTime;
	private Vector<String> selectedTags = new Vector<String>();
	private boolean visible;

	public AddIngredientScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lbl = new JLabel("Add New Ingredient");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lbl.setBounds(380, 80, 320, 48);
		add(lbl);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(240, 200, 320, 32);
		add(lblNewLabel_1_1);
		
		txtFldName = new JTextField();
		txtFldName.setText((String) null);
		txtFldName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldName.setColumns(10);
		txtFldName.setBounds(240, 240, 400, 32);
		add(txtFldName);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price (SGD$)");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(680, 200, 160, 32);
		add(lblNewLabel_1_1_1);
		
		txtFldPrice = new JTextField();
		txtFldPrice.setText((String) null);
		txtFldPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldPrice.setColumns(10);
		txtFldPrice.setBounds(680, 240, 160, 32);
		add(txtFldPrice);
		
		JLabel lblNewLabel = new JLabel("Dietary tags");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(240, 288, 320, 32);
		add(lblNewLabel);
		
		JLabel lblEstimatedPrepationTime = new JLabel("Base preparation time (mins)");
		lblEstimatedPrepationTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstimatedPrepationTime.setBounds(240, 376, 320, 32);
		add(lblEstimatedPrepationTime);
		
		txtFldEstPrpTime = new JTextField();
		txtFldEstPrpTime.setText((String) null);
		txtFldEstPrpTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldEstPrpTime.setColumns(10);
		txtFldEstPrpTime.setBounds(240, 416, 600, 32);
		add(txtFldEstPrpTime);
		
		JButton btnConfirm = new JButton("Confirm addition");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtFldName.getText();
				String priceText = txtFldPrice.getText();
				String prepTimeText = txtFldEstPrpTime.getText();
				String error = main.getIngredientController().addIngredient(name, priceText, selectedTags, prepTimeText, visible, null);
				if (error == null) {
					JOptionPane.showMessageDialog(null, "Ingredient added successfully.", "Notification", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, error, "Notification", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirm.setBounds(240, 600, 600, 56);
		add(btnConfirm);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showMenu();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(40, 40, 160, 48);
		add(btnNewButton);
		
		JCheckBox chckbxIngHalal = new JCheckBox("Halal");
		chckbxIngHalal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngHalal.setBounds(240, 328, 80, 32);
		chckbxIngHalal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxIngHalal.isSelected()) {
					selectedTags.add("Halal");
				} else {
					selectedTags.remove("Halal");
				}
			}
		});
		add(chckbxIngHalal);
		
		JCheckBox chckbxIngVegan = new JCheckBox("Vegan");
		chckbxIngVegan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngVegan.setBounds(322, 328, 80, 32);
		chckbxIngVegan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxIngVegan.isSelected()) {
					selectedTags.add("Vegan");
				} else {
					selectedTags.remove("Vegan");
				}
			}
		});
		add(chckbxIngVegan);
		
		JCheckBox chckbxIngVegeterian = new JCheckBox("Vegeterian");
		chckbxIngVegeterian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngVegeterian.setBounds(404, 328, 112, 32);
		chckbxIngVegeterian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxIngVegeterian.isSelected()) {
					selectedTags.add("Vegeterian");
				} else {
					selectedTags.remove("Vegeterian");
				}
			}
		});
		add(chckbxIngVegeterian);
		
		JCheckBox chckbxIngNutFree = new JCheckBox("Nut-free");
		chckbxIngNutFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngNutFree.setBounds(518, 328, 96, 32);
		chckbxIngNutFree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxIngNutFree.isSelected()) {
					selectedTags.add("Nut-free");
				} else {
					selectedTags.remove("Nut-free");
				}
			}
		});
		add(chckbxIngNutFree);
		
		JCheckBox chckbxIngBeefFree = new JCheckBox("Beef-free");
		chckbxIngBeefFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngBeefFree.setBounds(616, 328, 104, 32);
		chckbxIngBeefFree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxIngBeefFree.isSelected()) {
					selectedTags.add("Beef-free");
				} else {
					selectedTags.remove("Beef-free");
				}
			}
		});
		add(chckbxIngBeefFree);
		
		JCheckBox chckbxIngDairyfree = new JCheckBox("Dairy-free");
		chckbxIngDairyfree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngDairyfree.setBounds(722, 328, 120, 32);
		chckbxIngDairyfree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxIngDairyfree.isSelected()) {
					selectedTags.add("Dairy-free");
				} else {
					selectedTags.remove("Dairy-free");
				}
			}
		});
		add(chckbxIngDairyfree);
		
		JCheckBox chckbxOnMenu = new JCheckBox("On Menu");
		chckbxOnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxOnMenu.isSelected()) {
					visible = true;
				}
				else {
					visible = false;
				}
			}
		});
		chckbxOnMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxOnMenu.setSelected(true);
		chckbxOnMenu.setBounds(880, 200, 120, 32);
		add(chckbxOnMenu);
		
		visible = true;
	}
}