package project;

import java.io.Serializable;

public class Patient extends Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String injury;
	private double debt = 0;
	
	 Patient() {
		super();
		injury = "Unknown";
	}
	Patient(String nam, String injur, String mainClini) {
		super(nam);
		injury = injur;
		setMainClinic(mainClini);
	}
	Patient(String first, String last, String date, String injur, int idi, double deb, String mainClini) {
		super(first, last, date);
		injury = injur;
		debt = deb;
		id = idi;
		setMainClinic(mainClini);
	}
	
	public void setDebt(double g) {
		this.debt = g;
	}
	public double getDebt() {
		return this.debt;
	}
	public void payDebt(double g) {
		this.debt = this.debt - g;
	}
	public void setInjury(String g) {
		this.injury = g;
	}
	public String getInjury() {
		return this.injury;
	}
	public void setId(int g) {
		this.id = g;
	}
	public int getId() {
		return this.id;
	}
	
	public String toString() {
		return "Id: " + getId() + "   Name of the patient: " + getName() + "   Surname of the patient: " + getSurname() + "   Born: " + getBirthDate() + "   Injury: " + getInjury() + "   Debt: " + getDebt()+ "$";
	}
}
