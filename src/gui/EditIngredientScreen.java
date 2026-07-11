package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.Ingredient;

public class EditIngredientScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private Ingredient ingredient;
	private int ingredientIndex;

	public EditIngredientScreen(MainFrame main, int ingredientIndex, Ingredient ingredient) {
		this.main = main;
		this.ingredientIndex = ingredientIndex;
		this.ingredient = ingredient;
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

	public void showMenu() {
		// TODO Auto-generated method
	}

}
