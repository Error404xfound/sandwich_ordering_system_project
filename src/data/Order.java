package data;

import java.util.Vector;

public class Order {

	/**
	 * 
	 */
	public Customer customer;
	/**
	 * 
	 */
	public Vector<Sandwich> sandwich;
	/**
	 * 
	 */
	private Vector<Sandwich> sandwiches;
	/**
	 * 
	 */
	private int customerID;
	/**
	 * 
	 */
	private int orderID;
	/**
	 * 
	 */
	private int forCustomerID;
	/**
	 * Getter of customer
	 */
	public Customer getCustomer() {
	 	 return customer; 
	}
	/**
	 * Setter of customer
	 */
	public void setCustomer(Customer customer) { 
		 this.customer = customer; 
	}
	/**
	 * Getter of sandwich
	 */
	public Vector<Sandwich> getSandwich() {
	 	 return sandwich; 
	}
	/**
	 * Setter of sandwich
	 */
	public void setSandwich(Vector<Sandwich> sandwich) { 
		 this.sandwich = sandwich; 
	}
	/**
	 * Getter of sandwiches
	 */
	public Vector<Sandwich> getSandwiches() {
	 	 return sandwiches; 
	}
	/**
	 * Setter of sandwiches
	 */
	public void setSandwiches(Vector<Sandwich> sandwiches) { 
		 this.sandwiches = sandwiches; 
	}
	/**
	 * Getter of customerID
	 */
	public int getCustomerID() {
	 	 return customerID; 
	}
	/**
	 * Setter of customerID
	 */
	public void setCustomerID(int customerID) { 
		 this.customerID = customerID; 
	}
	/**
	 * Getter of orderID
	 */
	public int getOrderID() {
	 	 return orderID; 
	}
	/**
	 * Setter of orderID
	 */
	public void setOrderID(int orderID) { 
		 this.orderID = orderID; 
	}
	/**
	 * 
	 * @return 
	 */
	public float calculateTotalBasePrice() { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * Getter of forCustomerID
	 */
	public int getForCustomerID() {
	 	 return forCustomerID; 
	}
	/**
	 * Setter of forCustomerID
	 */
	public void setForCustomerID(int forCustomerID) { 
		 this.forCustomerID = forCustomerID; 
	}
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
	 * @return 
	 */
	public boolean isComplete() { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 * @return 
	 */
	public float calculateTotalPreparationTime() { 
		// TODO Auto-generated method
		return 0;
	 } 

}
