package project;

import java.io.Serializable;

public abstract class Person extends MainClinic implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private String birthDate;
	private String mainClinic;
	 Person() {
		name = "Unknown";
		surname = "Unknown";
		birthDate = "0";
		mainClinic = "Unknown";
	}
	 Person(String nam) {
		if (name.equals("Damian")) {
			name = "Damian";
			surname = "Bakowski";
			birthDate = "0";
		}
		else if (name.equals("Pamwel")) {
			name = "Pawel";
			surname = "Olbrych";
			birthDate = "0";
		}
		else {
			name = "Unknown";
			surname = "Unknown";
			birthDate = "0";
		}

	}
	 Person(String first, String last, String date) {
		name = first;
		surname = last;
		birthDate = date;
	}
	public void setName(String g) {
			this.name = g;
	}
	public String getName() {
		return this.name;
	}
	public void setSurname(String g) {
		this.surname = g;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setBirthDate(String g) {
		this.birthDate = g;
	}
	public String getBirthDate() {
		return this.birthDate;
	}
	public void setMainClinic(String g) {
		this.mainClinic = g;
	}
	public String getMainClinic() {
		return this.mainClinic;
	}
	public abstract String toString();
}

