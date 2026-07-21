package data;

import java.util.Vector;

public class Ingredient extends MenuItem {

	public Ingredient
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
		super(name, price, dietaryTags, preparationTimeMins, isVisible, imagePath, menuItemID);
	}
}
