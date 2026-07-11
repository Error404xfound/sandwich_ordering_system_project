package data;

import java.util.Vector;

public class Sandwich {

	/**
	 * 
	 */
	
	private BreadType breadType;
	/**
	 * 
	 */
	
	private boolean isComplete;
	/**
	 * 
	 */
	private Vector<Ingredient> ingredients;
	/**
	 * 
	 */
	private int sandwichID;
	/**
	 * Getter of ingredient
	 */
	
	/**
	 * Getter of breadType
	 */
	public BreadType getBreadType() {
	 	 return breadType; 
	}
	/**
	 * Setter of breadType
	 */
	public void setBreadType(BreadType breadType) { 
		 this.breadType = breadType; 
	}
	/**
	 * Getter of breadtype
	 */
	
	/**
	 * Getter of isComplete
	 */
	public boolean getIsComplete() {
	 	 return isComplete; 
	}
	/**
	 * Setter of isComplete
	 */
	public void setIsComplete(boolean isComplete) { 
		 this.isComplete = isComplete; 
	}
	/**
	 * Getter of ingredients
	 */
	public Vector<Ingredient> getIngredients() {
	 	 return ingredients; 
	}
	/**
	 * Setter of ingredients
	 */
	public void setIngredients(Vector<Ingredient> ingredients) { 
		 this.ingredients = ingredients; 
	}
	/**
	 * 
	 * @return 
	 */
	public float calculatePrice() { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * Getter of sandwichID
	 */
	public int getSandwichID() {
	 	 return sandwichID; 
	}
	/**
	 * Setter of sandwichID
	 */
	public void setSandwichID(int sandwichID) { 
		 this.sandwichID = sandwichID; 
	}
	/**
	 * 
	 * @return 
	 */
	public float calculatePreparationTime() { 
		// TODO Auto-generated method
		return 0;
	 }
	

}
