package exercise1;

public class Triangle extends Figure
{
	private float m_a;
	private float m_b;
	private float m_c;
	//private float m_height;
	
	
	public Triangle() {
		
	}
	
	public Triangle(float a, float b, float c) {
		if(a + b < c || a + c < b || b + c < a) {
			throw new IllegalArgumentException("\nINVALID PARAMETERS TO CONSTRUCT TRIANGLE!!!");
		}
		else
		{
			m_a = a;
			m_b = b;
			m_c = c;
		}
	}
	
	@Override
	public float getArea() {
		float s = (m_a + m_b + m_c) / 2;
	
		return (float)Math.sqrt(s*(s-m_a) * (s-m_b) * (s-m_c));
	}
	@Override
	public float getPerimeter() {
		return m_a + m_b + m_c;
	}
	
	public float getA() {
		return m_a;
	}
	public void setM_a(float a) {
		this.m_a = a;
	}
	public float getB() {
		return m_b;
	}
	public void setM_b(float b) {
		this.m_b = b;
	}
	public float getC() {
		return m_c;
	}
	public void setM_c(float c) {
		this.m_c = c;
	}
	
	@Override 
	public String toString() {
		return "\nTriangle\n" + "Side1:  " + m_a + "\nSide2:  " + m_b + "\nSide3:  " + m_c +
				"\nArea: " + getArea() + "\nPerimeter:  " + getPerimeter() + "\n";
	}
	
}
