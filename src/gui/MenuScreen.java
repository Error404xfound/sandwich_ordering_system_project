package gui;

import data.BreadType;
import java.util.List;
import data.Ingredient;

public class MenuScreen {

	/**
	 * 
	 */
	private List<BreadType> displayedBreadType;
	/**
	 * 
	 */
	private List<Ingredient> displayedIngredient;
	/**
	 * Getter of displayedBreadType
	 */
	public List<BreadType> getDisplayedBreadType() {
	 	 return displayedBreadType; 
	}
	/**
	 * Setter of displayedBreadType
	 */
	public void setDisplayedBreadType(List<BreadType> displayedBreadType) { 
		 this.displayedBreadType = displayedBreadType; 
	}
	/**
	 * Getter of displayedIngredient
	 */
	public List<Ingredient> getDisplayedIngredient() {
	 	 return displayedIngredient; 
	}
	/**
	 * Setter of displayedIngredient
	 */
	public void setDisplayedIngredient(List<Ingredient> displayedIngredient) { 
		 this.displayedIngredient = displayedIngredient; 
	}
	/**
	 * 
	 * @param idx 
	 * @param ingredient 
	 */
	public void showEditIngredient(int idx, Ingredient ingredient) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param breadType 
	 * @param idx 
	 */
	public void showEditBreadType(BreadType breadType, int idx) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showAddBreadType() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showAddIngredient() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param idx 
	 * @param breadType 
	 */
	public void showEditBreadType(int idx, BreadType breadType) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ingredient 
	 * @param idx 
	 */
	public void showEditIngredient(Ingredient ingredient, int idx) { 
		// TODO Auto-generated method
	 } 

}
