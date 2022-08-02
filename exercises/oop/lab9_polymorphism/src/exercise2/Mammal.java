package exercise2;

public abstract class Mammal 
{
	protected String m_name;
	protected float m_weight;
	protected float m_age;
	
	
	public Mammal() {
		
	}
	
	public Mammal(String n, float w, float a) throws  NullPointerException, NegativeWeight, NegativeAge{
		if(n == null)
			throw new NullPointerException("Name can not be null!");
		if(w <= 0)
			throw new NegativeWeight("Weight can not be 0!");
		if(a < 0) 
			throw new NegativeAge("Age can not be 0!");
		
		m_name = n;
		m_weight = w;
		m_age = a;
	}
	
	public abstract void utterVoice();
	
	@Override
	public String toString() {
		return "Name:  " + m_name + "\nWeight:  " + m_weight + "\nAge:  " + m_age;
	}
}
