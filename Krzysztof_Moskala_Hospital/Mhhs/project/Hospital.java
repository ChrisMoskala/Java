package project;

import java.io.Serializable;

public class Hospital implements BuildingOrRoom, Serializable{
	private static final long serialVersionUID = 1L;
	private double width;
	private double height;
	private double length;
	private double floorSize;
	private double area;
	private int numberOfFloors;
	Hospital(){
		width = 0;
		length = 0;
		height = 0;
		setFloorSize(0,0);
		setArea(0,0,0);
		numberOfFloors = 0;
	}
	//What if it is an open air?
	Hospital(double widt, double lengt){
		width = widt;
		length = lengt;
		height = Double.POSITIVE_INFINITY;
		setFloorSize(widt, lengt);
		setArea(widt, lengt, Double.POSITIVE_INFINITY);
		numberOfFloors = 1;
	}
	Hospital(double widt, double lengt, double heigh, int numberOfFloor){
		width = widt;
		length = lengt;
		height = heigh;
		setFloorSize(widt, lengt);
		setArea(widt, lengt, heigh);
		numberOfFloors = numberOfFloor;
	}
	public void setWidth(double g) {
		this.width = g;
	}
	public double getWidth() {
		return this.width;
	}
	public void setLength(double g) {
		this.length = g;
	}
	public double getLength() {
		return this.length;
	}
	public void setHeight(double g) {
		this.height = g;
	}
	public double getHeight() {
		return this.height;
	}
	public void setFloors(int g) {
		this.numberOfFloors = g;
	}
	public double getFloors() {
		return this.numberOfFloors;
	}
	public void setFloorSize(double w, double l) {
		this.floorSize = w*l;
	}
	public double getFloorSize() {
		return this.floorSize;
	}

	public void setArea(double w, double l, double h) {
		this.area = w*l*h;
	}
	public double getArea() {
		return this.area;
	}

	public String toString() {
		return "Width: " + getWidth() + "m  Length: " + getLength() + "m  Height: " + getHeight() + "m  Floor size: " + getFloorSize() + "m^2" + "  Number of floors: " + getFloors() + "  Area: " + getArea() + "m^3";
	}
}
