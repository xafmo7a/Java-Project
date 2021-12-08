package Building;

public class Street {
	private String Name;
	private String ID;
	public Street (String N , String I){
		this.Name=N;
		this.ID=I;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Street [Name=" + Name + ", ID=" + ID + "]";
	}
}
