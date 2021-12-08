package user;

public class User {
	private String ID;
	private String FullName;
	private String Email;
	private double PhoneNumber;
	
	
	public User (String I , String FN , String mail , double PN  ){
		this.ID=I;
		this.FullName=FN;
		this.Email=mail;
		this.PhoneNumber=PN;
		
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getFullName() {
		return FullName;
	}


	public void setFullName(String fullName) {
		FullName = fullName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public double getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(double phoneNumber) {
		PhoneNumber = (phoneNumber<0.0)?0.0:phoneNumber;
	}


	public String toString() {
		return "User [ID=" + ID + ", FullName=" + FullName + ", Email=" + Email
				+ ", PhoneNumber=" + PhoneNumber + "]";
	}
	
	

}
