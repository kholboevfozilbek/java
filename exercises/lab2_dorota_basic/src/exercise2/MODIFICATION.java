package exercise2;

import java.util.Scanner;

public class MODIFICATION {
	

	static boolean valid_grade(float grade)
	{
		if(grade == 2)
			return true;
		else if(grade == 3)
			return true;
		else if(grade == 3.5)
			return true;
		else if(grade == 4)
			return true;
		else if(grade == 4.5)
			return true;
		else if(grade == 5)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float grade1=0.0f, grade2=0.0f, grade3=0.0f;
		int weight1=0, weight2=0, weight3=0;
		
		System.out.println("Enter 3 grades");
		System.out.println("--------------");
		
		System.out.print("Grade 1:  ");
		grade1 = input.nextFloat();
		if(valid_grade(grade1) == false)
		{
			System.out.println("Invalid garde is given for grade1");
			System.exit(-1);
		}
		System.out.print("Grade 2:  ");
		grade2 = input.nextFloat();
		if(valid_grade(grade2) == false)
		{
			System.out.println("Invalid garde is given for grade2");
			System.exit(-1);
		}
		System.out.print("Grade 3:  ");
		grade3 = input.nextFloat();
		if(valid_grade(grade3) == false)
		{
			System.out.println("Invalid garde is given for grade3");
			System.exit(-1);
		}
		
		System.out.println("Enter 3 weights(respectively)");
		System.out.println("-----------------------------");
		
		System.out.print("Weight 1:  ");
		weight1 = input.nextInt();
		System.out.print("Weight 2:  ");
		weight2 = input.nextInt();
		System.out.print("Weight 3:  ");
		weight3 = input.nextInt();
		
		System.out.print("\nWeightted arithmetic average:  ");
		System.out.println(((grade1*weight1 + grade2*weight2 + grade3*weight3) / (weight1+weight2+weight3)));
		input.close();
	}
	
	

}
