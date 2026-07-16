
package controller;

import data.DataStorage;

import java.util.Vector;

import data.BreadType;

public class BreadTypeController {

	private DataStorage ds = DataStorage.getInstance();

	// shared pattern for numeric fields; accepts "4", "4.", "4.5", ".5"
	// rejects empty, ".", letters, commas, and negative values (no minus sign allowed)
	private String numberPattern = "\\d+\\.?\\d*|\\.\\d+";

	public Vector<BreadType> getAllBreadTypes() { 
		return this.ds.getAllBreadTypes();
	 }

	public boolean deleteBreadType(int ID) {
		return this.ds.deleteBreadType(ID);
	 }

	public String addBreadType
	(
		String name,
		String priceText,
		Vector<String> dietaryTags,
		String prepTimeText,
		boolean isVisible,
		String imagePath,
		String toastTimeText
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

		
		if (toastTimeText == null || toastTimeText.trim().isEmpty()) {
			return "Time taken to toast cannot be empty.";
		}
		if (!toastTimeText.trim().matches(numberPattern)) {
			return "Time taken to toast must be a valid number.";
		}
		float toastPreparationTime = Float.parseFloat(toastTimeText.trim());

		BreadType breadType = new BreadType(name.trim(), price, dietaryTags, preparationTimeMins, isVisible, imagePath, 0, toastPreparationTime);
		this.ds.addBreadType(breadType);
		return null;
	}

	public Vector<BreadType> filterBreadTypes(Vector<String> dietaryTags) {
	    Vector<BreadType> filteredBreadTypes = new Vector<BreadType>();
	    for (int i = 0; i < ds.getAllBreadTypes().size(); i++) {
	        BreadType temp = ds.getAllBreadTypes().get(i);
	        if (temp.getDietaryTags().containsAll(dietaryTags)) {
	            filteredBreadTypes.add(temp);
	        }
	    }
	    return filteredBreadTypes;
	}

	public boolean editBreadType(int ID, BreadType breadType)
		{
		    return this.ds.editBreadType(ID, breadType);
		}

	// CHANGED: new overload — returns String (null = success, otherwise error message);
	// accepts raw Strings for the numeric fields so the view no longer parses them.
	// Mirrors the same validation as addBreadType.
	public String editBreadType
	(
		int ID,
		String name,
		String priceText,
		Vector<String> dietaryTags,
		String prepTimeText,
		boolean isVisible,
		String imagePath,
		String toastTimeText
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

		if (toastTimeText == null || toastTimeText.trim().isEmpty()) {
			return "Time taken to toast cannot be empty.";
		}
		if (!toastTimeText.trim().matches(numberPattern)) {
			return "Time taken to toast must be a valid number.";
		}
		float toastPreparationTime = Float.parseFloat(toastTimeText.trim());

		BreadType updatedBreadType = new BreadType(name.trim(), price, dietaryTags, preparationTimeMins, isVisible, imagePath, ID, toastPreparationTime);
		if (!this.ds.editBreadType(ID, updatedBreadType)) {
			return "Bread type could not be found. Please try again.";
		}
		return null;
	}
	
}