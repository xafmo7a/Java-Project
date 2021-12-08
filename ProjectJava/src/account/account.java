package account;

public class account {
	private String username;
	private String password;
	private AccStatus AccStatus;
	public account (String U , String P , AccStatus Status){
		this.username=U;
		this.password=P;
		this.AccStatus=Status;
	}
	public AccStatus getAccStatus() {
		return AccStatus;
	}
	public void setAccStatus(AccStatus accStatus) {
		AccStatus = accStatus;
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
	@Override
	public String toString() {
		return "account [username=" + username + ", password=" + password
				+ ", AccStatus=" + AccStatus + "]";
	}
	
			


}
