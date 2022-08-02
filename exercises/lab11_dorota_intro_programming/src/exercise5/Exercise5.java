package exercise5;

import java.util.Random;

public class Exercise5 {

	public static void main(String[] args) {
		
		roll_dice();
	}
	
	public static void roll_dice()
	{
		boolean not_same = true;
		Random rand = new Random();
		int arr[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = rand.nextInt(6);
			System.out.println("Dice " + (i+1) + ":  " + arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i != arr.length - 1)
			{
				if(arr[i] != arr[i+1])
				{
					System.out.println("TRY AGAIN!");
					not_same = false;
					break;
				}
			}
		}
		
		if(not_same == true)
		{
			
			if(arr[arr.length-1] == arr[arr.length - 2])
			{
				System.out.println("Yahtzee");
			}
			else
				System.out.println("TRY AGAIN");
		}
	}

}
