package data;

public class Staff extends User {

	private String role;

	public Staff(String username, String email, String pwd, int userID, String role) {
		super(username, email, pwd, userID);
		this.role = role;
	}
	
	public String getRole() {
	 	 return role; 
	}

	
	public void setRole(String role) { 
		 this.role = role; 
	}

	

}
