package exercise2_Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	
	private String m_name;
	private String m_surname;
	private int m_index;
	private List<Float> m_marks = new ArrayList<>();
	
	
	public Student(String name, String surname, int index) {
		this.m_name = name;
		this.m_surname = surname;
		this.m_index = index;
	}
	
	public Student() {
		System.out.println("default constructor");
	}
	
	public Student(Student o) {
		
		if(this != o)
		{
			m_name = o.m_name;
			m_surname = o.m_surname;
			m_index = o.m_index;
			Collections.copy(this.m_marks, o.m_marks);
		}
	}
	
	@Override 
	public String toString()
	{
		return "Name: " + m_name + "\nSurname: " + m_surname + "\nIndex Number: " + m_index;
	}
	
	void setName(String name) {
		m_name = name;
	}
	
	void setSurname(String surname) {
		m_surname = surname;
	}
	
	void setIndex(int index) {
		m_index = index;
	}
	
	String getName() {return m_name; }
	String getSurname() {return m_surname; }
	int getIndex() {return m_index; }
	
	public void addMark(float new_mark) {
		if(new_mark > 2.0 && new_mark <= 5.0)
		{
			m_marks.add(new_mark);
		}
		else
		{
			System.out.println("Please enter the VALID grade!");
		}
	}
	
	public float avgGrade() {
		float sum = 0.0f;
		for(Float x : m_marks) {
			sum += x;
		}
		
		return sum / m_marks.size();
	}
	
	public void print() {
		System.out.println("Name: " + m_name + "\nSurname: " + m_surname + "\nIndex Number: " + m_index);
		
		System.out.println("Marks:  ");
		for(Float x : m_marks)
		{
			System.out.print(x + "  ");
		}
	}
}