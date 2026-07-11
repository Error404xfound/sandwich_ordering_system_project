package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.Order;
import data.Sandwich;

public class EditOrderScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private int orderIndex;
	private Order order;

	public EditOrderScreen(MainFrame main, int orderIndex, Order order) {
		this.main = main;
		this.orderIndex = orderIndex;
		this.order = order;
	}

	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void showEditSandwich(int idx, Sandwich sandwich) {
		// TODO Auto-generated method
	}

	public void showEditSandwich(Sandwich sandwich, int idx) {
		// TODO Auto-generated method
	}

}
