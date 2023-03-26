package project;

import java.io.Serializable;

public class Parking_lot implements Serializable{
	private static final long serialVersionUID = 1L;
	private int slots;
	private int disabledSlots;
	Parking_lot(){
		setSlots(0);
		setDisabledSlots(0);
	}
	Parking_lot(int g){
		setSlots(100);
		setDisabledSlots(15);
	}
	Parking_lot(int slot, int disabledSlot){
		setSlots(slot);
		setDisabledSlots(disabledSlot);
	}
	public void setSlots(int g) {
		this.slots = g;
	}
	public int getSlots() {
		return slots;
	}
	public void setDisabledSlots(int g) {
		this.disabledSlots = g;
	}
	public int getDisabledSlots() {
		return disabledSlots;
	}
	public String toString() {
		return "Total slots: " + getSlots() + " , from which there are " + getDisabledSlots() + " slots for people with disabilities";
	}
}
