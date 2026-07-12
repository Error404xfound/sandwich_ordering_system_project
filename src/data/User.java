package data;

public class User {

	private String username;
	private String email;
	private String password;
	private int userID;
	
	public User(String username, String email, String pwd, int userID ) {
		this.username = username;
		this.email = email;
		this.password = pwd;
		this.userID = userID;
	}
	
	public String getEmail() {
	 	 return email; 
	}
	
	public void setEmail(String email) { 
		 this.email = email; 
	}
	/**
	 * Getter of userID
	 */
	public int getUserID() {
	 	 return userID; 
	}
	/**
	 * Setter of userID
	 */
	public void setUserID(int userID) { 
		 this.userID = userID; 
	}
	/**
	 * Getter of username
	 */
	public String getUsername() {
	 	 return username; 
	}
	/**
	 * Setter of username
	 */
	public void setUsername(String username) { 
		 this.username = username; 
	}
	/**
	 * Getter of password
	 */
	public String getPassword() {
	 	 return password; 
	}

	/**
	 * Setter of password
	 */
	public void setPassword(String password) { 
		 this.password = password; 
	} 

}
