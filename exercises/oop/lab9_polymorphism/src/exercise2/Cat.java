package exercise2;

public class Cat extends Mammal
{
	private String m_color;

	
	public Cat() {
		
	}
	
	public Cat(String col, String n, float w, float a) throws NullPointerException, NegativeWeight, NegativeAge {
		super(n, w, a);
		
		if(col == null)
			throw new NullPointerException("Please provied color!");
		
		m_color = col;
	}
	
	@Override
	public void utterVoice() {
		
		System.out.println("\nMEAOW");
	}

	public String getColor() {
		return m_color;
	}

	public void setColor(String c) {
		
		if(c == null)
			throw new NullPointerException("Please provied color!");
		
		this.m_color = c;
	}

	@Override
	public String toString() {
		return "\nCat:  \n" + "color: " + m_color + "\n" + super.toString();
	}
	
}
