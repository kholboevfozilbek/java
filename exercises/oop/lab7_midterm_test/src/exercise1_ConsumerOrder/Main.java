package exercise1_ConsumerOrder;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(ConsumerOrder.getOrderCount()); //should be 0
		ConsumerOrder o1 = new ConsumerOrder("John Smith");
		System.out.println(o1.getCustomerName()); //should be John Smith
		o1.addDish("vegetable soup", 20);
		o1.addDish("apple pie", 19);
		System.out.println(o1.length()); //should be 2
		
		System.out.println(o1);
		
		ConsumerOrder oo = new ConsumerOrder("Andrew Taylor");
		oo.addDish("tomato soup", 20);
		oo.addDish("grilled chicken", 45);
		oo.addDish("tomato soup", 20);
		oo.addDish("ice cream", 15);
		
		if (oo.isGreater(o1) == true)
			System.out.println("\norder " + oo.getId() + 
					" is more expensive than " + o1.getId());
		
		oo.removeDish("tomato soup");
		System.out.println(oo);
		
		System.out.println(ConsumerOrder.getOrderCount());
	}

}
