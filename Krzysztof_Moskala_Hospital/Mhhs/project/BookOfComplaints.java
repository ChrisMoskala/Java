package project;

import java.io.Serializable;

public class BookOfComplaints implements Serializable{
	private static final long serialVersionUID = 1L;
	private int complaints;
	private int praises;
	BookOfComplaints(){
		setComplaints(0);
		setPraises(0);
	}
	BookOfComplaints(int k){
		setComplaints(100);
		setPraises(10);
	}
	BookOfComplaints(int complaint, int praise){
		setComplaints(complaint);
		setPraises(praise);
	}
	public void setComplaints(int g) {
		this.complaints = g;
	}
	public int getComplaints() {
		return complaints;
	}
	public void setPraises(int g) {
		this.praises = g;
	}
	public int getPraises() {
		return praises;
	}
	public String toString() {
		return "How many complaints: " + getComplaints() + "     How many praises: " + getPraises();
	}
}
