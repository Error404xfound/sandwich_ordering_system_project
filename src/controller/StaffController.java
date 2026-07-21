package controller;

import java.util.Vector;

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


	public String addStaff(String username, String email, String pwd, String role) {
	
		if (username == null || username.trim().isEmpty()) {
			return "Username cannot be empty.";
		}
		
		if (email == null || email.trim().isEmpty()) {
			return "Email cannot be empty.";
		}
		
		if (!email.trim().toLowerCase().endsWith("@supersandwichstore.com")) {
			return "Please use your company email address.";
		}
		
		if (this.ds.getStaffbyEmail(email.trim()) != null) {
			return "An account with this email address already exists.";
		}
		if (pwd == null || pwd.isEmpty()) {
			return "Password cannot be empty.";
		}
		
		if (pwd.length() < 8) {
			return "Password must be at least 8 characters long.";
		}
		
		Staff staff = new Staff(username.trim(), email.trim(), pwd, 0, role);
		this.ds.addStaff(staff);
		return null;
	 }

	
	public String editStaff(int ID, String username, String pwd) {
		
		if (username == null || username.trim().isEmpty()) {
			return "Username cannot be empty.";
		}
		
		if (pwd == null || pwd.isEmpty()) {
			return "Password cannot be empty.";
		}
		
		if (pwd.length() < 8) {
			return "Password must be at least 8 characters long.";
		}
		
		Staff existing = this.ds.getStaff(ID);
		if (existing == null) {
			return "Your account could not be found. Please try again.";
		}
		Staff updated = new Staff(username.trim(), existing.getEmail(), pwd, ID, existing.getRole());
		if (!this.ds.editStaff(ID, updated)) {
			return "Your account could not be updated. Please try again.";
		}
		return null;
	 } 

	public Staff getStaffbyEmail(String email) {
		return this.ds.getStaffbyEmail(email);
	}
	
	public Vector<Staff> getAllStaff() {
		return this.ds.getAllStaff();
	}

}