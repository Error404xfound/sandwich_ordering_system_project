package gui;

import java.util.List;

import javax.swing.JPanel;

import controller.MainFrame;
import data.BreadType;
import data.Ingredient;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class MenuScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private List<BreadType> displayedBreadType;
	private List<Ingredient> displayedIngredient;

	public MenuScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1080, 5288);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bread Types");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(240, 200, 320, 40);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Dietary tags");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(240, 260, 320, 32);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxBrdHalal = new JCheckBox("Halal");
		chckbxBrdHalal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdHalal.setBounds(240, 300, 80, 32);
		panel.add(chckbxBrdHalal);
		
		JCheckBox chckbxBrdVegan = new JCheckBox("Vegan");
		chckbxBrdVegan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdVegan.setBounds(322, 300, 80, 32);
		panel.add(chckbxBrdVegan);
		
		JCheckBox chckbxBrdVegeterian = new JCheckBox("Vegeterian");
		chckbxBrdVegeterian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdVegeterian.setBounds(404, 300, 112, 32);
		panel.add(chckbxBrdVegeterian);
		
		JCheckBox chckbxBrdNutFree = new JCheckBox("Nut-free");
		chckbxBrdNutFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdNutFree.setBounds(518, 300, 96, 32);
		panel.add(chckbxBrdNutFree);
		
		JCheckBox chckbxBrdBeefFree = new JCheckBox("Beef-free");
		chckbxBrdBeefFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdBeefFree.setBounds(616, 300, 104, 32);
		panel.add(chckbxBrdBeefFree);
		
		JCheckBox chckbxBrdDairyfree = new JCheckBox("Dairy-free");
		chckbxBrdDairyfree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBrdDairyfree.setBounds(722, 300, 120, 32);
		panel.add(chckbxBrdDairyfree);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ingredients");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(240, 972, 320, 40);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Dietary tags");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(240, 1032, 320, 32);
		panel.add(lblNewLabel_1);
		
		JCheckBox chckbxIngHalal = new JCheckBox("Halal");
		chckbxIngHalal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngHalal.setBounds(240, 1072, 80, 32);
		panel.add(chckbxIngHalal);
		
		JCheckBox chckbxIngVegan = new JCheckBox("Vegan");
		chckbxIngVegan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngVegan.setBounds(322, 1072, 80, 32);
		panel.add(chckbxIngVegan);
		
		JCheckBox chckbxIngVegeterian = new JCheckBox("Vegeterian");
		chckbxIngVegeterian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngVegeterian.setBounds(404, 1072, 112, 32);
		panel.add(chckbxIngVegeterian);
		
		JCheckBox chckbxIngNutFree = new JCheckBox("Nut-free");
		chckbxIngNutFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngNutFree.setBounds(518, 1072, 96, 32);
		panel.add(chckbxIngNutFree);
		
		JCheckBox chckbxIngBeefFree = new JCheckBox("Beef-free");
		chckbxIngBeefFree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngBeefFree.setBounds(616, 1072, 104, 32);
		panel.add(chckbxIngBeefFree);
		
		JCheckBox chckbxIngDairyfree = new JCheckBox("Dairy-free");
		chckbxIngDairyfree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIngDairyfree.setBounds(722, 1072, 120, 32);
		panel.add(chckbxIngDairyfree);
		
		java.awt.List list_1 = new java.awt.List();
		list_1.setBounds(241, 1120, 598, 238);
		panel.add(list_1);
		
		java.awt.List list_1_1 = new java.awt.List();
		list_1_1.setBounds(240, 348, 600, 240);
		panel.add(list_1_1);
		
		JLabel lblBrdNameNPrice = new JLabel("");
		lblBrdNameNPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBrdNameNPrice.setBounds(240, 612, 448, 32);
		panel.add(lblBrdNameNPrice);
		
		JLabel lblNewLabel_2 = new JLabel("Dietary tags:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(240, 668, 120, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblBrdDietaryTags = new JLabel("");
		lblBrdDietaryTags.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrdDietaryTags.setBounds(359, 668, 483, 32);
		panel.add(lblBrdDietaryTags);
		
		JCheckBox chckbxBrdOnMenu = new JCheckBox("On Menu");
		chckbxBrdOnMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxBrdOnMenu.setBounds(722, 612, 120, 32);
		panel.add(chckbxBrdOnMenu);
		
		JLabel lblNewLabel_2_1 = new JLabel("Estimated Preparation Time:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(240, 708, 240, 32);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblBrdPrpTime = new JLabel("");
		lblBrdPrpTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrdPrpTime.setBounds(480, 708, 362, 32);
		panel.add(lblBrdPrpTime);
		
		JLabel lblIngNameNPrice = new JLabel("");
		lblIngNameNPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngNameNPrice.setBounds(240, 1383, 448, 32);
		panel.add(lblIngNameNPrice);
		
		JLabel lblNewLabel_2_2 = new JLabel("Dietary tags:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(240, 1439, 120, 32);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Estimated Preparation Time:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(240, 1482, 240, 32);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblIngPrpTime = new JLabel("");
		lblIngPrpTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIngPrpTime.setBounds(480, 1482, 362, 32);
		panel.add(lblIngPrpTime);
		
		JLabel lblIngDietaryTags = new JLabel("");
		lblIngDietaryTags.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIngDietaryTags.setBounds(359, 1439, 483, 32);
		panel.add(lblIngDietaryTags);
		
		JCheckBox chckbxIngOnMenu = new JCheckBox("On Menu");
		chckbxIngOnMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxIngOnMenu.setBounds(722, 1383, 120, 32);
		panel.add(chckbxIngOnMenu);
		
		JButton btnBrdEdit = new JButton("Edit bread type");
		btnBrdEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrdEdit.setBounds(240, 772, 288, 48);
		panel.add(btnBrdEdit);
		
		JButton btnBrdDelete = new JButton("Delete bread type");
		btnBrdDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrdDelete.setBounds(554, 772, 288, 48);
		panel.add(btnBrdDelete);
		
		JButton btnBrdAdd = new JButton("Add bread type");
		btnBrdAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBrdAdd.setBounds(240, 852, 600, 56);
		panel.add(btnBrdAdd);
		
		JButton btnBrdEdit_1 = new JButton("Edit bread type");
		btnBrdEdit_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrdEdit_1.setBounds(240, 1541, 288, 48);
		panel.add(btnBrdEdit_1);
		
		JButton btnBrdAdd_1 = new JButton("Add bread type");
		btnBrdAdd_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBrdAdd_1.setBounds(240, 1621, 600, 56);
		panel.add(btnBrdAdd_1);
		
		JButton btnBrdDelete_1 = new JButton("Delete bread type");
		btnBrdDelete_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrdDelete_1.setBounds(554, 1541, 288, 48);
		panel.add(btnBrdDelete_1);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblMenu.setBounds(380, 80, 320, 48);
		panel.add(lblMenu);
	}

	public List<BreadType> getDisplayedBreadType() {
		return displayedBreadType;
	}

	public void setDisplayedBreadType(List<BreadType> displayedBreadType) {
		this.displayedBreadType = displayedBreadType;
	}

	public List<Ingredient> getDisplayedIngredient() {
		return displayedIngredient;
	}

	public void setDisplayedIngredient(List<Ingredient> displayedIngredient) {
		this.displayedIngredient = displayedIngredient;
	}

	public void showEditIngredient(int idx, Ingredient ingredient) {
		// TODO Auto-generated method
	}

	public void showEditBreadType(BreadType breadType, int idx) {
		// TODO Auto-generated method
	}

	public void showAddBreadType() {
		// TODO Auto-generated method
	}

	public void showAddIngredient() {
		// TODO Auto-generated method
	}

	public void showEditBreadType(int idx, BreadType breadType) {
		// TODO Auto-generated method
	}

	public void showEditIngredient(Ingredient ingredient, int idx) {
		// TODO Auto-generated method
	}
}
