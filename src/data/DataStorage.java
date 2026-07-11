package data;

import java.util.Vector;

import data.Customer;
import data.ItemStock;
import data.Staff;
import data.Order;
import data.Ingredient;
import data.MenuItem;
import data.BreadType;

public class DataStorage {

	/**
	 * 
	 */
	private Vector<Customer> customers;
	/**
	 * 
	 */
	
	private int nextMenuItemID;
	/**
	 * 
	 */
	private int nextOrderID;
	/**
	 * 
	 */
	private Vector<LoyaltyDiscountTier> loyaltyDiscountTiers;
	/**
	 * 
	 */
	private int nextDiscountID;
	/**
	 * 
	 */
	private Vector<ItemStock> itemStock;
	/**
	 * 
	 */
	private int nextItemStockID;
	/**
	 * 
	 */
	private Vector<BreadType> breadTypes;
	/**
	 * 
	 */
	private Vector<Staff> staff;
	/**
	 * 
	 */
	private int nextTierID;
	/**
	 * 
	 */
	private Vector<LoyaltyDiscount> loyaltyDiscounts;
	/**
	 * 
	 */
	private int nextUserID;
	/**
	 * 
	 */
	private Vector<Order> orders;
	/**
	 * 
	 */
	private Vector<Ingredient> ingredients;
	/**
	 * 
	 */
	private int nextSandwichID;
	/**
	 * Getter of customers
	 */
	public Vector<Customer> getCustomers() {
	 	 return customers; 
	}
	/**
	 * Setter of customers
	 */
	public void setCustomers(Vector<Customer> customers) { 
		 this.customers = customers; 
	}
	/**
	 * Getter of ingredient
	 */
	
	
	/**
	 * Getter of nextMenuItemID
	 */
	public int getNextMenuItemID() {
	 	 return nextMenuItemID; 
	}
	/**
	 * Setter of nextMenuItemID
	 */
	public void setNextMenuItemID(int nextMenuItemID) { 
		 this.nextMenuItemID = nextMenuItemID; 
	}
	/**
	 * Getter of nextOrderID
	 */
	public int getNextOrderID() {
	 	 return nextOrderID; 
	}
	/**
	 * Setter of nextOrderID
	 */
	public void setNextOrderID(int nextOrderID) { 
		 this.nextOrderID = nextOrderID; 
	}
	/**
	 * Getter of loyaltyDiscountTiers
	 */
	public Vector<LoyaltyDiscountTier> getLoyaltyDiscountTiers() {
	 	 return loyaltyDiscountTiers; 
	}
	/**
	 * Setter of loyaltyDiscountTiers
	 */
	public void setLoyaltyDiscountTiers(Vector<LoyaltyDiscountTier> loyaltyDiscountTiers) { 
		 this.loyaltyDiscountTiers = loyaltyDiscountTiers; 
	}
	/**
	 * Getter of nextDiscountID
	 */
	public int getNextDiscountID() {
	 	 return nextDiscountID; 
	}
	/**
	 * Setter of nextDiscountID
	 */
	public void setNextDiscountID(int nextDiscountID) { 
		 this.nextDiscountID = nextDiscountID; 
	}
	/**
	 * Getter of itemStock
	 */
	public Vector<ItemStock> getItemStock() {
	 	 return itemStock; 
	}
	/**
	 * Setter of itemStock
	 */
	public void setItemStock(Vector<ItemStock> itemStock) { 
		 this.itemStock = itemStock; 
	}
	/**
	 * Getter of nextItemStockID
	 */
	public int getNextItemStockID() {
	 	 return nextItemStockID; 
	}
	/**
	 * Setter of nextItemStockID
	 */
	public void setNextItemStockID(int nextItemStockID) { 
		 this.nextItemStockID = nextItemStockID; 
	}
	/**
	 * Getter of breadTypes
	 */
	public Vector<BreadType> getBreadTypes() {
	 	 return breadTypes; 
	}
	/**
	 * Setter of breadTypes
	 */
	public void setBreadTypes(Vector<BreadType> breadTypes) { 
		 this.breadTypes = breadTypes; 
	}
	/**
	 * Getter of staff
	 */
	public Vector<Staff> getStaff() {
	 	 return staff; 
	}
	/**
	 * Setter of staff
	 */
	public void setStaff(Vector<Staff> staff) { 
		 this.staff = staff; 
	}
	/**
	 * Getter of nextTierID
	 */
	public int getNextTierID() {
	 	 return nextTierID; 
	}
	/**
	 * Setter of nextTierID
	 */
	public void setNextTierID(int nextTierID) { 
		 this.nextTierID = nextTierID; 
	}
	/**
	 * Getter of loyaltyDiscounts
	 */
	public Vector<LoyaltyDiscount> getLoyaltyDiscounts() {
	 	 return loyaltyDiscounts; 
	}
	/**
	 * Setter of loyaltyDiscounts
	 */
	public void setLoyaltyDiscounts(Vector<LoyaltyDiscount> loyaltyDiscounts) { 
		 this.loyaltyDiscounts = loyaltyDiscounts; 
	}
	/**
	 * Getter of nextUserID
	 */
	public int getNextUserID() {
	 	 return nextUserID; 
	}
	/**
	 * Setter of nextUserID
	 */
	public void setNextUserID(int nextUserID) { 
		 this.nextUserID = nextUserID; 
	}
	/**
	 * Getter of orders
	 */
	public Vector<Order> getOrders() {
	 	 return orders; 
	}
	/**
	 * Setter of orders
	 */
	public void setOrders(Vector<Order> orders) { 
		 this.orders = orders; 
	}
	/**
	 * Getter of ingredients
	 */
	public Vector<Ingredient> getIngredients() {
	 	 return ingredients; 
	}
	/**
	 * Setter of ingredients
	 */
	public void setIngredients(Vector<Ingredient> ingredients) { 
		 this.ingredients = ingredients; 
	}
	
	
	public void deleteLoyaltyDiscount(int ID) { 
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
	 * @param staff 
	 */
	public void addStaff(Staff staff) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param breadType 
	 */
	public void addBreadType(BreadType breadType) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public MenuItem getAllMenuItems() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 * @param loyaltyDiscountTier 
	 */
	public void editLoyaltyDiscountTier(int ID, LoyaltyDiscountTier loyaltyDiscountTier) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 * @param customer 
	 */
	public void editCustomer(int ID, Customer customer) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteItemStock(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 * @param order 
	 */
	public void editOrder(int ID, Order order) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public LoyaltyDiscountTier getAllLoyaltyDiscountTiers() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteLoyaltyDiscountTier(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public BreadType getAllBreadTypes() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @return 
	 */
	public Staff getAllStaff() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param loyaltyDiscount 
	 * @param ID 
	 */
	
	/**
	 * 
	 * @param ingredient 
	 */
	public void addIngredient(Ingredient ingredient) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public Customer getAllCustomers() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param customer 
	 */
	public void addCustomer(Customer customer) { 
		// TODO Auto-generated method
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
	 * @param itemStock 
	 */
	public void addItemStock(ItemStock itemStock) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ingredient 
	 * @param ID 
	 */
	
	/**
	 * 
	 * @return 
	 */
	public Order getAllOrders() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 * @param breadType 
	 */
	public void editBreadType(int ID, BreadType breadType) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteStaff(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param order 
	 */
	public void addOrder(Order order) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public ItemStock getAllItemStock() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param ID 
	 */
	public void deleteCustomer(int ID) { 
		// TODO Auto-generated method
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
	 * @param ID 
	 */
	public void deleteBreadType(int ID) { 
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
	public void deleteOrder(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param loyaltyDiscountTier 
	 */
	public void addLoyaltyDiscountTier(LoyaltyDiscountTier loyaltyDiscountTier) { 
		// TODO Auto-generated method
	 }
	/**
	 * Getter of nextSandwichID
	 */
	public int getNextSandwichID() {
	 	 return nextSandwichID; 
	}
	/**
	 * Setter of nextSandwichID
	 */
	public void setNextSandwichID(int nextSandwichID) { 
		 this.nextSandwichID = nextSandwichID; 
	}
	/**
	 * 
	 * @param ID 
	 * @param staff 
	 */
	public void editStaff(int ID, Staff staff) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param breadType 
	 * @param ID 
	 */
	 
	
	public void deleteSandwich(int ID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ID 
	 * @param sandwich 
	 */
	public void editSandwich(int ID, Sandwich sandwich) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param sandwich 
	 */
	public void addSandwich(Sandwich sandwich) { 
		// TODO Auto-generated method
	 }
	
	public void editIngredient(int ID, Ingredient ingredient) { 
		// TODO Auto-generated method
	 }
	
	public void editItemStock(int ID, ItemStock itemStock) { 
		// TODO Auto-generated method
	 } 
	
	public void editLoyaltyDiscount(int ID, LoyaltyDiscount loyaltyDiscount) {
		
	}

}
