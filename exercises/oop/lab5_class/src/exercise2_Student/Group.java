package exercise2_Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {

	private int m_number;
	private List<Student> m_list = new ArrayList<Student>();
	
	public Group() {
		System.out.println("default constructor");
		// the reason why we are not assiging default value 
		// is that java itself provides with correct default values
	}
	
	public Group(int n) {
		m_number = n;
	}
	
	public Group(Group o) {
		if( this != o)
		{
			this.m_number = o.m_number;
			Collections.copy(this.m_list, o.m_list);
			
		}
	}
	
	public void setNumber(int n) {m_number= n; }
	public int getNumber() {return m_number; }
	
	public int getNumberStudents() {
		return m_list.size();
	}
	
	public void addStudent(Student o) {
		if(m_list.contains(o) == false)
			m_list.add(o);
		else
			System.out.println("\nStudent ALREADY exists in List!");
	}
	public void removeStudent(Student o) {
		
		if(m_list.remove(o) == true)
		{
			System.out.println("\nStudent has been removed");
		}
		else
		{
			System.out.println(o.getName() + " Student does not exist in the group");
		}
	}
	
	public void print() {
		System.out.println("\nGroup number: " + m_number);
		System.out.println("Number of students: " + getNumberStudents());
		System.out.println("List of Students:  \n---------------------------");
		
		for(Student x : m_list)
		{
			System.out.println("Full Name: " + x.getName() + " " + x.getSurname());
		}
	}
	
	public Student bestStudent() {
		
		float big = m_list.get(0).avgGrade();
		int i= 0, index=0;
		for(Student x : m_list)
		{
			if(x.avgGrade() > big)
			{
				big = x.avgGrade();
				index = i;
			}
			++i;
		}
		
		return m_list.get(index);
	}
}
