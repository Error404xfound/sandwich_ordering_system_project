package gui;

import java.util.List;

import javax.swing.JPanel;

import controller.MainFrame;
import data.BreadType;
import data.Ingredient;

public class MenuScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private List<BreadType> displayedBreadType;
	private List<Ingredient> displayedIngredient;

	public MenuScreen(MainFrame main) {
		this.main = main;
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
