package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.LoyaltyDiscountTier;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LoyaltyDiscountTierMngScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public LoyaltyDiscountTierMngScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblLoyaltyDiscount = new JLabel("Loyalty Discount Tier Manager");
		lblLoyaltyDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoyaltyDiscount.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblLoyaltyDiscount.setBounds(280, 80, 520, 48);
		add(lblLoyaltyDiscount);
	}

	public void showEditLoyaltyDiscountTier(LoyaltyDiscountTier loyaltyDiscountTier, int idx) {
		// TODO Auto-generated method
	}

	public void showAddLoyaltyDiscountTier() {
		// TODO Auto-generated method
	}

}
