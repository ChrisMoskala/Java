package project;

import java.io.Serializable;

public class Staff extends Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String occupancy;
	private String floor;
	private String equipment;
	private double salary;
	Staff() {
		super();
		occupancy = "Intern";
		floor = "2";
		equipment = "Laptop";
		salary = 500;
		setMainClinic();
	}
	Staff(String nam) {
		super(nam);
		occupancy = "Toilet cleaner";
		floor = "2";
		equipment = "Toilet Plunger";
		salary = 2137;
		setMainClinic();
	}
	Staff(String first, String last, String date, String occupanc, String equipmen, String floo, int idi, double salar) {
		super(first, last, date);
		occupancy = occupanc;
		floor = floo;
		equipment = equipmen;
		salary = salar;
		id = idi;
		setMainClinic();
	}
	
	public void setSalary(double g) {
		this.salary = g;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setFloor(String g) {
		this.floor = g;
	}
	public String getFloor() {
		return this.floor;
	}
	public void setOccupancy(String g) {
		this.occupancy = g;
	}
	public String getOccupancy() {
		return this.occupancy;
	}
	public void setEquipment(String g) {
		this.equipment = g;
	}
	public String setEquipment(String g, Equipment a) {
		String result;
		switch(g) {
		case "Toilet plunger":
			if (a.getPlungers() > 0) {
			this.equipment = this.equipment + " + Toilet plunger";
			a.setPlungers(a.getPlungers()-1);
			result = "Succesfully added 1 plunger to the equipment";
			}
			else {
				result = "Not enough plungers in the stash";
			}
			break;
		case "Laptop":
			if (a.getLaptops() > 0) {
			this.equipment = this.equipment + " + Laptop";
			a.setLaptops(a.getLaptops()-1);
			result = "Succesfully added 1 laptop to the equipment";
			}
			else {
				result = "Not enough laptops in the stash";
			}
			break;
		case "Scalpel":
			if (a.getScalpels() > 0) {
			this.equipment = this.equipment + " + Scalpel";
			a.setScalpels(a.getScalpels()-1);
			result = "Succesfully added 1 scalpel to the equipment";
			}
			else {
				result = "Not enough scalpels in the stash";
			}
			break;
		case "Pulse measurer":
			if (a.getPulse_measurers() > 0) {
			this.equipment = this.equipment + " + Pulse measurer";
			a.setPulse_measurers(a.getPulse_measurers()-1);
			result = "Succesfully added 1 pulsemeasurer to the equipment";
			}
			else {
				result = "Not enough pulsemeasurers in the stash";
			}
			break;
		case "Anesthetic":
			if (a.getAnesthetics() > 0) {
			this.equipment = this.equipment + " + Anesthetic";
			a.setAnesthetics(a.getAnesthetics()-1);
			result = "Succesfully added 1 anesthetic to the equipment";
			}
			else {
				result = "Not enough anesthetics in the stash";
			}
			break;
			
			default: result = "Invalid item";
		}
		return result;
	}
	public String getEquipment() {
		return this.equipment;
	}
	public void setId(int g) {
		this.id = g;
	}
	public int getId() {
		return this.id;
	}
	public void setMainClinic() {
		super.setMainClinic("UwU clinic simulator");
	}
	public String toString() {
		return "Id: " + getId() + "   Name of the patient: " + getName() + "   Surname of the patient: " + getSurname() + "   Born: " + getBirthDate() + "   Floor: " + getFloor() + "   Occupancy: " + 
	getOccupancy() + "   Salary: " + getSalary() + "$";
	}
}
