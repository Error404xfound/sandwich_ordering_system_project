package controller;

import data.DataStorage;
import data.Staff;

public class StaffController {

	private DataStorage ds = DataStorage.getInstance();

	public boolean verifyStaff(String password, String email) { 
		Staff t = ds.getStaffbyEmail(email);
		for (int i = 0; i < ds.getAllStaff().size(); i++) {
			if (t == ds.getAllStaff().get(i)) {
				return true;
			}
		}
		return false;
	 }

	public void deleteStaff(int ID) { 
	 }

	public boolean addStaff(String username, String email, String pwd, int userID, String role) { 
		if (!email.toLowerCase().endsWith("@supersandwichstore.com")) {
			return false;
		}
		Staff staff = new Staff(username, email, pwd, userID, role);
		ds.addStaff(staff);
		return true;
	 }

	public Staff getAllStaff() { 
		return null;
	 }

	public void editStaff(Staff staff, int ID) { 
	 } 

}
