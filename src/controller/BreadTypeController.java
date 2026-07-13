package controller;

import data.DataStorage;

import java.util.Vector;

import data.BreadType;

public class BreadTypeController {

	private DataStorage ds = DataStorage.getInstance();

	public Vector<BreadType> getAllBreadTypes() { 
		return this.ds.getAllBreadTypes();
	 }

	public void deleteBreadType(int ID) { 
	 }

	public void addBreadType
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
		BreadType breadType = new BreadType(name, price, dietaryTags, preparationTimeMins, isVisible, imagePath, menuItemID, toastPreparationTime);
		this.ds.addBreadType(breadType);
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

	public void editBreadType(int ID, BreadType breadType) { 
	 }
	
}
