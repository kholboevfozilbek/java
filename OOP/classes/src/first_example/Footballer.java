package first_example;


public class Footballer 
{
	private String name;
	private String surname;
	private int number;
	private String position;
	private String club;
	private String origin_country;
	private float salary;
	
	private int speed;
	private int shoot;
	private int dribbling;
	private int pass;
	
	Footballer()
	{
		
	}
	
	Footballer(String n, String s, int num, String p, String c)
	{
		name = n;
		surname = s;
		number = num;
		position = p;
		club = c;
	}
	
	public void print()
	{
		System.out.println("Name:  " + name);
		System.out.println("Surname:  " + surname);
		System.out.println("Number:  " + number);
		System.out.println("Position:  " + position);
		System.out.println("Club:  " + club);
	}
}
