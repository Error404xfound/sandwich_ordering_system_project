package gui;

import java.util.List;

import javax.swing.JPanel;

import controller.MainFrame;
import data.BreadType;
import data.Ingredient;
import data.Order;
import data.Sandwich;

public class EditSandwichScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private List<BreadType> displayedBreadTypes;
	private int sandwichIndex;
	private List<Ingredient> displayedIngredients;
	private Sandwich sandwich;

	public EditSandwichScreen(MainFrame main, int sandwichIndex, Sandwich sandwich) {
		this.main = main;
		this.sandwichIndex = sandwichIndex;
		this.sandwich = sandwich;
	}

	public List<BreadType> getDisplayedBreadTypes() {
		return displayedBreadTypes;
	}

	public void setDisplayedBreadTypes(List<BreadType> displayedBreadTypes) {
		this.displayedBreadTypes = displayedBreadTypes;
	}

	public int getSandwichIndex() {
		return sandwichIndex;
	}

	public void setSandwichIndex(int sandwichIndex) {
		this.sandwichIndex = sandwichIndex;
	}

	public List<Ingredient> getDisplayedIngredients() {
		return displayedIngredients;
	}

	public void setDisplayedIngredients(List<Ingredient> displayedIngredients) {
		this.displayedIngredients = displayedIngredients;
	}

	public Sandwich getSandwich() {
		return sandwich;
	}

	public void setSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	public void showEditOrder(Order order, int idx) {
		// TODO Auto-generated method
	}

	public void showCart() {
		// TODO Auto-generated method
	}

}
