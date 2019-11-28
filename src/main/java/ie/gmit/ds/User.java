package ie.gmit.ds;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	// Adapted from: https://github.com/john-french/artistAPI-dropwizard-soln

	@NotNull
	private int userId;
	@NotNull
	private String userName;
	@NotNull
	private String email;
	@NotNull
	private String password;
	@NotNull
	private String hashedpassword;
	@NotNull
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
	
	@JsonProperty
	public int getUserId() {
		return userId;

	}
	@JsonProperty
	public String getUserName() {
		return userName;
	}
	@JsonProperty
	public String getEmail() {
		return email;
	}
	@JsonProperty
	public String getPassword() {
		return password;
	}
	@JsonProperty
	public String getHashedpassword() {
		return hashedpassword;
	}
	@JsonProperty
	public String getSalt() {
		return salt;
	}

}
