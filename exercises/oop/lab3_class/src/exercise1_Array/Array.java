package exercise1_Array;

import java.util.Iterator;
import java.util.Scanner;

public class Array {
	
	private double m_arr[];
	private int m_length_array;
	private Scanner input = new Scanner(System.in);
	
	public Array() {
		System.out.println("default constructor");
	}
	
	public Array(int length) {
		if(length > 0)
		{
			m_arr = new double[length];
			m_length_array = length;
		}
		else
		{
			System.out.println("Give positive number for length of the array!");
			System.exit(-1);
		}
	}
	
	public int size() {return this.m_length_array; }
	public void read() {
		System.out.println("Give the elements of the array:  ");
		
		for (int i = 0; i < m_arr.length; i++) {
			System.out.print((i+1) + ":  ");
			m_arr[i] = input.nextDouble();
			
		}
	}
	
	public void print() {
		System.out.println("Array elements:  ");
		for (int i = 0; i < m_arr.length; i++) {
			System.out.print(m_arr[i] + "  ");
		}
	}
	
	public double avg() {
		double sum = 0.0d;
		
		for (int i = 0; i < m_arr.length; i++) {
			sum += m_arr[i];
		}
		
		return sum / m_arr.length;
	}
	
	public double min() {
		double small = m_arr[0];
		
		for (int i = 0; i < m_arr.length; i++) {
			if(m_arr[i] < small)
				small = m_arr[i];
		}
		
		return small;
	}
	
	public double max() {
		double big = m_arr[0];
		
		for (int i = 0; i < m_arr.length; i++) {
			if(m_arr[i] > big)
				big = m_arr[i];
		}
		
		return big;
	}
}
