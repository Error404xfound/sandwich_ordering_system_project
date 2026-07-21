package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.MainFrame;
import data.Ingredient;

public class EditIngredientScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private Ingredient ingredient;
	private int ingredientIndex;
	private JTextField txtFldName;
	private JTextField txtFldPrice;
	private JTextField txtFldEstPrpTime;
	private JCheckBox chckbxOnMenu;
	private Vector<String> selectedTags = new Vector<String>();

	public EditIngredientScreen(MainFrame main, int ingredientIndex, Ingredient ingredient) {
		this.main = main;
		setLayout(null);
		this.ingredientIndex = ingredientIndex;
		this.ingredient = ingredient;
		this.selectedTags.addAll(ingredient.getDietaryTags());

		JLabel lbl = new JLabel("Edit Ingredient");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lbl.setBounds(380, 80, 320, 48);
		add(lbl);

		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(240, 200, 320, 32);
		add(lblNewLabel_1_1);

		txtFldName = new JTextField();
		txtFldName.setText(ingredient.getName());
		txtFldName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldName.setColumns(10);
		txtFldName.setBounds(240, 240, 400, 32);
		add(txtFldName);

		JLabel lblNewLabel_1_1_1 = new JLabel("Price (SGD$)");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(680, 200, 160, 32);
		add(lblNewLabel_1_1_1);

		txtFldPrice = new JTextField();
		txtFldPrice.setText(String.format("%.2f", ingredient.getPrice()));
		txtFldPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldPrice.setColumns(10);
		txtFldPrice.setBounds(680, 240, 160, 32);
		add(txtFldPrice);

		JLabel lblNewLabel = new JLabel("Dietary tags");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(240, 288, 320, 32);
		add(lblNewLabel);

		JLabel lblEstimatedPrepationTime = new JLabel("Base prepation time (mins)");
		lblEstimatedPrepationTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstimatedPrepationTime.setBounds(240, 376, 320, 32);
		add(lblEstimatedPrepationTime);

		txtFldEstPrpTime = new JTextField();
		txtFldEstPrpTime.setText(String.format("%.2f", ingredient.getPreparationTimeMins()));
		txtFldEstPrpTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldEstPrpTime.setColumns(10);
		txtFldEstPrpTime.setBounds(240, 416, 600, 32);
		add(txtFldEstPrpTime);

		chckbxOnMenu = new JCheckBox("On menu");
		chckbxOnMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxOnMenu.setBounds(880, 200, 120, 32);
		chckbxOnMenu.setSelected(ingredient.getIsVisible());
		add(chckbxOnMenu);

		JCheckBox chckbxIngHalal = new JCheckBox("Halal");
		chckbxIngHalal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngHalal.setBounds(240, 328, 80, 32);
		chckbxIngHalal.setSelected(selectedTags.contains("Halal"));
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
		chckbxIngVegan.setSelected(selectedTags.contains("Vegan"));
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
		chckbxIngVegeterian.setSelected(selectedTags.contains("Vegeterian"));
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
		chckbxIngNutFree.setSelected(selectedTags.contains("Nut-free"));
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
		chckbxIngBeefFree.setSelected(selectedTags.contains("Beef-free"));
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
		chckbxIngDairyfree.setSelected(selectedTags.contains("Dairy-free"));
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

		JButton btnConfirm = new JButton("Confirm edit");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtFldName.getText();
				String priceText = txtFldPrice.getText();
				String prepTimeText = txtFldEstPrpTime.getText();
				boolean isVisible = chckbxOnMenu.isSelected();
				String imagePath = ingredient.getImagePath();
				int ID = ingredient.getMenuItemID();
				String error = main.getIngredientController().editIngredient(ID, name, priceText, selectedTags, prepTimeText, isVisible, imagePath);
				if (error == null) {
					JOptionPane.showMessageDialog(null, "Ingredient updated successfully.", "Notification", JOptionPane.INFORMATION_MESSAGE);
					main.showMenu();
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
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public int getIngredientIndex() {
		return ingredientIndex;
	}

	public void setIngredientIndex(int ingredientIndex) {
		this.ingredientIndex = ingredientIndex;
	}

}