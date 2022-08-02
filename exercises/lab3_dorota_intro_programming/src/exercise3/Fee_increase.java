package exercise3;

public class Fee_increase {

	public static void main(String[] args) {
		
		System.out.println("2500 zl is price for club membership");
		System.out.println("each year 4% increase");
		System.out.println("Expecnted fee after peroid of time:  ");
		System.out.println("------------------------------------");
		
		float price = 2500.0f;
		for(int i=1; i<=6; ++i)
		{
			price = price + (float) (price*0.04);
			System.out.println("After year " + i + " : " + price);
		}

	}

}
