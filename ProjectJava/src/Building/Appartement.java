package Building;

public class Appartement {
private int ID;
private int [] MotionSensor =new int[]{0,1};
private float [] TemperatureSensor = new float[]{0,};
public Appartement (int I){
	this.ID=I;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = (iD<0)?0:iD;
}
@Override
public String toString() {
	return "Appartement [ID=" + ID + "]";
}
}
