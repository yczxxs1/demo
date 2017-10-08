package entity;

public class Pi {
	private int pid;
	private String realname;
	private Account account;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Pi(int pid, String realname, Account account) {
		super();
		this.pid = pid;
		this.realname = realname;
		this.account = account;
	}

}
