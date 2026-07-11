package controller;

import data.DataStorage;
import data.LoyaltyDiscount;

public class LoyaltyDiscountController {

	
	private DataStorage dataStorage;
	/**
	 * Getter of datastorage
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
	 * 
	 * @param loyaltyDiscount 
	 */
	public void addLoyaltyDiscount(LoyaltyDiscount loyaltyDiscount) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param loyaltyDiscount 
	 * @param ID 
	 */
	public void editLoyaltyDiscount(LoyaltyDiscount loyaltyDiscount, int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public LoyaltyDiscount getAllLoyaltyDiscounts() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteLoyaltyDiscount(int ID) { 
		// TODO Auto-generated method
	 } 

}
