package project;

import java.io.Serializable;

public class HospitalFloor implements Serializable{
	private static final long serialVersionUID = 1L;
	private String type;
	private String sound;
	HospitalFloor(){
		setType("Wooden");
		setSound("Krrrt");
	}
	HospitalFloor(int k){
		setType("Stone");
		setSound("Szchrrr");
	}
	HospitalFloor(String typ, String soun){
		setType(typ);
		setSound(soun);
	}
	public void setType(String g) {
		this.type = g;
	}
	public String getType() {
		return type;
	}
	public void setSound(String g) {
		this.sound = g;
	}
	public String getSound() {
		return sound;
	}
	public String toString() {
		return "Type of floor: " + getType() + "     The sound it makes: " + getSound();
	}
}
