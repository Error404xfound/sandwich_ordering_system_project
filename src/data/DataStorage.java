package data;

import java.util.Vector;


public class DataStorage {

	
	private Vector<Customer> customers;
	private Vector<LoyaltyDiscountTier> loyaltyDiscountTiers;
	private Vector<ItemStock> itemStock;
	private Vector<BreadType> breadTypes;
	private Vector<Staff> staff;
	private Vector<LoyaltyDiscount> loyaltyDiscounts;
	private Vector<Order> orders;
	private Vector<Ingredient> ingredients;

	private int nextMenuItemID;
	private int nextOrderID;
	private int nextDiscountID;
	private int nextItemStockID;
	private int nextTierID;
	private int nextUserID;
	private int nextSandwichID;
	
	public Customer getCustomer(int ID) {
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			if (customer.getUserID() == ID) {
				return customer;
			}
		}
		return null;
	}
	public Vector<Customer> getAllCustomers() {
	 	 return customers; 
	}
	public void setCustomers(Vector<Customer> customers) { 
		 this.customers = customers; 
	}
	
	
	public int getNextMenuItemID() {
	 	 return nextMenuItemID; 
	}
	public void setNextMenuItemID(int nextMenuItemID) { 
		 this.nextMenuItemID = nextMenuItemID; 
	}
	public int getNextOrderID() {
	 	 return nextOrderID; 
	}
	public void setNextOrderID(int nextOrderID) { 
		 this.nextOrderID = nextOrderID; 
	}
	public LoyaltyDiscountTier getLoyaltyDiscountTier(int ID) {
		for (int i = 0; i < loyaltyDiscountTiers.size(); i++) {
			LoyaltyDiscountTier loyaltyDiscountTier = loyaltyDiscountTiers.get(i);
			if (loyaltyDiscountTier.getTierID() == ID) {
				return loyaltyDiscountTier;
			}
		}
		return null;
	}
	public Vector<LoyaltyDiscountTier> getAllLoyaltyDiscountTiers() {
	 	 return loyaltyDiscountTiers; 
	}
	public void setLoyaltyDiscountTiers(Vector<LoyaltyDiscountTier> loyaltyDiscountTiers) { 
		 this.loyaltyDiscountTiers = loyaltyDiscountTiers; 
	}
	public int getNextDiscountID() {
	 	 return nextDiscountID; 
	}
	public void setNextDiscountID(int nextDiscountID) { 
		 this.nextDiscountID = nextDiscountID; 
	}
	public ItemStock getItemStock(int ID) {
		for (int i = 0; i < itemStock.size(); i++) {
			ItemStock itemStockObj = itemStock.get(i);
			if (itemStockObj.getItemStockID() == ID) {
				return itemStockObj;
			}
		}
		return null;
	}
	public Vector<ItemStock> getAllItemStock() {
	 	 return itemStock; 
	}
	public void setItemStock(Vector<ItemStock> itemStock) { 
		 this.itemStock = itemStock; 
	}
	public int getNextItemStockID() {
	 	 return nextItemStockID; 
	}
	public void setNextItemStockID(int nextItemStockID) { 
		 this.nextItemStockID = nextItemStockID; 
	}
	public BreadType getBreadType(int ID) {
		for (int i = 0; i < breadTypes.size(); i++) {
			BreadType breadType = breadTypes.get(i);
			if (breadType.getMenuItemID() == ID) {
				return breadType;
			}
		}
		return null;
	}
	public Vector<BreadType> getAllBreadTypes() {
	 	 return breadTypes; 
	}
	public void setBreadTypes(Vector<BreadType> breadTypes) { 
		 this.breadTypes = breadTypes; 
	}
	public Staff getStaff(int ID) {
		for (int i = 0; i < staff.size(); i++) {
			Staff staffObj = staff.get(i);
			if (staffObj.getUserID() == ID) {
				return staffObj;
			}
		}
		return null;
	}
	public Vector<Staff> getAllStaff() {
	 	 return staff; 
	}
	public void setStaff(Vector<Staff> staff) { 
		 this.staff = staff; 
	}
	public int getNextTierID() {
	 	 return nextTierID; 
	}
	public void setNextTierID(int nextTierID) { 
		 this.nextTierID = nextTierID; 
	}
	public LoyaltyDiscount getLoyaltyDiscount(int ID) {
		for (int i = 0; i < loyaltyDiscounts.size(); i++) {
			LoyaltyDiscount loyaltyDiscount = loyaltyDiscounts.get(i);
			if (loyaltyDiscount.getDiscountID() == ID) {
				return loyaltyDiscount;
			}
		}
		return null;
	}
	public Vector<LoyaltyDiscount> getAllLoyaltyDiscounts() {
	 	 return loyaltyDiscounts; 
	}
	public void setLoyaltyDiscounts(Vector<LoyaltyDiscount> loyaltyDiscounts) { 
		 this.loyaltyDiscounts = loyaltyDiscounts; 
	}
	public int getNextUserID() {
	 	 return nextUserID; 
	}
	public void setNextUserID(int nextUserID) { 
		 this.nextUserID = nextUserID; 
	}
	public Order getOrder(int ID) {
		for (int i = 0; i < orders.size(); i++) {
			Order order = orders.get(i);
			if (order.getOrderID() == ID) {
				return order;
			}
		}
		return null;
	}
	public Vector<Order> getAllOrders() {
	 	 return orders; 
	}
	public void setOrders(Vector<Order> orders) { 
		 this.orders = orders; 
	}
	public Ingredient getIngredient(int ID) {
		for (int i = 0; i < ingredients.size(); i++) {
			Ingredient ingredient = ingredients.get(i);
			if (ingredient.getMenuItemID() == ID) {
				return ingredient;
			}
		}
		return null;
	}
	public Vector<Ingredient> getAllIngredients() {
	 	 return ingredients; 
	}
	public void setIngredients(Vector<Ingredient> ingredients) { 
		 this.ingredients = ingredients; 
	}
	
	
	public void deleteLoyaltyDiscount(int ID) { 
	 }
	public void addStaff(Staff staff) { 
	 }
	public void addBreadType(BreadType breadType) { 
	 }
	public Vector<MenuItem> getAllMenuItems() { 
		return null;
	 }
	public void editLoyaltyDiscountTier(int ID, LoyaltyDiscountTier loyaltyDiscountTier) { 
	 }
	public void editCustomer(int ID, Customer customer) { 
	 }
	public void deleteItemStock(int ID) { 
	 }
	public void editOrder(int ID, Order order) { 
	 }
	public void deleteLoyaltyDiscountTier(int ID) { 
	 }
	
	public void addIngredient(Ingredient ingredient) { 
	 }
	public void addCustomer(Customer customer) { 
	 }
	public void deleteIngredient(int ID) { 
	 }
	public void addItemStock(ItemStock itemStock) { 
	 }
	
	public void editBreadType(int ID, BreadType breadType) { 
	 }
	public void deleteStaff(int ID) { 
	 }
	public void addOrder(Order order) { 
	 }
	public void deleteCustomer(int ID) { 
	 }
	public void addLoyaltyDiscount(LoyaltyDiscount loyaltyDiscount) { 
	 }
	public void deleteBreadType(int ID) { 
	 }
	public void deleteOrder(int ID) { 
	 }
	public void addLoyaltyDiscountTier(LoyaltyDiscountTier loyaltyDiscountTier) { 
	 }
	public int getNextSandwichID() {
	 	 return nextSandwichID; 
	}
	public void setNextSandwichID(int nextSandwichID) { 
		 this.nextSandwichID = nextSandwichID; 
	}
	public void editStaff(int ID, Staff staff) { 
	 }
	 
	
	public void deleteSandwich(int ID) { 
	 }
	public void editSandwich(int ID, Sandwich sandwich) { 
	 }
	public void addSandwich(Sandwich sandwich) { 
	 }
	
	public void editIngredient(int ID, Ingredient ingredient) { 
	 }
	
	public void editItemStock(int ID, ItemStock itemStock) { 
	 } 
	
	public void editLoyaltyDiscount(int ID, LoyaltyDiscount loyaltyDiscount) {
		
	}

}