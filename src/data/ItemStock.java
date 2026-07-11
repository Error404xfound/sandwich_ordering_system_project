package data;

import data.MenuItem;

public class ItemStock {

	/**
	 * 
	 */
	private int itemStockID;
	/**
	 * 
	 */
	private String supplier;
	/**
	 * 
	 */
	private int quantity;
	private MenuItem item;
	/**
	 * 
	 */
	public MenuItem menuitem;
	/**
	 * 
	 */
	private float cost;
	/**
	 * Getter of itemStockID
	 */
	public int getItemStockID() {
	 	 return itemStockID; 
	}
	/**
	 * Setter of itemStockID
	 */
	public void setItemStockID(int itemStockID) { 
		 this.itemStockID = itemStockID; 
	}
	/**
	 * Getter of supplier
	 */
	public String getSupplier() {
	 	 return supplier; 
	}
	/**
	 * Setter of supplier
	 */
	public void setSupplier(String supplier) { 
		 this.supplier = supplier; 
	}
	/**
	 * Getter of quantity
	 */
	public int getQuantity() {
	 	 return quantity; 
	}
	/**
	 * Setter of quantity
	 */
	public void setQuantity(int quantity) { 
		 this.quantity = quantity; 
	}
	/**
	 * Getter of item
	 */
	public MenuItem getItem() {
	 	 return item; 
	}
	/**
	 * Setter of item
	 */
	public void setItem(MenuItem item) { 
		 this.item = item; 
	}
	/**
	 * Getter of menuitem
	 */
	public MenuItem getMenuitem() {
	 	 return menuitem; 
	}
	/**
	 * Setter of menuitem
	 */
	public void setMenuitem(MenuItem menuitem) { 
		 this.menuitem = menuitem; 
	}
	/**
	 * Getter of cost
	 */
	public float getCost() {
	 	 return cost; 
	}
	/**
	 * Setter of cost
	 */
	public void setCost(float cost) { 
		 this.cost = cost; 
	}
	/**
	 * 
	 * @return 
	 */
	public ItemStock getAllItemStocks() { 
		// TODO Auto-generated method
		return null;
	 } 

}
