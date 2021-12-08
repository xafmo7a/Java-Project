package Building;

public class Floor {
private int level;
public Floor(int lvl){
	this.level=lvl;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
@Override
public String toString() {
	return "Floor [level=" + level + "]";
}
}
