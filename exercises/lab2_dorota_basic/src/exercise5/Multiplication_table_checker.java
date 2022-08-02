package exercise5;

import java.util.Scanner;
import java.lang.Math;

public class Multiplication_table_checker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int random1=0;
		int random2=0;
		int user_answer=0, score=0;
		
		System.out.println("Lets check your knowledge");
		System.out.println("MULTIPLICATION TABLE");
		System.out.println("-------------------------");
		
		for(int i=0; i<10; ++i)
		{
			double temp = Math.random() * 10;
			random1 = (int)temp;
			temp = Math.random() * 10;
			random2 = (int)temp;
			
			while(random1 == random2)
			{
				temp = Math.random() * 10;
				random2 = (int)temp;
			}
			
			System.out.print(random1 + " * " + random2 + " =  ");
			user_answer = input.nextInt();
			
			if(user_answer == random1 * random2)
			{
				System.out.println("CORRECT");
				++score;
			}
			else
			{
				System.out.println("WRONG! -> ANSWER: " + (random1*random2));
			}
		}
		
		System.out.println("\n------------------------------");
		System.out.println("YOU HAVE ANSWERED " + score + " CORRECTLY");
		System.out.print("YOUR SCORE:  ");
		
		switch(score)
		{
		case 10:
			System.out.println("5");
			break;
		case 9:
			System.out.println("4.5");
			break;
		case 8:
			System.out.println("4");
			break;
		case 7:
			System.out.println("3.5");
			break;
		case 6:
			System.out.println("3");
			break;
		default:
			System.out.println("2");	
		}
		
		input.close();
	}

}
