// File: src/controller/MainFrame.java
package controller;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.Order;
import data.User;
import data.Sandwich;
import data.BreadType;
import data.Ingredient;
import data.ItemStock;
import data.LoyaltyDiscountTier;

import gui.AddIngredientScreen;
import gui.AddLoyaltyDiscountTierScreen;
import gui.OrderAgainScreen;
import gui.CustomerSidebarScreen;
import gui.CurrentOrdersScreen;
import gui.CustomerAccountScreen;
import gui.CustomerSignUpScreen;
import gui.MenuOrderScreen;
import gui.LoginScreen;
import gui.EditLoyaltyDiscountTierScreen;
import gui.MenuScreen;
import gui.EditBreadTypeScreen;
import gui.EditSandwichScreen;
import gui.OrderDetailsScreen;
import gui.AddBreadTypeScreen;
import gui.StaffSignUpScreen;
import gui.OrdersSummaryScreen;
import gui.AddInventoryScreen;
import gui.CartScreen;
import gui.InventoryScreen;
import gui.OrdersScreen;
import gui.EditIngredientScreen;
import gui.LoyaltyScreen;
import gui.GuestMenuOrderScreen;
import gui.EditOrderScreen;
import gui.EditInventoryScreen;
import gui.StaffAccountScreen;
import gui.StaffSidebarScreen;
import gui.AnalyticsScreen;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private CardLayout card;
	private JPanel contentPane;

	// Controllers
	private OrderController orderController;
	private CustomerController customerController;
	private SandwichController sandwichController;
	private AnalyticsController analyticsController;
	private InventoryController inventoryController;
	private StaffController staffController;
	private LoyaltyDiscountTierController loyaltyDiscountTierController;
	private LoyaltyDiscountController loyaltyDiscountController;
	private IngredientController ingredientController;
	private BreadTypeController breadTypeController;
	private MenuController menuController;

	// State
	private Order currentOrder;
	private User currentUser;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		setTitle("Super Sandwich Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.card = new CardLayout();
		getContentPane().setLayout(this.card);

		this.orderController = new OrderController();
		this.customerController = new CustomerController();
		this.sandwichController = new SandwichController();
		this.analyticsController = new AnalyticsController();
		this.inventoryController = new InventoryController();
		this.staffController = new StaffController();
		this.loyaltyDiscountTierController = new LoyaltyDiscountTierController();
		this.loyaltyDiscountController = new LoyaltyDiscountController();
		this.ingredientController = new IngredientController();
		this.breadTypeController = new BreadTypeController();
		this.menuController = new MenuController();

		this.showLogin();
	}

	// --- Controller getters ---

	public OrderController getOrderController() {
		return orderController;
	}

	public CustomerController getCustomerController() {
		return customerController;
	}

	public SandwichController getSandwichController() {
		return sandwichController;
	}

	public AnalyticsController getAnalyticsController() {
		return analyticsController;
	}

	public InventoryController getInventoryController() {
		return inventoryController;
	}

	public StaffController getStaffController() {
		return staffController;
	}

	public LoyaltyDiscountTierController getLoyaltyDiscountTierController() {
		return loyaltyDiscountTierController;
	}

	public LoyaltyDiscountController getLoyaltyDiscountController() {
		return loyaltyDiscountController;
	}

	public IngredientController getIngredientController() {
		return ingredientController;
	}

	public BreadTypeController getBreadTypeController() {
		return breadTypeController;
	}

	public MenuController getMenuController() {
		return menuController;
	}

	// --- Navigation methods ---

	public void showLogin() {
		LoginScreen loginScreen = new LoginScreen(this);
		this.add(loginScreen, "Login");
		this.card.show(this.getContentPane(), "Login");
	}

	public void showMenu() {
		MenuScreen menuScreen = new MenuScreen(this);
		this.add(menuScreen, "Menu");
		this.card.show(this.getContentPane(), "Menu");
	}

	public void showMenuOrder() {
		MenuOrderScreen menuOrderScreen = new MenuOrderScreen(this);
		this.add(menuOrderScreen, "MenuOrder");
		this.card.show(this.getContentPane(), "MenuOrder");
	}

	public void showGuestMenuOrder() {
		GuestMenuOrderScreen guestMenuOrderScreen = new GuestMenuOrderScreen(this);
		this.add(guestMenuOrderScreen, "GuestMenuOrder");
		this.card.show(this.getContentPane(), "GuestMenuOrder");
	}

	public void showCart() {
		CartScreen cartScreen = new CartScreen(this);
		this.add(cartScreen, "Cart");
		this.card.show(this.getContentPane(), "Cart");
	}

	public void showCustomerSignUp() {
		CustomerSignUpScreen customerSignUpScreen = new CustomerSignUpScreen(this);
		this.add(customerSignUpScreen, "CustomerSignUp");
		this.card.show(this.getContentPane(), "CustomerSignUp");
	}

	public void showCustomerAccount() {
		CustomerAccountScreen customerAccountScreen = new CustomerAccountScreen(this);
		this.add(customerAccountScreen, "CustomerAccount");
		this.card.show(this.getContentPane(), "CustomerAccount");
	}

	public void showCustomerSidebar() {
		CustomerSidebarScreen customerSidebarScreen = new CustomerSidebarScreen(this);
		this.add(customerSidebarScreen, "CustomerSidebar");
		this.card.show(this.getContentPane(), "CustomerSidebar");
	}

	public void showCurrentOrders() {
		CurrentOrdersScreen currentOrdersScreen = new CurrentOrdersScreen(this);
		this.add(currentOrdersScreen, "CurrentOrders");
		this.card.show(this.getContentPane(), "CurrentOrders");
	}

	public void showOrderDetails() {
		OrderDetailsScreen orderDetailsScreen = new OrderDetailsScreen(this);
		this.add(orderDetailsScreen, "OrderDetails");
		this.card.show(this.getContentPane(), "OrderDetails");
	}

	public void showEditOrder(Order order, int idx) {
		EditOrderScreen editOrderScreen = new EditOrderScreen(this, idx, order);
		this.add(editOrderScreen, "EditOrder");
		this.card.show(this.getContentPane(), "EditOrder");
	}

	public void showOrderAgain() {
		OrderAgainScreen orderAgainScreen = new OrderAgainScreen(this);
		this.add(orderAgainScreen, "OrderAgain");
		this.card.show(this.getContentPane(), "OrderAgain");
	}

	public void showOrders() {
		OrdersScreen ordersScreen = new OrdersScreen(this);
		this.add(ordersScreen, "Orders");
		this.card.show(this.getContentPane(), "Orders");
	}

	public void showOrdersSummary() {
		OrdersSummaryScreen ordersSummaryScreen = new OrdersSummaryScreen(this);
		this.add(ordersSummaryScreen, "OrdersSummary");
		this.card.show(this.getContentPane(), "OrdersSummary");
	}

	public void showAddIngredient() {
		AddIngredientScreen addIngredientScreen = new AddIngredientScreen(this);
		this.add(addIngredientScreen, "AddIngredient");
		this.card.show(this.getContentPane(), "AddIngredient");
	}

	public void showEditIngredient(int idx, Ingredient ingredient) {
		EditIngredientScreen editIngredientScreen = new EditIngredientScreen(this, idx, ingredient);
		this.add(editIngredientScreen, "EditIngredient");
		this.card.show(this.getContentPane(), "EditIngredient");
	}

	public void showAddBreadType() {
		AddBreadTypeScreen addBreadTypeScreen = new AddBreadTypeScreen(this);
		this.add(addBreadTypeScreen, "AddBreadType");
		this.card.show(this.getContentPane(), "AddBreadType");
	}

	public void showEditBreadType(int idx, BreadType breadType) {
		EditBreadTypeScreen editBreadTypeScreen = new EditBreadTypeScreen(this, idx, breadType);
		this.add(editBreadTypeScreen, "EditBreadType");
		this.card.show(this.getContentPane(), "EditBreadType");
	}

	public void showEditSandwich(int idx, Sandwich sandwich) {
		EditSandwichScreen editSandwichScreen = new EditSandwichScreen(this, idx, sandwich);
		this.add(editSandwichScreen, "EditSandwich");
		this.card.show(this.getContentPane(), "EditSandwich");
	}

	public void showInventory() {
		InventoryScreen inventoryScreen = new InventoryScreen(this);
		this.add(inventoryScreen, "Inventory");
		this.card.show(this.getContentPane(), "Inventory");
	}

	public void showAddInventory() {
		AddInventoryScreen addInventoryScreen = new AddInventoryScreen(this);
		this.add(addInventoryScreen, "AddInventory");
		this.card.show(this.getContentPane(), "AddInventory");
	}

	public void showEditInventory(ItemStock itemStock, int idx) {
		EditInventoryScreen editInventoryScreen = new EditInventoryScreen(this, itemStock, idx);
		this.add(editInventoryScreen, "EditInventory");
		this.card.show(this.getContentPane(), "EditInventory");
	}

	public void showLoyalty() {
		LoyaltyScreen loyaltyScreen = new LoyaltyScreen(this);
		this.add(loyaltyScreen, "Loyalty");
		this.card.show(this.getContentPane(), "Loyalty");
	}

	public void showLoyaltyDiscountMng() {
		// TODO Auto-generated method
	}

	public void showAddLoyaltyDiscountTier() {
		AddLoyaltyDiscountTierScreen addLoyaltyDiscountTierScreen = new AddLoyaltyDiscountTierScreen(this);
		this.add(addLoyaltyDiscountTierScreen, "AddLoyaltyDiscountTier");
		this.card.show(this.getContentPane(), "AddLoyaltyDiscountTier");
	}

	public void showEditLoyaltyDiscountTier(int idx, LoyaltyDiscountTier loyaltyDiscountTier) {
		EditLoyaltyDiscountTierScreen editLoyaltyDiscountTierScreen = new EditLoyaltyDiscountTierScreen(this, idx, loyaltyDiscountTier);
		this.add(editLoyaltyDiscountTierScreen, "EditLoyaltyDiscountTier");
		this.card.show(this.getContentPane(), "EditLoyaltyDiscountTier");
	}

	public void showStaffSignUp() {
		StaffSignUpScreen staffSignUpScreen = new StaffSignUpScreen(this);
		this.add(staffSignUpScreen, "StaffSignUp");
		this.card.show(this.getContentPane(), "StaffSignUp");
	}

	public void showStaffAccount() {
		StaffAccountScreen staffAccountScreen = new StaffAccountScreen(this);
		this.add(staffAccountScreen, "StaffAccount");
		this.card.show(this.getContentPane(), "StaffAccount");
	}

	public void showStaffSidebar() {
		StaffSidebarScreen staffSidebarScreen = new StaffSidebarScreen(this);
		this.add(staffSidebarScreen, "StaffSidebar");
		this.card.show(this.getContentPane(), "StaffSidebar");
	}

	public void showAnalytics() {
		AnalyticsScreen analyticsScreen = new AnalyticsScreen(this);
		this.add(analyticsScreen, "Analytics");
		this.card.show(this.getContentPane(), "Analytics");
	}

	// --- State getters/setters ---

	public Order getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
}