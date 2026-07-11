package controller;

import data.DataStorage;
import data.Ingredient;

public class IngredientController {

	/**
	 * 
	 */
	private DataStorage dataStorage;
	/**
	 * 
	 */
	public DataStorage datastorage;
	/**
	 * Getter of dataStorage
	 */
	public DataStorage getDataStorage() {
	 	 return dataStorage; 
	}
	/**
	 * Setter of dataStorage
	 */
	public void setDataStorage(DataStorage dataStorage) { 
		 this.dataStorage = dataStorage; 
	}
	/**
	 * Getter of datastorage
	 */
	public DataStorage getDatastorage() {
	 	 return datastorage; 
	}
	/**
	 * Setter of datastorage
	 */
	public void setDatastorage(DataStorage datastorage) { 
		 this.datastorage = datastorage; 
	}
	/**
	 * 
	 * @param ID 
	 */
	public void deleteIngredient(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public Ingredient getAllIngredients() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ingredient 
	 */
	public void addIngredient(Ingredient ingredient) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ingredient 
	 * @param ID 
	 */
	public void editIngredient(Ingredient ingredient, int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param dietaryTags 
	 * @return 
	 */
	public Ingredient filterIngredient(String dietaryTags) { 
		// TODO Auto-generated method
		return null;
	 } 

}
