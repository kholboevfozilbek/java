package do_while_loop;

import java.util.Scanner;

public class do_while_loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dividend=0;
		int divisor=0;
		char choice=' ';
		
		do
		{
			System.out.print("Enter the dividend:  ");
			dividend = input.nextInt();
			System.out.print("Enter the divisor:  ");
			divisor = input.nextInt();
			
			if(divisor != 0)
			{
				System.out.print("Quotient is " + (dividend/divisor));
				System.out.println(" , remainder is " + (dividend%divisor));
			}
			else
			{
				System.out.println("Divisor can NOT be 0!");
			}
			System.out.println("Do you want to continue? [y/n]:  ");
			choice = input.next().charAt(0);
			
		}
		while(choice == 'y' || choice == 'Y');
		
		input.close();
	}

}
