package controller;

import java.util.Vector;

import data.DataStorage;
import data.ItemStock;
import data.MenuItem;

public class InventoryController {

	private DataStorage ds = DataStorage.getInstance();

	private String numberPattern = "\\d+\\.?\\d*|\\.\\d+";
	private String wholeNumberPattern = "\\d+";

	public Vector<ItemStock> getAllItemStock() { 
		return this.ds.getAllItemStock();
	 }

	public boolean deleteItemStock(int ID) {
		return this.ds.deleteItemStock(ID);
	 }

	public String addItemStock
	(
		MenuItem menuItem,
		String costText,
		String quantityText,
		String supplier
	)
	{
		if (menuItem == null) {
			return "Please select a menu item.";
		}

		if (costText == null || costText.trim().isEmpty()) {
			return "Unit cost cannot be empty.";
		}
		if (!costText.trim().matches(numberPattern)) {
			return "Unit cost must be a valid number.";
		}
		float cost = Float.parseFloat(costText.trim());
		if (cost <= 0) {
			return "Unit cost must be greater than 0.";
		}

		if (quantityText == null || quantityText.trim().isEmpty()) {
			return "Quantity cannot be empty.";
		}
		if (!quantityText.trim().matches(wholeNumberPattern)) {
			return "Quantity must be a valid whole number.";
		}
		int quantity = Integer.parseInt(quantityText.trim());
		if (quantity <= 0) {
			return "Quantity must be greater than 0.";
		}

		if (supplier == null || supplier.trim().isEmpty()) {
			return "Supplier cannot be empty.";
		}

		ItemStock itemStock = new ItemStock(menuItem, quantity, cost, supplier.trim(), 0);
		this.ds.addItemStock(itemStock);
		return null;
	}

	public String editItemStock
	(
		int ID,
		MenuItem menuItem,
		String costText,
		String quantityText,
		String supplier
	)
	{
		if (menuItem == null) {
			return "Please select a menu item.";
		}

		if (costText == null || costText.trim().isEmpty()) {
			return "Unit cost cannot be empty.";
		}
		if (!costText.trim().matches(numberPattern)) {
			return "Unit cost must be a valid number.";
		}
		float cost = Float.parseFloat(costText.trim());
		if (cost <= 0) {
			return "Unit cost must be greater than 0.";
		}

		if (quantityText == null || quantityText.trim().isEmpty()) {
			return "Quantity cannot be empty.";
		}
		if (!quantityText.trim().matches(wholeNumberPattern)) {
			return "Quantity must be a valid whole number.";
		}
		int quantity = Integer.parseInt(quantityText.trim());
		if (quantity <= 0) {
			return "Quantity must be greater than 0.";
		}

		if (supplier == null || supplier.trim().isEmpty()) {
			return "Supplier cannot be empty.";
		}

		ItemStock updatedItemStock = new ItemStock(menuItem, quantity, cost, supplier.trim(), ID);
		if (!this.ds.editItemStock(ID, updatedItemStock)) {
			return "Inventory item could not be found. Please try again.";
		}
		return null;
	}

}