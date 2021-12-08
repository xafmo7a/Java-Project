package user;

public class Resident extends User {

private int Age;
private String Profession;
public Resident(String I, String FN, String mail, double PN , int A , String Pro) {
	super(I, FN, mail, PN);
	this.Age=A;
	this.Profession = Pro;	
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age =  (age<0)?0:age;
}
public String getProfession() {
	return Profession;
}
public void setProfession(String profession) {
	Profession = profession;
}
public String toString() {
	return "Resident [Age=" + Age + ", Profession=" + Profession + "]";
}

}
