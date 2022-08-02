package exercise2_PizzeriaOrder;


public class Main {

	public static void main(String[] args) {
		
		PizzaOrder o1 =  new PizzaOrder("John Smith");
		System.out.println(PizzaOrder.getOrderCount());
		System.out.println(o1.getCustomerName()); //should be John Smith
		
		o1.addDish("garlic bread", 10);
		o1.addDish("Margherita pizza", 25);
		System.out.println(o1.getValueOrder()); //should be 35
		
		System.out.println(o1);

	}

}
