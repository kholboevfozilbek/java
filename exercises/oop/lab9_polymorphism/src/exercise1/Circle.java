package exercise1;

public class Circle extends Figure
{
	private float m_radius;
	
	public Circle() {
		
	}
	
	public Circle(float rad) {
		if(rad <= 0 ) {
			throw new IllegalArgumentException("\nRADIUS CAN NOT BE 0!");
		}
		else
		{
			m_radius = rad;
		}
	}

	@Override
	public float getArea() {
		return (float) (Math.PI * Math.pow(m_radius, 2));
	}

	@Override
	public float getPerimeter() {
		return (float) Math.PI * (m_radius*2);
	}

	public float getRadius() {
		return m_radius;
	}

	public void setRadius(float rad) {
		if(rad <= 0 ) {
			System.out.println("\nRADIUS CAN NOT BE 0!");
		}
		else
		{
			m_radius = rad;
		}
	}
	
	@Override 
	public String toString() {
		return "\nCircle\n" + "Radius: " + m_radius + "\nArea: " + getArea() + 
				"\nPerimeter:  " + getPerimeter() + "\n";
	}
	
	
}
