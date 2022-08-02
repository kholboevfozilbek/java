
package exercise1;

import java.util.ArrayList;
import java.util.List;

public class FigureSet 
{
	private List<Figure> m_list = new ArrayList<>();
	
	
	public FigureSet() {
		
	}
	
	public void addFigure(Figure o) {
		
		m_list.add(o);
	}
	
	public void removeAll() {
		m_list.clear();
	}
	
	public float getSummaryArea() {
		float sum= 0.0f;
		for(Figure x : m_list) {
			sum += x.getArea();
		}
		
		return sum;
	}
	
	public float getSummaryPerimeter() {
		float sum = 0.0f;
		for(Figure x : m_list) {
			sum += x.getPerimeter();
		}
		return sum;
	}
	
	public Figure at(int i) {
		if(i < 0 || i >= m_list.size()) {
			System.out.println("\nINVALID INDEX ACCESS!");
			return null;
		}
		else
		{
			return m_list.get(i);
		}
	}
	
	public void display() {
		for(Figure x : m_list) {
			System.out.println(x);
		}
	}
}
