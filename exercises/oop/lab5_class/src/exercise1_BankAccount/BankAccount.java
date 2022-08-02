package exercise1_BankAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount {
	
	private String m_accountnumber;
	private double m_balance;
	private String m_holder_name;
	private int m_valid_moth;
	private int m_valid_year;
	private List<Float> m_operations = new ArrayList<>();
	
	
	public BankAccount(String full_name, String account_num, int valid_month, int valid_year) {
		this.m_holder_name = full_name;
		this.m_accountnumber = account_num;
		this.m_valid_moth = valid_month;
		this.m_valid_year = valid_year;
	}
	
	public BankAccount(BankAccount o) {
		if(this != o)
		{
			this.m_accountnumber = o.m_accountnumber;
			this.m_balance = o.m_balance;
			Collections.copy(this.m_operations, o.m_operations);
		}
	}
	
	public BankAccount() {
		System.out.println("Default Constructor");
	}

	public void setAccountNumber(String acc_num) {
		this.m_accountnumber = acc_num;
	}
	
	public void setBalance(double balance) {
		this.m_balance = balance;
	}
	
	public void setHolderName(String m_holder_name) {
		this.m_holder_name = m_holder_name;
	}
	
	public void setValidMonth(int m_valid_moth) {
		this.m_valid_moth = m_valid_moth;
	}
	
	public void setValidYear(int m_valid_year) {
		this.m_valid_year = m_valid_year;
	}
	
	
	public String getAccountNumber() {return this.m_accountnumber; }
	
	public double getBalance() {return this.m_balance; }

	public String getHolderName() {
		return m_holder_name;
	}


	public int getValidMonth() {
		return m_valid_moth;
	}

	public int getValidYear() {
		return m_valid_year;
	}

	
	@Override
	public String toString() {
		return "Full Name: " + this.m_holder_name + "\nBalance: " + 
					Double.toString(this.m_balance) + "\nAccount Number: " + 
					this.m_accountnumber + "\nValid Thru: " + Integer.toString(this.m_valid_moth) + "/" + Integer.toString(this.m_valid_year);
	}
	
	public void addOperation(float new_operation) {
		// positive  + means income
		// negative  - means outcomes
		
		if(new_operation != 0)
		{
			this.m_operations.add(new_operation);
			
			this.m_balance = this.m_balance + new_operation;
		}
	}
	
	public float getIncomes() {
		float sum=0.0f;
		for(Float x : this.m_operations)
		{
			if(x > 0)
				sum += x;
		}
		
		return sum;
	}
	
	public float getOutcomes() {
		float sum=0.0f;
		for(Float x : this.m_operations)
		{
			if(x < 0)
				sum += x;
		}
		
		return sum;
	}
	
	
	
}
