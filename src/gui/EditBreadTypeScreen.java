package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.BreadType;

public class EditBreadTypeScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private BreadType breadType;
	private int breadTypeIndex;

	public EditBreadTypeScreen(MainFrame main, int breadTypeIndex, BreadType breadType) {
		this.main = main;
		this.breadTypeIndex = breadTypeIndex;
		this.breadType = breadType;
	}

	public BreadType getBreadType() {
		return breadType;
	}

	public void setBreadType(BreadType breadType) {
		this.breadType = breadType;
	}

	public int getBreadTypeIndex() {
		return breadTypeIndex;
	}

	public void setBreadTypeIndex(int breadTypeIndex) {
		this.breadTypeIndex = breadTypeIndex;
	}

	public void showMenu() {
		// TODO Auto-generated method
	}

}
