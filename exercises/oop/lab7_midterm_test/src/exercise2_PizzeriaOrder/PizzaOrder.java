package exercise2_PizzeriaOrder;

import exercise1_ConsumerOrder.ConsumerOrder;

public class PizzaOrder extends ConsumerOrder{

	 /*public PizzaOrder() {
		System.out.println("Everything has been set up default values!");
		m_numberorders++;
		m_id = m_numberorders;
	 }*/
	
	public PizzaOrder(String cus_name) {
		setCustomerName(cus_name); 
		m_numberorders++;
		m_id = m_numberorders;
		System.out.println("\nParameterized Constructor");
	}
}
