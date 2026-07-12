package data;

import java.util.Vector;


public class DataStorage {
	
	private static DataStorage instance;

	
	private Vector<Customer> customers;
	private Vector<LoyaltyDiscountTier> loyaltyDiscountTiers;
	private Vector<ItemStock> itemStock;
	private Vector<BreadType> breadTypes;
	private Vector<Staff> staffPlural;
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

	private DataStorage() {
		customers = new Vector<Customer>();
		staffPlural = new Vector<Staff>();
		orders = new Vector<Order>();
		itemStock = new Vector<ItemStock>();
		ingredients = new Vector<Ingredient>();
		breadTypes = new Vector<BreadType>();
		loyaltyDiscounts = new Vector<LoyaltyDiscount>();
		loyaltyDiscountTiers = new Vector<LoyaltyDiscountTier>();
	}

	public static DataStorage getInstance() {
		if (instance == null) {
			instance = new DataStorage();
		}
		return instance;
	}


	// ===== Customer =====
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
	public void addCustomer(Customer customer) {
		nextUserID++;
		customer.setUserID(nextUserID);
		customers.add(customer);
	 }
	public void editCustomer(int ID, Customer customer) { 
	 }
	public void deleteCustomer(int ID) { 
	 }
	public Customer getCustomerbyEmail(String email) {
		for (int i = 0; i < customers.size(); i++) {
			Customer temp = customers.get(i);
			if (temp.getEmail() == email) {
				return temp;
			}
		}
		return null;
	}


	// ===== Staff =====
	public Staff getStaff(int ID) {
		for (int i = 0; i < staffPlural.size(); i++) {
			Staff staffObj = staffPlural.get(i);
			if (staffObj.getUserID() == ID) {
				return staffObj;
			}
		}
		return null;
	}
	public Vector<Staff> getAllStaff() {
	 	 return staffPlural; 
	}
	public void setStaff(Vector<Staff> staff) { 
		 this.staffPlural = staff; 
	}
	public void addStaff(Staff staff) { 
		nextUserID++;
		staff.setUserID(nextUserID);
		staffPlural.add(staff);
	 }
	public void editStaff(int ID, Staff staff) { 
	 }
	public void deleteStaff(int ID) { 
	 }
	public Staff getStaffbyEmail(String email) {
		for (int i = 0; i < staffPlural.size(); i++) {
			Staff temp = staffPlural.get(i);
			if (temp.getEmail() == email) {
				return temp;
			}
		}
		return null;
	}


	// ===== Shared User ID counter (Customer / Staff) =====
	public int getNextUserID() {
	 	 return nextUserID; 
	}
	public void setNextUserID(int nextUserID) { 
		 this.nextUserID = nextUserID; 
	}


	// ===== Order =====
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
	public void addOrder(Order order) { 
	 }
	public void editOrder(int ID, Order order) { 
	 }
	public void deleteOrder(int ID) { 
	 }
	public int getNextOrderID() {
	 	 return nextOrderID; 
	}
	public void setNextOrderID(int nextOrderID) { 
		 this.nextOrderID = nextOrderID; 
	}


	// ===== ItemStock =====
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
	public void addItemStock(ItemStock itemStock) { 
	 }
	public void editItemStock(int ID, ItemStock itemStock) { 
	 } 
	public void deleteItemStock(int ID) { 
	 }
	public int getNextItemStockID() {
	 	 return nextItemStockID; 
	}
	public void setNextItemStockID(int nextItemStockID) { 
		 this.nextItemStockID = nextItemStockID; 
	}


	// ===== Ingredient =====
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
	public void addIngredient(Ingredient ingredient) { 
	 }
	public void editIngredient(int ID, Ingredient ingredient) { 
	 }
	public void deleteIngredient(int ID) { 
	 }


	// ===== BreadType =====
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
	public void addBreadType(BreadType breadType) { 
	 }
	public void editBreadType(int ID, BreadType breadType) { 
	 }
	public void deleteBreadType(int ID) { 
	 }


	// ===== Shared MenuItem ID counter (Ingredient / BreadType / MenuItem) =====
	public int getNextMenuItemID() {
	 	 return nextMenuItemID; 
	}
	public void setNextMenuItemID(int nextMenuItemID) { 
		 this.nextMenuItemID = nextMenuItemID; 
	}


	// ===== MenuItem =====
	public Vector<MenuItem> getAllMenuItems() { 
		return null;
	 }


	// ===== Sandwich =====
	public void addSandwich(Sandwich sandwich) { 
	 }
	public void editSandwich(int ID, Sandwich sandwich) { 
	 }
	public void deleteSandwich(int ID) { 
	 }
	public int getNextSandwichID() {
	 	 return nextSandwichID; 
	}
	public void setNextSandwichID(int nextSandwichID) { 
		 this.nextSandwichID = nextSandwichID; 
	}


	// ===== LoyaltyDiscount =====
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
	public void addLoyaltyDiscount(LoyaltyDiscount loyaltyDiscount) { 
	 }
	public void editLoyaltyDiscount(int ID, LoyaltyDiscount loyaltyDiscount) {
	 }
	public void deleteLoyaltyDiscount(int ID) { 
	 }
	public int getNextDiscountID() {
	 	 return nextDiscountID; 
	}
	public void setNextDiscountID(int nextDiscountID) { 
		 this.nextDiscountID = nextDiscountID; 
	}


	// ===== LoyaltyDiscountTier =====
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
	public void addLoyaltyDiscountTier(LoyaltyDiscountTier loyaltyDiscountTier) { 
	 }
	public void editLoyaltyDiscountTier(int ID, LoyaltyDiscountTier loyaltyDiscountTier) { 
	 }
	public void deleteLoyaltyDiscountTier(int ID) { 
	 }
	public int getNextTierID() {
	 	 return nextTierID; 
	}
	public void setNextTierID(int nextTierID) { 
		 this.nextTierID = nextTierID; 
	}

	

}