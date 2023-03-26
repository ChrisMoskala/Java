package project;

import java.io.Serializable;

public class Pharmacy implements Serializable{
	private static final long serialVersionUID = 1L;
	private int drugs;
	private double price;
	Pharmacy(){
		drugs = 0;
		setPrice(10);
	}
	Pharmacy(int g){
		drugs = g;
		setPrice(35);
	}
	Pharmacy(int drug, double pric){
		drugs = drug;
		setPrice(pric);
	}
	
	public void setDrugs(int g) {
		this.drugs = g;
	}
	public int getDrugs() {
		return drugs;
	}
	public void setPrice(double g) {
		this.price = g;
	}
	public double getPrice() {
		return price;
	}
	public String buyDrugs(Patient a, int g) {
		String result;
		if (a.getDebt() > 3000) {
			result = "Pay off the debt first";
		}
		else if (getDrugs() - g < 0) {
			result = "Not enough medicines";
		}
		else {
			if (a.getMainClinic().equals(a.hospitalId)) {
			result = "Successfully sold " + g + " med(s) for the price: " + ((getPrice()*g)/2) + "$";
			a.setDebt(a.getDebt() + ((getPrice()*g)/2));
			this.setDrugs(getDrugs() - g);
			}
			else {
				result = "Successfully sold " + g + " med(s) for the price: " + ((getPrice()*g)) + "$";
				a.setDebt(a.getDebt() + ((getPrice()*g)));
				this.setDrugs(getDrugs() - g);
			}
		}
		return result;
	}
	public String toString() {
		return "Medicines available: " + getDrugs() + "     Price for each: " + getPrice() + "$";
	}
}
