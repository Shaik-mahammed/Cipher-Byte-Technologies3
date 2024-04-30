package mahaboob.com23CipherbyteTechnologies;

class User {
	private String username;
	private String password;
	// Other profile information

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		// Initialize other profile information
	}

	// Getters and setters for profile information

	public boolean authenticate(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}
}














