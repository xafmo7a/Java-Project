package Building;

public class Building {
	private String ID;
	private BuildingType BuildingT;
	public Building (String I , String BT){
		this.ID=I;
		setBuildingT(BT);
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public BuildingType getBuildingT() {
		return BuildingT;
	}
	public void setBuildingT(String bT) {
		 if (bT.equalsIgnoreCase(BuildingType.RESIDENTIAL.name())
	                || bT.equalsIgnoreCase(BuildingType.INSTENTIAL.name())
	                || bT.equalsIgnoreCase(BuildingType.BUSINESS.name())
	                || bT.equalsIgnoreCase(BuildingType.INDUSTRIAL.name())) {
			 bT = bT.toUpperCase();
	            this.BuildingT = BuildingType.valueOf(bT);
	}}
	@Override
	public String toString() {
		return "Building [ID=" + ID + ", BuildingT=" + BuildingT + "]";
	}
	
}
