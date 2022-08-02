package exercise7;

import java.util.Scanner;
import com.exercise6.MODOFICATION.*;

public class Prime_Numbers {

	static boolean relative_prime(int i, int n)
	{
		int gcd = MODOFICATION.gcd(i, n);
		
		if(gcd != 1)
		{
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n:  ");
		int n = input.nextInt();
		float sum=0.0f;
		
		for(int i=1; i<n; ++i)
		{
			if(relative_prime(i, n) == true)
			{
				System.out.print(i + " ");
				sum += i;
			}
		}
		
		System.out.println("\nSum:   " + sum );
		input.close();

	}

}
