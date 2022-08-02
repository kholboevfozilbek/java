package exercise6;

import java.util.Scanner;

public class DigitIncreaser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if(number <= 0)
		{
			System.out.println("Positive number please!");
			System.exit(-1);
		}
		
		int new_number=number;
		String num = Integer.toString(new_number);
		int i = num.length()-1;
		int eachdigit;
		char each_d_string;
	
		while(number > 0)
		{
			eachdigit = number%10;
			
			if(eachdigit == 9)
			{
				
				eachdigit = 0;
			}
			else
			{
				each_d_string = (char)(eachdigit + '0');
				num.charAt(i) = each_d_string;
				++eachdigit;
			}
		}
		
		input.close();

	}

}
