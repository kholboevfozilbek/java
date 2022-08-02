package exercise4;

import java.util.Scanner;

public class profit_or_loss {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float cost=0.0f, selling=0.0f;
		
		System.out.print("Enter cost price of item :  ");
		cost = input.nextFloat();
		System.out.print("Enter selling price of item :  ");
		selling = input.nextFloat();
		
		if(selling > cost)
		{
			System.out.println((selling - cost) + " profit");
		}
		else if(cost > selling)
		{
			System.out.println((cost - selling) + " loss");
		}
		else 
		{
			System.out.println("No profit no loss");
		}
		
		input.close();
	}

}
