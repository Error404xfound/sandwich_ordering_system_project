package data;

import java.util.Vector;

public class BreadType extends MenuItem {
	
	private float toastPreparationTime;
	
	public BreadType
	(
		String name,
		float price,
		Vector<String> dietaryTags,
		float preparationTimeMins,
		boolean isVisible,
		String imagePath,
		int menuItemID,
		float toastPreparationTime
	)
	{
		super(name, price, dietaryTags, preparationTimeMins, isVisible, imagePath, menuItemID);
		this.toastPreparationTime = toastPreparationTime;
		
	}

	/**
	 * Getter of isToasted
	 */
	

	/**
	 * Getter of toastPreparationTime
	 */
	public float getToastPreparationTime() {
	 	 return toastPreparationTime; 
	}

	/**
	 * Setter of toastPreparationTime
	 */
	public void setToastPreparationTime(float toastPreparationTime) { 
		 this.toastPreparationTime = toastPreparationTime; 
	}

	

}
