package controller;

import data.Order;
import gui.AddIngredientScreen;
import gui.AddLoyaltyDiscountTierScreen;
import gui.OrderAgainScreen;
import gui.CustomerSidebarScreen;
import data.User;
import gui.CurrentOrdersScreen;
import gui.CustomerAccountScreen;
import gui.CustomerSignUpScreen;
import gui.MenuOrderScreen;
import gui.LoginScreen;
import data.LoyaltyDiscountTier;
import gui.EditLoyaltyDiscountTierScreen;
import gui.MenuScreen;
import gui.EditBreadTypeScreen;
import gui.EditSandwichScreen;
import data.BreadType;
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
import data.Sandwich;
import data.Ingredient;
import data.ItemStock;

public class MainFrame {

	/**
	 * 
	 */
	private OrderController orderController;
	/**
	 * 
	 */
	private Order currentOrder;
	/**
	 * 
	 */
	public AddIngredientScreen addingredientscreen;
	/**
	 * 
	 */
	public AddLoyaltyDiscountTierScreen addloyaltydiscounttierscreen;
	/**
	 * 
	 */
	public OrderAgainScreen orderagainscreen;
	/**
	 * 
	 */
	public CustomerSidebarScreen customersidebarscreen;
	/**
	 * 
	 */
	private User currentUser;
	/**
	 * 
	 */
	public CurrentOrdersScreen currentordersscreen;
	/**
	 * 
	 */
	public CustomerAccountScreen customeraccountscreen;
	/**
	 * 
	 */
	public CustomerSignUpScreen customersignupscreen;
	/**
	 * 
	 */
	public CustomerController customercontroller;
	/**
	 * 
	 */
	public SandwichController sandwichcontroller;
	/**
	 * 
	 */
	public MenuOrderScreen menuorderscreen;
	/**
	 * 
	 */
	private AnalyticsController analyticsController;
	/**
	 * 
	 */
	public InventoryController inventorycontroller;
	/**
	 * 
	 */
	public LoginScreen loginscreen;
	/**
	 * 
	 */
	public OrderController ordercontroller;
	/**
	 * 
	 */
	private LoyaltyDiscountTier loyaltyDiscountTierController;
	/**
	 * 
	 */
	public AnalyticsController analyticscontroller;
	/**
	 * 
	 */
	public EditLoyaltyDiscountTierScreen editloyaltydiscounttierscreen;
	/**
	 * 
	 */
	public MenuScreen menuscreen;
	/**
	 * 
	 */
	private LoyaltyDiscountController loyaltyDiscountController;
	/**
	 * 
	 */
	public IngredientController ingredientcontroller;
	/**
	 * 
	 */
	public EditBreadTypeScreen editbreadtypescreen;
	/**
	 * 
	 */
	public EditSandwichScreen editsandwichscreen;
	/**
	 * 
	 */
	private InventoryController inventoryController;
	/**
	 * 
	 */
	public StaffController staffcontroller;
	/**
	 * 
	 */
	private BreadType breadTypeController;
	/**
	 * 
	 */
	public OrderDetailsScreen orderdetailsscreen;
	/**
	 * 
	 */
	public IngredientController menucontroller;
	/**
	 * 
	 */
	public BreadTypeController breadtypecontroller;
	/**
	 * 
	 */
	public AddBreadTypeScreen addbreadtypescreen;
	/**
	 * 
	 */
	public StaffSignUpScreen staffsignupscreen;
	/**
	 * 
	 */
	public LoyaltyDiscountController discountcontroller;
	/**
	 * 
	 */
	public OrdersSummaryScreen orderssummaryscreen;
	/**
	 * 
	 */
	public AddInventoryScreen addinventoryscreen;
	/**
	 * 
	 */
	private MenuController menuController;
	/**
	 * 
	 */
	private IngredientController ingredientController;
	/**
	 * 
	 */
	public CartScreen cartscreen;
	/**
	 * 
	 */
	private SandwichController sandwichController;
	public InventoryScreen inventoryscreen;
	public OrdersScreen ordersscreen;
	/**
	 * 
	 */
	public EditIngredientScreen editingredientscreen;
	/**
	 * 
	 */
	public LoyaltyScreen loyaltyscreen;
	/**
	 * 
	 */
	public GuestMenuOrderScreen guestmenuorderscreen;
	/**
	 * 
	 */
	public EditOrderScreen editorderscreen;
	/**
	 * 
	 */
	public LoyaltyDiscountTierController loyaltydiscounttiercontroller;
	/**
	 * 
	 */
	private StaffController staffController;
	/**
	 * 
	 */
	public EditInventoryScreen editinventoryscreen;
	/**
	 * 
	 */
	private CustomerController customerController;
	/**
	 * Getter of orderController
	 */
	public OrderController getOrderController() {
	 	 return orderController; 
	}
	/**
	 * Setter of orderController
	 */
	public void setOrderController(OrderController orderController) { 
		 this.orderController = orderController; 
	}
	/**
	 * Getter of currentOrder
	 */
	public Order getCurrentOrder() {
	 	 return currentOrder; 
	}
	/**
	 * Setter of currentOrder
	 */
	public void setCurrentOrder(Order currentOrder) { 
		 this.currentOrder = currentOrder; 
	}
	/**
	 * Getter of addingredientscreen
	 */
	public AddIngredientScreen getAddingredientscreen() {
	 	 return addingredientscreen; 
	}
	/**
	 * Setter of addingredientscreen
	 */
	public void setAddingredientscreen(AddIngredientScreen addingredientscreen) { 
		 this.addingredientscreen = addingredientscreen; 
	}
	/**
	 * Getter of addloyaltydiscounttierscreen
	 */
	public AddLoyaltyDiscountTierScreen getAddloyaltydiscounttierscreen() {
	 	 return addloyaltydiscounttierscreen; 
	}
	/**
	 * Setter of addloyaltydiscounttierscreen
	 */
	public void setAddloyaltydiscounttierscreen(AddLoyaltyDiscountTierScreen addloyaltydiscounttierscreen) { 
		 this.addloyaltydiscounttierscreen = addloyaltydiscounttierscreen; 
	}
	/**
	 * Getter of orderagainscreen
	 */
	public OrderAgainScreen getOrderagainscreen() {
	 	 return orderagainscreen; 
	}
	/**
	 * Setter of orderagainscreen
	 */
	public void setOrderagainscreen(OrderAgainScreen orderagainscreen) { 
		 this.orderagainscreen = orderagainscreen; 
	}
	/**
	 * Getter of customersidebarscreen
	 */
	public CustomerSidebarScreen getCustomersidebarscreen() {
	 	 return customersidebarscreen; 
	}
	/**
	 * Setter of customersidebarscreen
	 */
	public void setCustomersidebarscreen(CustomerSidebarScreen customersidebarscreen) { 
		 this.customersidebarscreen = customersidebarscreen; 
	}
	/**
	 * Getter of currentUser
	 */
	public User getCurrentUser() {
	 	 return currentUser; 
	}
	/**
	 * Setter of currentUser
	 */
	public void setCurrentUser(User currentUser) { 
		 this.currentUser = currentUser; 
	}
	/**
	 * Getter of currentordersscreen
	 */
	public CurrentOrdersScreen getCurrentordersscreen() {
	 	 return currentordersscreen; 
	}
	/**
	 * Setter of currentordersscreen
	 */
	public void setCurrentordersscreen(CurrentOrdersScreen currentordersscreen) { 
		 this.currentordersscreen = currentordersscreen; 
	}
	/**
	 * Getter of customeraccountscreen
	 */
	public CustomerAccountScreen getCustomeraccountscreen() {
	 	 return customeraccountscreen; 
	}
	/**
	 * Setter of customeraccountscreen
	 */
	public void setCustomeraccountscreen(CustomerAccountScreen customeraccountscreen) { 
		 this.customeraccountscreen = customeraccountscreen; 
	}
	/**
	 * Getter of customersignupscreen
	 */
	public CustomerSignUpScreen getCustomersignupscreen() {
	 	 return customersignupscreen; 
	}
	/**
	 * Setter of customersignupscreen
	 */
	public void setCustomersignupscreen(CustomerSignUpScreen customersignupscreen) { 
		 this.customersignupscreen = customersignupscreen; 
	}
	/**
	 * Getter of customercontroller
	 */
	public CustomerController getCustomercontroller() {
	 	 return customercontroller; 
	}
	/**
	 * Setter of customercontroller
	 */
	public void setCustomercontroller(CustomerController customercontroller) { 
		 this.customercontroller = customercontroller; 
	}
	/**
	 * Getter of sandwichcontroller
	 */
	public SandwichController getSandwichcontroller() {
	 	 return sandwichcontroller; 
	}
	/**
	 * Setter of sandwichcontroller
	 */
	public void setSandwichcontroller(SandwichController sandwichcontroller) { 
		 this.sandwichcontroller = sandwichcontroller; 
	}
	/**
	 * Getter of menuorderscreen
	 */
	public MenuOrderScreen getMenuorderscreen() {
	 	 return menuorderscreen; 
	}
	/**
	 * Setter of menuorderscreen
	 */
	public void setMenuorderscreen(MenuOrderScreen menuorderscreen) { 
		 this.menuorderscreen = menuorderscreen; 
	}
	/**
	 * Getter of analyticsController
	 */
	public AnalyticsController getAnalyticsController() {
	 	 return analyticsController; 
	}
	/**
	 * Setter of analyticsController
	 */
	public void setAnalyticsController(AnalyticsController analyticsController) { 
		 this.analyticsController = analyticsController; 
	}
	/**
	 * Getter of inventorycontroller
	 */
	public InventoryController getInventorycontroller() {
	 	 return inventorycontroller; 
	}
	/**
	 * Setter of inventorycontroller
	 */
	public void setInventorycontroller(InventoryController inventorycontroller) { 
		 this.inventorycontroller = inventorycontroller; 
	}
	/**
	 * Getter of loginscreen
	 */
	public LoginScreen getLoginscreen() {
	 	 return loginscreen; 
	}
	/**
	 * Setter of loginscreen
	 */
	public void setLoginscreen(LoginScreen loginscreen) { 
		 this.loginscreen = loginscreen; 
	}
	/**
	 * Getter of ordercontroller
	 */
	public OrderController getOrdercontroller() {
	 	 return ordercontroller; 
	}
	/**
	 * Setter of ordercontroller
	 */
	public void setOrdercontroller(OrderController ordercontroller) { 
		 this.ordercontroller = ordercontroller; 
	}
	/**
	 * Getter of loyaltyDiscountTierController
	 */
	public LoyaltyDiscountTier getLoyaltyDiscountTierController() {
	 	 return loyaltyDiscountTierController; 
	}
	/**
	 * Setter of loyaltyDiscountTierController
	 */
	public void setLoyaltyDiscountTierController(LoyaltyDiscountTier loyaltyDiscountTierController) { 
		 this.loyaltyDiscountTierController = loyaltyDiscountTierController; 
	}
	/**
	 * Getter of analyticscontroller
	 */
	public AnalyticsController getAnalyticscontroller() {
	 	 return analyticscontroller; 
	}
	/**
	 * Setter of analyticscontroller
	 */
	public void setAnalyticscontroller(AnalyticsController analyticscontroller) { 
		 this.analyticscontroller = analyticscontroller; 
	}
	/**
	 * Getter of editloyaltydiscounttierscreen
	 */
	public EditLoyaltyDiscountTierScreen getEditloyaltydiscounttierscreen() {
	 	 return editloyaltydiscounttierscreen; 
	}
	/**
	 * Setter of editloyaltydiscounttierscreen
	 */
	public void setEditloyaltydiscounttierscreen(EditLoyaltyDiscountTierScreen editloyaltydiscounttierscreen) { 
		 this.editloyaltydiscounttierscreen = editloyaltydiscounttierscreen; 
	}
	/**
	 * Getter of menuscreen
	 */
	public MenuScreen getMenuscreen() {
	 	 return menuscreen; 
	}
	/**
	 * Setter of menuscreen
	 */
	public void setMenuscreen(MenuScreen menuscreen) { 
		 this.menuscreen = menuscreen; 
	}
	/**
	 * Getter of loyaltyDiscountController
	 */
	public LoyaltyDiscountController getLoyaltyDiscountController() {
	 	 return loyaltyDiscountController; 
	}
	/**
	 * Setter of loyaltyDiscountController
	 */
	public void setLoyaltyDiscountController(LoyaltyDiscountController loyaltyDiscountController) { 
		 this.loyaltyDiscountController = loyaltyDiscountController; 
	}
	/**
	 * Getter of ingredientcontroller
	 */
	public IngredientController getIngredientcontroller() {
	 	 return ingredientcontroller; 
	}
	/**
	 * Setter of ingredientcontroller
	 */
	public void setIngredientcontroller(IngredientController ingredientcontroller) { 
		 this.ingredientcontroller = ingredientcontroller; 
	}
	/**
	 * Getter of editbreadtypescreen
	 */
	public EditBreadTypeScreen getEditbreadtypescreen() {
	 	 return editbreadtypescreen; 
	}
	/**
	 * Setter of editbreadtypescreen
	 */
	public void setEditbreadtypescreen(EditBreadTypeScreen editbreadtypescreen) { 
		 this.editbreadtypescreen = editbreadtypescreen; 
	}
	/**
	 * Getter of editsandwichscreen
	 */
	public EditSandwichScreen getEditsandwichscreen() {
	 	 return editsandwichscreen; 
	}
	/**
	 * Setter of editsandwichscreen
	 */
	public void setEditsandwichscreen(EditSandwichScreen editsandwichscreen) { 
		 this.editsandwichscreen = editsandwichscreen; 
	}
	/**
	 * Getter of inventoryController
	 */
	public InventoryController getInventoryController() {
	 	 return inventoryController; 
	}
	/**
	 * Setter of inventoryController
	 */
	public void setInventoryController(InventoryController inventoryController) { 
		 this.inventoryController = inventoryController; 
	}
	/**
	 * Getter of staffcontroller
	 */
	public StaffController getStaffcontroller() {
	 	 return staffcontroller; 
	}
	/**
	 * Setter of staffcontroller
	 */
	public void setStaffcontroller(StaffController staffcontroller) { 
		 this.staffcontroller = staffcontroller; 
	}
	/**
	 * Getter of breadTypeController
	 */
	public BreadType getBreadTypeController() {
	 	 return breadTypeController; 
	}
	/**
	 * Setter of breadTypeController
	 */
	public void setBreadTypeController(BreadType breadTypeController) { 
		 this.breadTypeController = breadTypeController; 
	}
	/**
	 * Getter of orderdetailsscreen
	 */
	public OrderDetailsScreen getOrderdetailsscreen() {
	 	 return orderdetailsscreen; 
	}
	/**
	 * Setter of orderdetailsscreen
	 */
	public void setOrderdetailsscreen(OrderDetailsScreen orderdetailsscreen) { 
		 this.orderdetailsscreen = orderdetailsscreen; 
	}
	/**
	 * Getter of menucontroller
	 */
	public IngredientController getMenucontroller() {
	 	 return menucontroller; 
	}
	/**
	 * Setter of menucontroller
	 */
	public void setMenucontroller(IngredientController menucontroller) { 
		 this.menucontroller = menucontroller; 
	}
	/**
	 * Getter of breadtypecontroller
	 */
	public BreadTypeController getBreadtypecontroller() {
	 	 return breadtypecontroller; 
	}
	/**
	 * Setter of breadtypecontroller
	 */
	public void setBreadtypecontroller(BreadTypeController breadtypecontroller) { 
		 this.breadtypecontroller = breadtypecontroller; 
	}
	/**
	 * Getter of addbreadtypescreen
	 */
	public AddBreadTypeScreen getAddbreadtypescreen() {
	 	 return addbreadtypescreen; 
	}
	/**
	 * Setter of addbreadtypescreen
	 */
	public void setAddbreadtypescreen(AddBreadTypeScreen addbreadtypescreen) { 
		 this.addbreadtypescreen = addbreadtypescreen; 
	}
	/**
	 * Getter of staffsignupscreen
	 */
	public StaffSignUpScreen getStaffsignupscreen() {
	 	 return staffsignupscreen; 
	}
	/**
	 * Setter of staffsignupscreen
	 */
	public void setStaffsignupscreen(StaffSignUpScreen staffsignupscreen) { 
		 this.staffsignupscreen = staffsignupscreen; 
	}
	/**
	 * Getter of discountcontroller
	 */
	public LoyaltyDiscountController getDiscountcontroller() {
	 	 return discountcontroller; 
	}
	/**
	 * Setter of discountcontroller
	 */
	public void setDiscountcontroller(LoyaltyDiscountController discountcontroller) { 
		 this.discountcontroller = discountcontroller; 
	}
	/**
	 * Getter of orderssummaryscreen
	 */
	public OrdersSummaryScreen getOrderssummaryscreen() {
	 	 return orderssummaryscreen; 
	}
	/**
	 * Setter of orderssummaryscreen
	 */
	public void setOrderssummaryscreen(OrdersSummaryScreen orderssummaryscreen) { 
		 this.orderssummaryscreen = orderssummaryscreen; 
	}
	/**
	 * Getter of addinventoryscreen
	 */
	public AddInventoryScreen getAddinventoryscreen() {
	 	 return addinventoryscreen; 
	}
	/**
	 * Setter of addinventoryscreen
	 */
	public void setAddinventoryscreen(AddInventoryScreen addinventoryscreen) { 
		 this.addinventoryscreen = addinventoryscreen; 
	}
	/**
	 * Getter of menuController
	 */
	public MenuController getMenuController() {
	 	 return menuController; 
	}
	/**
	 * Setter of menuController
	 */
	public void setMenuController(MenuController menuController) { 
		 this.menuController = menuController; 
	}
	/**
	 * Getter of ingredientController
	 */
	public IngredientController getIngredientController() {
	 	 return ingredientController; 
	}
	/**
	 * Setter of ingredientController
	 */
	public void setIngredientController(IngredientController ingredientController) { 
		 this.ingredientController = ingredientController; 
	}
	/**
	 * Getter of cartscreen
	 */
	public CartScreen getCartscreen() {
	 	 return cartscreen; 
	}
	/**
	 * Setter of cartscreen
	 */
	public void setCartscreen(CartScreen cartscreen) { 
		 this.cartscreen = cartscreen; 
	}
	/**
	 * Getter of sandwichController
	 */
	public SandwichController getSandwichController() {
	 	 return sandwichController; 
	}
	/**
	 * Setter of sandwichController
	 */
	public void setSandwichController(SandwichController sandwichController) { 
		 this.sandwichController = sandwichController; 
	}
	/**
	 * Getter of inventoryscreen
	 */
	public InventoryScreen getInventoryscreen() {
	 	 return inventoryscreen; 
	}
	/**
	 * Setter of inventoryscreen
	 */
	public void setInventoryscreen(InventoryScreen inventoryscreen) { 
		 this.inventoryscreen = inventoryscreen; 
	}
	/**
	 * Getter of ordersscreen
	 */
	public OrdersScreen getOrdersscreen() {
	 	 return ordersscreen; 
	}
	/**
	 * Setter of ordersscreen
	 */
	public void setOrdersscreen(OrdersScreen ordersscreen) { 
		 this.ordersscreen = ordersscreen; 
	}
	/**
	 * Getter of editingredientscreen
	 */
	public EditIngredientScreen getEditingredientscreen() {
	 	 return editingredientscreen; 
	}
	/**
	 * Setter of editingredientscreen
	 */
	public void setEditingredientscreen(EditIngredientScreen editingredientscreen) { 
		 this.editingredientscreen = editingredientscreen; 
	}
	/**
	 * Getter of loyaltyscreen
	 */
	public LoyaltyScreen getLoyaltyscreen() {
	 	 return loyaltyscreen; 
	}
	/**
	 * Setter of loyaltyscreen
	 */
	public void setLoyaltyscreen(LoyaltyScreen loyaltyscreen) { 
		 this.loyaltyscreen = loyaltyscreen; 
	}
	/**
	 * Getter of guestmenuorderscreen
	 */
	public GuestMenuOrderScreen getGuestmenuorderscreen() {
	 	 return guestmenuorderscreen; 
	}
	/**
	 * Setter of guestmenuorderscreen
	 */
	public void setGuestmenuorderscreen(GuestMenuOrderScreen guestmenuorderscreen) { 
		 this.guestmenuorderscreen = guestmenuorderscreen; 
	}
	/**
	 * Getter of editorderscreen
	 */
	public EditOrderScreen getEditorderscreen() {
	 	 return editorderscreen; 
	}
	/**
	 * Setter of editorderscreen
	 */
	public void setEditorderscreen(EditOrderScreen editorderscreen) { 
		 this.editorderscreen = editorderscreen; 
	}
	/**
	 * Getter of loyaltydiscounttiercontroller
	 */
	public LoyaltyDiscountTierController getLoyaltydiscounttiercontroller() {
	 	 return loyaltydiscounttiercontroller; 
	}
	/**
	 * Setter of loyaltydiscounttiercontroller
	 */
	public void setLoyaltydiscounttiercontroller(LoyaltyDiscountTierController loyaltydiscounttiercontroller) { 
		 this.loyaltydiscounttiercontroller = loyaltydiscounttiercontroller; 
	}
	/**
	 * Getter of staffController
	 */
	public StaffController getStaffController() {
	 	 return staffController; 
	}
	/**
	 * Setter of staffController
	 */
	public void setStaffController(StaffController staffController) { 
		 this.staffController = staffController; 
	}
	/**
	 * Getter of editinventoryscreen
	 */
	public EditInventoryScreen getEditinventoryscreen() {
	 	 return editinventoryscreen; 
	}
	/**
	 * Setter of editinventoryscreen
	 */
	public void setEditinventoryscreen(EditInventoryScreen editinventoryscreen) { 
		 this.editinventoryscreen = editinventoryscreen; 
	}
	/**
	 * Getter of customerController
	 */
	public CustomerController getCustomerController() {
	 	 return customerController; 
	}
	/**
	 * Setter of customerController
	 */
	public void setCustomerController(CustomerController customerController) { 
		 this.customerController = customerController; 
	}
	/**
	 * 
	 */
	public void showAddLoyaltyDiscountTier() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param args[] 
	 */
	public static void main(String args[]) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showLoyalty() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showMenuOrder() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showCustomerSignUp() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showInventory() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showLoyaltyDiscountMng() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showOrderDetails() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showCustomerAccount() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showMenu() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param order 
	 * @param idx 
	 */
	public void showEditOrder(Order order, int idx) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showAddIngredient() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showAddBreadType() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param idx 
	 * @param sandwich 
	 */
	public void showEditSandwich(int idx, Sandwich sandwich) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param idx 
	 * @param breadType 
	 */
	public void showEditBreadType(int idx, BreadType breadType) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showCurrentOrders() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showAddInventory() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param idx 
	 * @param ingredient 
	 */
	public void showEditIngredient(int idx, Ingredient ingredient) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showCustomerSidebar() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param idx 
	 * @param loyaltyDiscountTier 
	 */
	public void showEditLoyaltyDiscountTier(int idx, LoyaltyDiscountTier loyaltyDiscountTier) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showCart() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showOrders() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showStaffAccount() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showStaffSidebar() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showStaffSignUp() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showLogin() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showOrderAgain() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showOrdersSummary() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param itemStock 
	 * @param idx 
	 */
	public void showEditInventory(ItemStock itemStock, int idx) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void showAnalytics() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ingredient 
	 * @param idx 
	 */
	public void showEditIngredient(Ingredient ingredient, int idx) { 
		// TODO Auto-generated method
	 }
}
