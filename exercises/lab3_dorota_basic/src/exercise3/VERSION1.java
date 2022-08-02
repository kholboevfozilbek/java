package exercise3;

import java.util.Scanner;

public class VERSION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x=0;
		float sum=0.0f;
		
		for(int i=0; i<5; ++i)
		{
			System.out.println(i+1 + ":  ");
			x = input.nextInt();
			
			sum += x;
		}
		
		System.out.println("\nSum:  " + sum);
		System.out.println("Average:  " + sum/5.0f);
		
		input.close();
	}

}
