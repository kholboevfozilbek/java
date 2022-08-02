package exercise1;

public class Box 
{
	protected float m_length;
	protected float m_width;
	protected float m_height;
	protected String m_contents;
	protected float m_space;
	protected static int m_count=0;
	
	
	public Box() {
		
	}
	
	public Box(float l, float w, float h) {
		if(l <= 0 || w <= 0 || h <= 0)
		{
			System.out.println("WRONG DATA ENTERED");
			System.exit(-1);
		}
		
		m_length = l;
		m_width = w;
		m_height = h;
		m_space = l*w*h;
		++m_count;
	}
	
	public float getCapacity() {
		return m_length*m_width*m_height;
	}
	
	public void setContents(String con, float con_volume) {
		if(con_volume > this.getCapacity()) {
			System.out.println("[ERROR: CONTENT CAPACITY IS BIGGER THAN BOX CAPACITY!");
			System.exit(-1);
		}
		else
		{
			m_space -= con_volume;
			m_contents = con;
		}
		
	}
	
	public String getContenets() {
		if(m_space == this.getCapacity())
			return "EMPTY";
		else
			return m_contents;
	}
	
	public boolean isEmpty() {
		if(m_space == this.getCapacity())
			return true;
		else
			return false;
	}
	
	public static int countAll() {return m_count; }	
	
	@Override
	public String toString() {
		return "\nBOX: \n" + "Length:  " + Float.toString(m_length) + "\nWidth:  " + Float.toString(m_width) 
			+ "\nHeight:  " + Float.toString(m_height) + "\nOverall volume: " + Float.toString(this.getCapacity()) +
			"\nUsed volume: " + Float.toString(this.getCapacity() - m_space) + "\nAvailable space: " + Float.toString(m_space)
			+ "\nContents:  " + m_contents;
	}
}