package exercise2_Employee;

public class Employee {
	
	private String m_name;
	private String m_surname;
	private String m_position;
	private float m_salaray;
	
	Employee() {
		System.out.println("Default constructor by me!");
	}
	
	Employee(String name, String surname, String pos, float sal)
	{
		this.m_name = name;
		this.m_surname = surname;
		this.m_position = pos;
		this.m_salaray = sal;
	}
	
	@Override
	public String toString()
	{
		return m_name + " " + m_surname + "  " + "\nPosition:  " + m_position + "\nSalary:  " + Float.toString(m_salaray);
	}
	
	//setters
	void setName(String name) {this.m_name = name; }
	void setSurname(String surname) {this.m_surname = surname; }
	void setPosition(String pos) {this.m_position = pos; }
	void setSalary(float sal) {this.m_salaray = sal; }
	
	//getters
	String getName() {return this.m_name; }
	String getSurname() {return this.m_surname; }
	String getPosition() {return this.m_position; }
	String getSalary() {return Float.toString(m_salaray); }
	
	public void incSalary(float newSal) {
		if(newSal > 0)
			this.m_salaray = newSal;
		else
		{
			System.out.println("Please enter positive number for salary");
			System.exit(-1);
		}
	}
	
	public void print() {
		System.out.println("Name: " + m_name);
		System.out.println("Surname: " + m_surname);
		System.out.println("Position: " + m_position);
		System.out.println("Salary: " + m_salaray);
	}
}
