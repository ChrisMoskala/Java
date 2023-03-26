package project;

import java.io.Serializable;

public class Equipment implements Serializable{
	private static final long serialVersionUID = 1L;
	private int plungers;
	private int laptops;
	private int scalpels;
	private int pulse_measurers;
	private int anesthetics;
	Equipment(){
		setPlungers(0);
		setLaptops(0);
		setScalpels(0);
		setPulse_measurers(0);
		setAnesthetics(0);
	}
	Equipment(int base){
		setPlungers(base);
		setLaptops(base);
		setScalpels(base);
		setPulse_measurers(base);
		setAnesthetics(base);
	}
	Equipment(int plunger, int laptop, int scalpel, int pulse_measurer, int anesthetic){
		setPlungers(plunger);
		setLaptops(laptop);
		setScalpels(scalpel);
		setPulse_measurers(pulse_measurer);
		setAnesthetics(anesthetic);
	}
	public void setPlungers(int g) {
		this.plungers = g;
	}
	public int getPlungers() {
		return this.plungers;
	}
	public void setLaptops(int g) {
		this.laptops = g;
	}
	public int getLaptops() {
		return this.laptops;
	}
	public void setScalpels(int g) {
		this.scalpels = g;
	}
	public int getScalpels() {
		return this.scalpels;
	}
	public void setPulse_measurers(int g) {
		this.pulse_measurers = g;
	}
	public int getPulse_measurers() {
		return pulse_measurers;
	}
	public void setAnesthetics(int g) {
		this.anesthetics = g;
	}
	public int getAnesthetics() {
		return anesthetics;
	}
	public String toString() {
		return "Plungers available: " + getPlungers() + "   Laptops available: " + getLaptops() + "   Scalpels available: " + getScalpels() + "   Pulse measurers available: " + getPulse_measurers() + "   Number of Anesthetics: " + getAnesthetics();
	}
}
