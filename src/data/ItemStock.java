package data;

import data.MenuItem;

public class ItemStock {

	
	private String supplier;
	private int quantity;
	private MenuItem menuItem;
	private float cost;
	private int itemStockID;
	
	public ItemStock(MenuItem menuItem, int quantity, float cost, String supplier, int itemStockID) {
		this.menuItem = menuItem;
		this.quantity = quantity;
		this.cost = cost;
		this.supplier = supplier;
		this.itemStockID = itemStockID;
	}
	
	
	public int getItemStockID() {
	 	 return itemStockID; 
	}
	
	public void setItemStockID(int itemStockID) { 
		 this.itemStockID = itemStockID; 
	}
	
	public String getSupplier() {
	 	 return supplier; 
	}
	
	public void setSupplier(String supplier) { 
		 this.supplier = supplier; 
	}
	
	public int getQuantity() {
	 	 return quantity; 
	}
	
	public void setQuantity(int quantity) { 
		 this.quantity = quantity; 
	}

	
	public MenuItem getMenuitem() {
	 	 return menuItem; 
	}
	
	public void setMenuitem(MenuItem menuItem) { 
		 this.menuItem = menuItem; 
	}
	
	public float getCost() {
	 	 return cost; 
	}
	
	public void setCost(float cost) { 
		 this.cost = cost; 
	}
	
	
}
