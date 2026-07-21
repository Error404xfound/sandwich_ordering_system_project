package controller;

import data.DataStorage;

import java.util.Vector;

import data.Ingredient;

public class IngredientController {

	private DataStorage ds = DataStorage.getInstance();

	private String numberPattern = "\\d+\\.?\\d*|\\.\\d+";

	public Vector<Ingredient> getAllIngredients() { 
		return this.ds.getAllIngredients();
	 }

	public boolean deleteIngredient(int ID) {
		return this.ds.deleteIngredient(ID);
	 }

	public String addIngredient
	(
		String name,
		String priceText,
		Vector<String> dietaryTags,
		String prepTimeText,
		boolean isVisible,
		String imagePath
	)
	{
		if (name == null || name.trim().isEmpty()) {
			return "Name cannot be empty.";
		}

		if (priceText == null || priceText.trim().isEmpty()) {
			return "Price cannot be empty.";
		}
		if (!priceText.trim().matches(numberPattern)) {
			return "Price must be a valid number.";
		}
		float price = Float.parseFloat(priceText.trim());
		if (price <= 0) {
			return "Price must be greater than 0.";
		}

		if (prepTimeText == null || prepTimeText.trim().isEmpty()) {
			return "Base preparation time cannot be empty.";
		}
		if (!prepTimeText.trim().matches(numberPattern)) {
			return "Base preparation time must be a valid number.";
		}
		float preparationTimeMins = Float.parseFloat(prepTimeText.trim());
		if (preparationTimeMins <= 0) {
			return "Base preparation time must be greater than 0.";
		}

		Ingredient ingredient = new Ingredient(name.trim(), price, dietaryTags, preparationTimeMins, isVisible, imagePath, 0);
		this.ds.addIngredient(ingredient);
		return null;
	}

	public String editIngredient
	(
		int ID,
		String name,
		String priceText,
		Vector<String> dietaryTags,
		String prepTimeText,
		boolean isVisible,
		String imagePath
	)
	{
		if (name == null || name.trim().isEmpty()) {
			return "Name cannot be empty.";
		}

		if (priceText == null || priceText.trim().isEmpty()) {
			return "Price cannot be empty.";
		}
		if (!priceText.trim().matches(numberPattern)) {
			return "Price must be a valid number.";
		}
		float price = Float.parseFloat(priceText.trim());
		if (price <= 0) {
			return "Price must be greater than 0.";
		}

		if (prepTimeText == null || prepTimeText.trim().isEmpty()) {
			return "Base preparation time cannot be empty.";
		}
		if (!prepTimeText.trim().matches(numberPattern)) {
			return "Base preparation time must be a valid number.";
		}
		float preparationTimeMins = Float.parseFloat(prepTimeText.trim());
		if (preparationTimeMins <= 0) {
			return "Base preparation time must be greater than 0.";
		}

		Ingredient updatedIngredient = new Ingredient(name.trim(), price, dietaryTags, preparationTimeMins, isVisible, imagePath, ID);
		if (!this.ds.editIngredient(ID, updatedIngredient)) {
			return "Ingredient could not be found. Please try again.";
		}
		return null;
	}

	public Vector<Ingredient> filterIngredients(Vector<String> dietaryTags) {
	    Vector<Ingredient> filteredIngredients = new Vector<Ingredient>();
	    for (int i = 0; i < ds.getAllIngredients().size(); i++) {
	        Ingredient temp = ds.getAllIngredients().get(i);
	        if (temp.getDietaryTags().containsAll(dietaryTags)) {
	            filteredIngredients.add(temp);
	        }
	    }
	    return filteredIngredients;
	}

}