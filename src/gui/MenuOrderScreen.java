package gui;

import java.util.List;

import javax.swing.JPanel;

import controller.MainFrame;
import data.BreadType;
import data.Ingredient;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuOrderScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private List<BreadType> displayedBreadTypes;
	private List<Ingredient> displayedIngredients;

	public MenuOrderScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Order");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(500, 80, 320, 48);
		add(lblNewLabel);
	}

	public List<BreadType> getDisplayedBreadTypes() {
		return displayedBreadTypes;
	}

	public void setDisplayedBreadTypes(List<BreadType> displayedBreadTypes) {
		this.displayedBreadTypes = displayedBreadTypes;
	}

	public List<Ingredient> getDisplayedIngredients() {
		return displayedIngredients;
	}

	public void setDisplayedIngredients(List<Ingredient> displayedIngredients) {
		this.displayedIngredients = displayedIngredients;
	}

	public void showCart() {
		// TODO Auto-generated method
	}

}
