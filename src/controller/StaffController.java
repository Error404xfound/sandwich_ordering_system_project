package controller;

import data.DataStorage;
import data.Staff;

public class StaffController {

	private DataStorage ds = DataStorage.getInstance();

	public boolean verifyStaff(String email, String password) {
	    Staff t = this.ds.getStaffbyEmail(email);
	    if (t == null) {
	        return false;
	    }
	    return t.getPassword().equals(password);
	}

	public boolean deleteStaff(int ID) { 
		return this.ds.deleteStaff(ID);
	 }

	public boolean addStaff(String username, String email, String pwd, int userID, String role) { 
		if (!email.toLowerCase().endsWith("@supersandwichstore.com")) {
			return false;
		}
		Staff staff = new Staff(username, email, pwd, userID, role);
		this.ds.addStaff(staff);
		return true;
	 }

	public Staff getAllStaff() { 
		return null;
	 }

	public void editStaff(int ID, Staff staff) { 
		this.ds.editStaff(ID, staff);
	 } 
	public Staff getStaffbyEmail(String email) {
		return this.ds.getStaffbyEmail(email);
	}

}
