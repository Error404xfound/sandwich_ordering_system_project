package gui;

import data.BreadType;
import java.util.List;
import data.Ingredient;
import data.Sandwich;
import data.Order;

public class EditSandwichScreen {

	/**
	 * 
	 */
	private List<BreadType> displayedBreadTypes;
	/**
	 * 
	 */
	private int sandwichIndex;
	/**
	 * 
	 */
	private List<Ingredient> displayedIngredients;
	private Sandwich sandwich;
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
	 * Getter of sandwichIndex
	 */
	public int getSandwichIndex() {
	 	 return sandwichIndex; 
	}
	/**
	 * Setter of sandwichIndex
	 */
	public void setSandwichIndex(int sandwichIndex) { 
		 this.sandwichIndex = sandwichIndex; 
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
	 * Getter of sandwich
	 */
	public Sandwich getSandwich() {
	 	 return sandwich; 
	}
	/**
	 * Setter of sandwich
	 */
	public void setSandwich(Sandwich sandwich) { 
		 this.sandwich = sandwich; 
	}
	/**
	 * 
	 * @param order 
	 * @param idx 
	 */
	public void showEditOrder(Order order, int idx) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showCart() { 
		// TODO Auto-generated method
	 } 

}
