package data;

import java.util.Vector;

public class MenuItem {

	/**
	 * 
	 */
	private int menuItemID;
	/**
	 * 
	 */
	private float preparationTimeMins;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String imagePath;
	/**
	 * 
	 */
	private float price;
	/**
	 * 
	 */
	private boolean isVisible;
	/**
	 * 
	 */
	private Vector<String> dietaryTags;
	/**
	 * 
	 */
	public ItemStock itemstock;
	/**
	 * 
	 */
	private float calories;
	/**
	 * 
	 */
	private float fat;
	/**
	 * 
	 */
	private float protein;
	/**
	 * 
	 */
	private float carbohydrates;
	/**
	 * Getter of menuItemID
	 */
	public int getMenuItemID() {
	 	 return menuItemID; 
	}
	/**
	 * Setter of menuItemID
	 */
	public void setMenuItemID(int menuItemID) { 
		 this.menuItemID = menuItemID; 
	}
	/**
	 * Getter of preparationTimeMins
	 */
	public float getPreparationTimeMins() {
	 	 return preparationTimeMins; 
	}
	/**
	 * Setter of preparationTimeMins
	 */
	public void setPreparationTimeMins(float preparationTimeMins) { 
		 this.preparationTimeMins = preparationTimeMins; 
	}
	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * Getter of imagePath
	 */
	public String getImagePath() {
	 	 return imagePath; 
	}
	/**
	 * Setter of imagePath
	 */
	public void setImagePath(String imagePath) { 
		 this.imagePath = imagePath; 
	}
	/**
	 * Getter of price
	 */
	public float getPrice() {
	 	 return price; 
	}
	/**
	 * Setter of price
	 */
	public void setPrice(float price) { 
		 this.price = price; 
	}
	/**
	 * Getter of isVisible
	 */
	public boolean getIsVisible() {
	 	 return isVisible; 
	}
	/**
	 * Setter of isVisible
	 */
	public void setIsVisible(boolean isVisible) { 
		 this.isVisible = isVisible; 
	}
	/**
	 * Getter of dietaryTags
	 */
	public Vector<String> getDietaryTags() {
	 	 return dietaryTags; 
	}
	/**
	 * Setter of dietaryTags
	 */
	public void setDietaryTags(Vector<String> dietaryTags) { 
		 this.dietaryTags = dietaryTags; 
	}
	/**
	 * Getter of itemstock
	 */
	public ItemStock getItemstock() {
	 	 return itemstock; 
	}
	/**
	 * Setter of itemstock
	 */
	public void setItemstock(ItemStock itemstock) { 
		 this.itemstock = itemstock; 
	}
	/**
	 * Getter of calories
	 */
	public float getCalories() {
	 	 return calories; 
	}
	/**
	 * Setter of calories
	 */
	public void setCalories(float calories) { 
		 this.calories = calories; 
	}
	/**
	 * Getter of fat
	 */
	public float getFat() {
	 	 return fat; 
	}
	/**
	 * Setter of fat
	 */
	public void setFat(float fat) { 
		 this.fat = fat; 
	}
	/**
	 * Getter of protein
	 */
	public float getProtein() {
	 	 return protein; 
	}
	/**
	 * Setter of protein
	 */
	public void setProtein(float protein) { 
		 this.protein = protein; 
	}
	/**
	 * Getter of carbohydrates
	 */
	public float getCarbohydrates() {
	 	 return carbohydrates; 
	}
	/**
	 * Setter of carbohydrates
	 */
	public void setCarbohydrates(float carbohydrates) { 
		 this.carbohydrates = carbohydrates; 
	} 

}
