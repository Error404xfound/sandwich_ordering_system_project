package gui;

import data.BreadType;
import java.util.List;
import data.Ingredient;

public class MenuOrderScreen {

	/**
	 * 
	 */
	private List<BreadType> displayedBreadTypes;
	/**
	 * 
	 */
	private List<Ingredient> displayedIngredients;
	/**
	 * Getter of displayedBreadTypes
	 */
	public List<BreadType> getDisplayedBreadTypes() {
	 	 return displayedBreadTypes; 
	}
	/**
	 * Setter of displayedBreadTypes
	 */
	public void setDisplayedBreadTypes(List<BreadType> displayedBreadTypes) { 
		 this.displayedBreadTypes = displayedBreadTypes; 
	}
	/**
	 * Getter of displayedIngredients
	 */
	public List<Ingredient> getDisplayedIngredients() {
	 	 return displayedIngredients; 
	}
	/**
	 * Setter of displayedIngredients
	 */
	public void setDisplayedIngredients(List<Ingredient> displayedIngredients) { 
		 this.displayedIngredients = displayedIngredients; 
	}
	/**
	 * 
	 */
	public void showCart() { 
		// TODO Auto-generated method
	 } 

}
