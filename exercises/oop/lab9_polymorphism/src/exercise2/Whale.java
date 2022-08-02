package exercise2;

public class Whale extends Mammal
{
	private String m_category;
	private float m_length;
	
	
	public Whale() {
		
	}
	
	public Whale(String n, float w, float a, String cat, float len) throws NullPointerException, NegativeWeight, NegativeAge {
		super(n, w, a);
		
		if(len < 0 )
			throw new IllegalArgumentException("Whale length can not be 0!");
		m_category = cat;
		m_length = len;
	}
	
	@Override
	public void utterVoice() {
		System.out.println("\nPUUUUUUUU");
	}

	@Override
	public String toString() {
		return "\nWhale:  \n" + "\nCategory:  " + m_category  + "Length:  " + m_length + "\n" + super.toString();
	}

	public String getCategory() {
		return m_category;
	}

	public void setCategory(String c) {
		this.m_category = c;
	}

	public float getLength() {
		return m_length;
	}

	public void setLength(float l) {
		if(l < 0 )
			throw new IllegalArgumentException("Whale length can not be 0!");
		this.m_length = l;
	}
	
	
	
}
