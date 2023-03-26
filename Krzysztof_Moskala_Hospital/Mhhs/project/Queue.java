package project;

import java.io.Serializable;

public class Queue implements Serializable{
	private static final long serialVersionUID = 1L;
	private double time;
	private String mood;
	Queue(){
		time = 0;
		mood = "Happy";
	}
	Queue(int g){
		time = 15;
		mood = "Average";
	}
	Queue(double tim, String moo){
		time = tim;
		mood = moo;
	}
	public void setTime(double g) {
		this.time = g;
	}
	public double getTime() {
		return time;
	}
	public void setMood(String g) {
		this.mood = g;
	}
	public String getMood() {
		return mood;
	}
	public String toString() {
		return "Average waiting time is: " + getTime() + " minutes and the mood of people in queue is: " + getMood();
	}
}
