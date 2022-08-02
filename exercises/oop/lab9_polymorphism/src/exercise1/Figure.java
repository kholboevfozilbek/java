package exercise1;

public abstract class Figure
{
	protected static int m_count=0;
	
	public Figure() {
		++m_count; 
	}
	
	public static int countFigures() {
		return m_count;
	}
		
	public abstract float getArea();
	
	public abstract float getPerimeter();
	
	
}
