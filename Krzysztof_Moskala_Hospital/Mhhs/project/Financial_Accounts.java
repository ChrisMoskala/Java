package project;

import java.io.Serializable;

public class Financial_Accounts implements Serializable{
	private static final long serialVersionUID = 1L;
	private double total_money;
	private String account;
	Financial_Accounts(){
		setTotal_money(0);
		setAccount("Bank of Cyprus");
	}
	Financial_Accounts(String g){
		setTotal_money(20);
		setAccount("Bank of Cyprus");
	}
	Financial_Accounts(double total_mone, String accoun){
		setTotal_money(total_mone);
		setAccount(accoun);
	}
	public void setAccount(String g) {
		this.account = g;
	}
	public String getAccount() {
		return account;
	}
	public void setTotal_money(double g) {
		this.total_money = g;
	}
	public double getTotal_money() {
		return total_money;
	}
	public String toString() {
		return "Total ammount of money in budget: " + getTotal_money() + "$ in the " + getAccount() + " Bank";
	}
}
