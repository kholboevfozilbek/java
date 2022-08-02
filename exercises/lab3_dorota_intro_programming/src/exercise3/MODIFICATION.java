package exercise3;

import java.util.Scanner;

public class MODIFICATION {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float price = 2500.0f;
		int per;
		
		System.out.println("2500 zl is price for club membership");
		System.out.print("Enter percent of increase each year:  ");
		per = input.nextInt();
		
		if(per < 1 || per > 10)
		{
			System.out.println("invalid percent %");
			System.exit(-1);
		}
		
		float percent = per/100.0f;
		
		System.out.println("Expecnted fee after peroid of time:\n"
				+ "------------------------------------");
		
		for(int i=1; i<=6; ++i)
		{
			price = price + (float) (price*percent);
			System.out.println("After year " + i + " : " + price);
		}
		
		input.close();
	}

}
