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
import gui.SignUpScreen;
import gui.MenuOrderScreen;
import gui.WelcomeScreen;
import gui.EditLoyaltyDiscountTierScreen;
import gui.MenuScreen;
import gui.EditBreadTypeScreen;
import gui.EditSandwichScreen;
import gui.OrderDetailsScreen;
import gui.AddBreadTypeScreen;
import gui.LoginScreen;
import gui.LoyaltyDiscountTierMngScreen;
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

		showWelcome();
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

	public void showWelcome() {
		WelcomeScreen welcomeScreen = new WelcomeScreen(this);
		getContentPane().add(welcomeScreen, "Welcome");
		this.card.show(this.getContentPane(), "Welcome");
	}

	public void showMenu() {
		MenuScreen menuScreen = new MenuScreen(this);
		getContentPane().add(menuScreen, "Menu");
		this.card.show(this.getContentPane(), "Menu");
	}

	public void showMenuOrder() {
		MenuOrderScreen menuOrderScreen = new MenuOrderScreen(this);
		getContentPane().add(menuOrderScreen, "MenuOrder");
		this.card.show(this.getContentPane(), "MenuOrder");
	}

	public void showGuestMenuOrder() {
		GuestMenuOrderScreen guestMenuOrderScreen = new GuestMenuOrderScreen(this);
		getContentPane().add(guestMenuOrderScreen, "GuestMenuOrder");
		this.card.show(this.getContentPane(), "GuestMenuOrder");
	}

	public void showCart() {
		CartScreen cartScreen = new CartScreen(this);
		getContentPane().add(cartScreen, "Cart");
		this.card.show(this.getContentPane(), "Cart");
	}

	public void showSignUp() {
		SignUpScreen signUpScreen = new SignUpScreen(this);
		getContentPane().add(signUpScreen, "SignUp");
		this.card.show(this.getContentPane(), "SignUp");
	}

	public void showCustomerAccount() {
		CustomerAccountScreen customerAccountScreen = new CustomerAccountScreen(this);
		getContentPane().add(customerAccountScreen, "CustomerAccount");
		this.card.show(this.getContentPane(), "CustomerAccount");
	}

	public void showCustomerSidebar() {
		CustomerSidebarScreen customerSidebarScreen = new CustomerSidebarScreen(this);
		getContentPane().add(customerSidebarScreen, "CustomerSidebar");
		this.card.show(this.getContentPane(), "CustomerSidebar");
	}

	public void showCurrentOrders() {
		CurrentOrdersScreen currentOrdersScreen = new CurrentOrdersScreen(this);
		getContentPane().add(currentOrdersScreen, "CurrentOrders");
		this.card.show(this.getContentPane(), "CurrentOrders");
	}

	public void showOrderDetails() {
		OrderDetailsScreen orderDetailsScreen = new OrderDetailsScreen(this);
		getContentPane().add(orderDetailsScreen, "OrderDetails");
		this.card.show(this.getContentPane(), "OrderDetails");
	}

	public void showEditOrder(Order order, int idx) {
		EditOrderScreen editOrderScreen = new EditOrderScreen(this, idx, order);
		getContentPane().add(editOrderScreen, "EditOrder");
		this.card.show(this.getContentPane(), "EditOrder");
	}

	public void showOrderAgain() {
		OrderAgainScreen orderAgainScreen = new OrderAgainScreen(this);
		getContentPane().add(orderAgainScreen, "OrderAgain");
		this.card.show(this.getContentPane(), "OrderAgain");
	}

	public void showOrders() {
		OrdersScreen ordersScreen = new OrdersScreen(this);
		getContentPane().add(ordersScreen, "Orders");
		this.card.show(this.getContentPane(), "Orders");
	}

	public void showOrdersSummary() {
		OrdersSummaryScreen ordersSummaryScreen = new OrdersSummaryScreen(this);
		getContentPane().add(ordersSummaryScreen, "OrdersSummary");
		this.card.show(this.getContentPane(), "OrdersSummary");
	}

	public void showAddIngredient() {
		AddIngredientScreen addIngredientScreen = new AddIngredientScreen(this);
		getContentPane().add(addIngredientScreen, "AddIngredient");
		this.card.show(this.getContentPane(), "AddIngredient");
	}

	public void showEditIngredient(int idx, Ingredient ingredient) {
		EditIngredientScreen editIngredientScreen = new EditIngredientScreen(this, idx, ingredient);
		getContentPane().add(editIngredientScreen, "EditIngredient");
		this.card.show(this.getContentPane(), "EditIngredient");
	}

	public void showAddBreadType() {
		AddBreadTypeScreen addBreadTypeScreen = new AddBreadTypeScreen(this);
		getContentPane().add(addBreadTypeScreen, "AddBreadType");
		this.card.show(this.getContentPane(), "AddBreadType");
	}

	public void showEditBreadType(int idx, BreadType breadType) {
		EditBreadTypeScreen editBreadTypeScreen = new EditBreadTypeScreen(this, idx, breadType);
		getContentPane().add(editBreadTypeScreen, "EditBreadType");
		this.card.show(this.getContentPane(), "EditBreadType");
	}

	public void showEditSandwich(int idx, Sandwich sandwich) {
		EditSandwichScreen editSandwichScreen = new EditSandwichScreen(this, idx, sandwich);
		getContentPane().add(editSandwichScreen, "EditSandwich");
		this.card.show(this.getContentPane(), "EditSandwich");
	}

	public void showInventory() {
		InventoryScreen inventoryScreen = new InventoryScreen(this);
		getContentPane().add(inventoryScreen, "Inventory");
		this.card.show(this.getContentPane(), "Inventory");
	}

	public void showAddInventory() {
		AddInventoryScreen addInventoryScreen = new AddInventoryScreen(this);
		getContentPane().add(addInventoryScreen, "AddInventory");
		this.card.show(this.getContentPane(), "AddInventory");
	}

	public void showEditInventory(ItemStock itemStock, int idx) {
		EditInventoryScreen editInventoryScreen = new EditInventoryScreen(this, itemStock, idx);
		getContentPane().add(editInventoryScreen, "EditInventory");
		this.card.show(this.getContentPane(), "EditInventory");
	}

	public void showLoyalty() {
		LoyaltyScreen loyaltyScreen = new LoyaltyScreen(this);
		getContentPane().add(loyaltyScreen, "Loyalty");
		this.card.show(this.getContentPane(), "Loyalty");
	}

	public void showLoyaltyDiscountTierMng() {
		LoyaltyDiscountTierMngScreen loyaltyDiscountTierMngScreen = new LoyaltyDiscountTierMngScreen(this);
		getContentPane().add(loyaltyDiscountTierMngScreen, "loyaltyDiscountTierMng");
		this.card.show(this.getContentPane(), "loyaltyDiscountTierMng");
	}

	public void showAddLoyaltyDiscountTier() {
		AddLoyaltyDiscountTierScreen addLoyaltyDiscountTierScreen = new AddLoyaltyDiscountTierScreen(this);
		getContentPane().add(addLoyaltyDiscountTierScreen, "AddLoyaltyDiscountTier");
		this.card.show(this.getContentPane(), "AddLoyaltyDiscountTier");
	}

	public void showEditLoyaltyDiscountTier(int idx, LoyaltyDiscountTier loyaltyDiscountTier) {
		EditLoyaltyDiscountTierScreen editLoyaltyDiscountTierScreen = new EditLoyaltyDiscountTierScreen(this, idx, loyaltyDiscountTier);
		getContentPane().add(editLoyaltyDiscountTierScreen, "EditLoyaltyDiscountTier");
		this.card.show(this.getContentPane(), "EditLoyaltyDiscountTier");
	}

	public void showLogin() {
		LoginScreen loginScreen = new LoginScreen(this);
		getContentPane().add(loginScreen, "Login");
		this.card.show(this.getContentPane(), "Login");
	}

	public void showStaffAccount() {
		StaffAccountScreen staffAccountScreen = new StaffAccountScreen(this);
		getContentPane().add(staffAccountScreen, "StaffAccount");
		this.card.show(this.getContentPane(), "StaffAccount");
	}

	public void showStaffSidebar() {
		StaffSidebarScreen staffSidebarScreen = new StaffSidebarScreen(this);
		getContentPane().add(staffSidebarScreen, "StaffSidebar");
		this.card.show(this.getContentPane(), "StaffSidebar");
	}

	public void showAnalytics() {
		AnalyticsScreen analyticsScreen = new AnalyticsScreen(this);
		getContentPane().add(analyticsScreen, "Analytics");
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