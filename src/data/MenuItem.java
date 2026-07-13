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
	
	public MenuItem
	(
			String name,
			float price,
			Vector<String> dietaryTags,
			float preparationTimeMins,
			boolean isVisible,
			String imagePath,
			int menuItemID
	) 
	{
		this.name = name;
		this.price = price;
		this.dietaryTags = new Vector<String>(dietaryTags);
		this.isVisible = isVisible;
		this.imagePath = imagePath;
		this.menuItemID = menuItemID;
		this.preparationTimeMins = preparationTimeMins;
	}
	
	
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
	
	
}
