package exercise6;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n:  ");
		int n = input.nextInt();
		
		int counter=0, value=1;
		String num;
		float sum=0.0f;
		while(counter < n)
		{
			num = Integer.toString(value);
			
			if(num.length() > 1)
			{
				if(num.charAt(num.length() - 1) == '1')
				{
					System.out.print(num + "  ");
					value = Integer.parseInt(num);
					sum += value;
					++counter;
					
				}
				else if(num.charAt(num.length() - 1) == '2')
				{
					System.out.print(num + "  ");
					value = Integer.parseInt(num);
					sum += value;
					++counter;
					
				}
				else if(num.charAt(num.length() - 1) == '7')
				{
					System.out.print(num + "  ");
					value = Integer.parseInt(num);
					sum += value;
					++counter;
					
				}
			}
			else
			{
				if(num.charAt(0) == '1')
				{
					System.out.print(num + "  ");
					value = Integer.parseInt(num);
					sum += value;
					++counter;
				}
				else if(num.charAt(0) == '2')
				{
					System.out.print(num + "  ");
					value = Integer.parseInt(num);
					sum += value;
					++counter;
					
				}
				else if(num.charAt(0) == '7')
				{
					System.out.print(num + "  ");
					value = Integer.parseInt(num);
					sum += value;
					++counter;
					
				}
				
			}
			
			
			++value;
			
		}
		
		System.out.print("  : " + sum);
		input.close();
	}

}
