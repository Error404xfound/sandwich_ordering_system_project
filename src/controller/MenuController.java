package controller;

import java.util.Vector;

import data.DataStorage;
import data.MenuItem;

public class MenuController {

	private DataStorage ds = DataStorage.getInstance();

	public Vector<MenuItem> getAllMenuItems() { 
		Vector<MenuItem> allMenuItems = new Vector<MenuItem>();
		allMenuItems.addAll(this.ds.getAllBreadTypes());
		allMenuItems.addAll(this.ds.getAllIngredients());
		return allMenuItems;
	 } 
}
