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
		int price,
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

	public BreadType filterBreadType(String dietaryTags) { 
		return null;
	 }

	public void editBreadType(int ID, BreadType breadType) { 
	 }
	
}
