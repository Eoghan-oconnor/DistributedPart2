package ie.gmit.ds;

public class User {
	
	//Adapted from: https://github.com/john-french/artistAPI-dropwizard-soln

	private int userId;
	

	private String userName;
	private String email;
	private String password;
	private String hashedpassword;
	private String salt;

	public User() {
		super();
		// Needed for Jackson deserialisation

	}

	// everything
	public User(int userId, String userName, String email, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	// login 
	public User(int userId, String userName, String email, String hashedpassword, String salt) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.hashedpassword = hashedpassword;
		this.salt = salt;
	}
	
	
	public int getUserId() {
		return userId;
		
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getHashedpassword() {
		return hashedpassword;
	}

	public String getSalt() {
		return salt;
	}


	
	

}
