package entity;

public class Account {
	private int accountid;
	private String username;
	private String password;

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account(int accountid, String username, String password) {
		super();
		this.accountid = accountid;
		this.username = username;
		this.password = password;
	}


}
