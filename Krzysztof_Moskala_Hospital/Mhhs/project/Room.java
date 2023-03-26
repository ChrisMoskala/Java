package project;

import java.io.Serializable;

public class Room implements Serializable{
	private static final long serialVersionUID = 1L;
	private String color;
	private String typeOfPaint;
	Room(){
		color = "gray";
		typeOfPaint = "classic";
	}
	Room(int g){
		color = "red";
		typeOfPaint = "premium";
	}
	Room(String colo, String typeOfPain){
		color = colo;
		typeOfPaint = typeOfPain;
	}
	public void setColor(String g) {
		this.color= g;
	}
	public String getColor() {
		return this.color;
	}
	public void setTypeOfPaint(String g) {
		this.typeOfPaint = g;
	}
	public String getTypeOfPaint() {
		return this.typeOfPaint;
	}
	public String toString() {
		return "Color of the room: " + getColor() + "     Type of paint: " + getTypeOfPaint();
	}
}	

