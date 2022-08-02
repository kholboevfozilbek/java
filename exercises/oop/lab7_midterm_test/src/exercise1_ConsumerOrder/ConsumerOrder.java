package exercise1_ConsumerOrder;

import java.util.ArrayList;
import java.util.List;

public class ConsumerOrder {
	
	protected String m_customername;
	protected List<String> m_listdishes = new ArrayList<String>();
	protected List<Float> m_pricedishes = new ArrayList<Float>();
	protected double m_valueorder;
	protected int m_id;
	protected static int m_numberorders = 0;
	
	
	public ConsumerOrder() {
		System.out.println("Everything has been set up default values!");
		m_numberorders++;
		m_id = m_numberorders;
	}
	
	public ConsumerOrder(String cus_name) {
		setCustomerName(cus_name); 
		m_numberorders++;
		m_id = m_numberorders;
	}

	public String getCustomerName() {
		return m_customername;
	}

	public void setCustomerName(String n) {
		this.m_customername = n;
	}

	public double getValueOrder() {
		return m_valueorder;
	}

	public void setValueOrder(double m_valueorder) {
		this.m_valueorder = m_valueorder;
	}

	public int getId() {
		return m_id;
	}
	
	public void print() {
		System.out.println("\n--------------------------");
		System.out.println("Customer:  " + m_customername);
		System.out.println("List of dishes:  \n");
		
		for (int i = 0; i < m_listdishes.size(); i++) {
			System.out.println(m_listdishes.get(i) + "  ->  " + m_pricedishes.get(i) + " zl");
		}
		System.out.println("\nOverall:  -> " + Math.round(m_valueorder) + " zl");
	}

	public void addDish(String name_dish, float price_dish) {
		m_listdishes.add(name_dish);
		m_pricedishes.add(price_dish);
		m_valueorder += price_dish;
		
	}
	
	public void removeDish(String dish_name) {
		
		for (int i = 0; i < m_listdishes.size(); i++) {
			if(m_listdishes.get(i) == dish_name)
			{
				m_listdishes.remove(i);
				m_valueorder -= m_pricedishes.get(i);
				m_pricedishes.remove(i);
			}
		}
		
	}
	
	public int length() {return m_listdishes.size(); }
	
	public static int getOrderCount() {return m_numberorders; }
	
	boolean isGreater(ConsumerOrder o) {
		if(this.getValueOrder() > o.getValueOrder())
			return true;
		return false;
	}
	
	public double at(int index) {
		if(index < 0 || index > m_listdishes.size()-1)
		{
			System.out.println("[Error:  Wrong index ]");
			return -1;
		}
		else
		{
			return m_pricedishes.get(index);
		}
	}
	
	@Override
	public String toString() {
		String finall = "Order no. " + Integer.toString(getId()) + ";" +
				"customer: " + this.getCustomerName() + "\n";
		for(int i=0; i<m_listdishes.size(); ++i) {
			finall += Integer.toString(i+1) + ". " + m_listdishes.get(i) + ", " +
					m_pricedishes.get(i) + "\n";
		}
		
		finall += "Total Cost: " + this.getValueOrder() + "\n";
		
		return finall;
	}
}
