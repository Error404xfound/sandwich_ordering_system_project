package gui;

import java.util.Vector;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane; // CHANGED: added for displaying controller messages
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Checkbox;

public class AddBreadTypeScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldName;
	private JTextField txtFldPrice;
	private JTextField txtFldEstPrpTime;
	private Vector<String> selectedTags = new Vector<String>();
	private JTextField txtFldTstTime;
	private boolean visible;

	public AddBreadTypeScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lbl = new JLabel("Add New Bread Type");
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
				String toastTimeText = txtFldTstTime.getText();
				String error = main.getBreadTypeController().addBreadType(name, priceText, selectedTags, prepTimeText, visible, null, toastTimeText);
				
				if (error == null) {
					JOptionPane.showMessageDialog(null, "Bread type added successfully.", "Notification", JOptionPane.INFORMATION_MESSAGE);
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
		
		JCheckBox chckbxBrdHalal = new JCheckBox("Halal");
		chckbxBrdHalal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdHalal.setBounds(240, 328, 80, 32);
		chckbxBrdHalal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBrdHalal.isSelected()) {
					selectedTags.add("Halal");
				} else {
					selectedTags.remove("Halal");
				}
			}
		});
		add(chckbxBrdHalal);
		
		JCheckBox chckbxBrdVegan = new JCheckBox("Vegan");
		chckbxBrdVegan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdVegan.setBounds(322, 328, 80, 32);
		chckbxBrdVegan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBrdVegan.isSelected()) {
					selectedTags.add("Vegan");
				} else {
					selectedTags.remove("Vegan");
				}
			}
		});
		add(chckbxBrdVegan);
		
		JCheckBox chckbxBrdVegeterian = new JCheckBox("Vegeterian");
		chckbxBrdVegeterian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdVegeterian.setBounds(404, 328, 112, 32);
		chckbxBrdVegeterian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBrdVegeterian.isSelected()) {
					selectedTags.add("Vegeterian");
				} else {
					selectedTags.remove("Vegeterian");
				}
			}
		});
		add(chckbxBrdVegeterian);
		
		JCheckBox chckbxBrdNutFree = new JCheckBox("Nut-free");
		chckbxBrdNutFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdNutFree.setBounds(518, 328, 96, 32);
		chckbxBrdNutFree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBrdNutFree.isSelected()) {
					selectedTags.add("Nut-free");
				} else {
					selectedTags.remove("Nut-free");
				}
			}
		});
		add(chckbxBrdNutFree);
		
		JCheckBox chckbxBrdBeefFree = new JCheckBox("Beef-free");
		chckbxBrdBeefFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdBeefFree.setBounds(616, 328, 104, 32);
		chckbxBrdBeefFree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBrdBeefFree.isSelected()) {
					selectedTags.add("Beef-free");
				} else {
					selectedTags.remove("Beef-free");
				}
			}
		});
		add(chckbxBrdBeefFree);
		
		JCheckBox chckbxBrdDairyfree = new JCheckBox("Dairy-free");
		chckbxBrdDairyfree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdDairyfree.setBounds(722, 328, 120, 32);
		chckbxBrdDairyfree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBrdDairyfree.isSelected()) {
					selectedTags.add("Dairy-free");
				} else {
					selectedTags.remove("Dairy-free");
				}
			}
		});
		add(chckbxBrdDairyfree);
		
		JLabel lblToastTime = new JLabel("Time taken to toast (mins)");
		lblToastTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblToastTime.setBounds(240, 464, 320, 32);
		add(lblToastTime);
		
		txtFldTstTime = new JTextField();
		txtFldTstTime.setText((String) null);
		txtFldTstTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldTstTime.setColumns(10);
		txtFldTstTime.setBounds(240, 504, 600, 32);
		add(txtFldTstTime);
		
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
