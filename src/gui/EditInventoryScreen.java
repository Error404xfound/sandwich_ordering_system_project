package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.ItemStock;

public class EditInventoryScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private int itemStockIndex;
	private ItemStock itemStock;

	public EditInventoryScreen(MainFrame main, ItemStock itemStock, int itemStockIndex) {
		this.main = main;
		this.itemStock = itemStock;
		this.itemStockIndex = itemStockIndex;
	}

	public int getItemStockIndex() {
		return itemStockIndex;
	}

	public void setItemStockIndex(int itemStockIndex) {
		this.itemStockIndex = itemStockIndex;
	}

	public ItemStock getItemStock() {
		return itemStock;
	}

	public void setItemStock(ItemStock itemStock) {
		this.itemStock = itemStock;
	}

	public void showInventory() {
		// TODO Auto-generated method
	}

}
