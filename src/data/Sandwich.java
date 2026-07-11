package data;

import java.util.Vector;

public class Sandwich {

	/**
	 * 
	 */
	public Vector<Ingredient> ingredient;
	/**
	 * 
	 */
	private BreadType breadType;
	/**
	 * 
	 */
	public BreadType breadtype;
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
	public Vector<Ingredient> getIngredient() {
	 	 return ingredient; 
	}
	/**
	 * Setter of ingredient
	 */
	public void setIngredient(Vector<Ingredient> ingredient) { 
		 this.ingredient = ingredient; 
	}
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
	public BreadType getBreadtype() {
	 	 return breadtype; 
	}
	/**
	 * Setter of breadtype
	 */
	public void setBreadtype(BreadType breadtype) { 
		 this.breadtype = breadtype; 
	}
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
	/**
	 * 
	 * @return 
	 */
	public Sandwich getAllSandwiches() { 
		// TODO Auto-generated method
		return null;
	 } 

}
