package exercise1;

public class Rectangle extends Figure
{
	private float m_width;
	private float m_height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(float w, float h) {
		if(w <= 0 || h <= 0) {
			throw new IllegalArgumentException("\nNEITHER WIDTH NOR HEIGHT CAN BE <= 0 !");
		}
		else
		{
			m_width = w;
			m_height= h;
		}
	}
	
	@Override 
	public float getArea() {
		return m_width * m_height;
	}
	
	@Override 
	public float getPerimeter() {
		return 2*m_width + 2*m_height;
	}

	public float getWidth() {
		return m_width;
	}

	public void setM_width(float w) {
		if(w <= 0 ) {
			System.out.println("\nNEITHER WIDTH NOR HEIGHT CAN BE <= 0 !");
		}
		else
		{
			this.m_width = w;			
		}
	}

	public float getHeight() {
		return m_height;
	}

	public void setHeight(float h) {
		if(h <= 0) {
			System.out.println("\nNEITHER WIDTH NOR HEIGHT CAN BE <= 0 !");
		}
		else
		{
			this.m_height = h;			
		}
	}
	
	@Override 
	public String toString() {
		return "\nRectangle\n" + "Width:  " + m_width + "\nHeight:  " + m_height + 
				"\nArea: " + getArea() + "\nPerimeter:  " + getPerimeter() + "\n";
		
	}
}
