package footballer;


public class Footballer
{
	protected String m_name;
	protected String m_surname;
	protected String m_position;
	protected String m_club;
	protected String m_country;
	protected int m_number;
	protected int m_age;
	protected float m_salary;
	
	public Footballer(String n, String surname, String club, String pos, int number, int age, float sal) {
		
		m_name = n;
		m_surname = surname;
		m_position = pos;
		m_club = club;
		m_number = number;
		m_age = age;
		m_salary = sal;
	}
	
}