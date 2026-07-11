package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.LoyaltyDiscountTier;

public class EditLoyaltyDiscountTierScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private int index;
	private LoyaltyDiscountTier loyaltyDiscountTier;

	public EditLoyaltyDiscountTierScreen(MainFrame main, int index, LoyaltyDiscountTier loyaltyDiscountTier) {
		this.main = main;
		this.index = index;
		this.loyaltyDiscountTier = loyaltyDiscountTier;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public LoyaltyDiscountTier getLoyaltyDiscountTier() {
		return loyaltyDiscountTier;
	}

	public void setLoyaltyDiscountTier(LoyaltyDiscountTier loyaltyDiscountTier) {
		this.loyaltyDiscountTier = loyaltyDiscountTier;
	}

	public void showLoyaltyDiscountMng() {
		// TODO Auto-generated method
	}

}
