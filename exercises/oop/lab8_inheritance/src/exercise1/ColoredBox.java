package exercise1;

public class ColoredBox extends Box
{
	private String m_color;
	
	
	public ColoredBox(float l, float w, float h) {
		super(l, w, h);
		
	}
	
	public ColoredBox() {
		
	}
	
	public void setColor(String col) {
		m_color = col;
	}
	
	public String getColor() {return m_color; }
	
	@Override 
	public String toString() {
		return "\nBOX: " + m_color + "\n" + "Length:  " + Float.toString(m_length) 
		+ "\nWidth:  " + Float.toString(m_width) + "\nHeight:  " 
		+ Float.toString(m_height) + "\nOverall volume: " + Float.toString(this.getCapacity()) 
		+ "\nUsed volume: " + Float.toString(this.getCapacity() - m_space) 
		+ "\nAvailable space: " + Float.toString(m_space)
		+ "\nContents:  " + m_contents;
	}
	
}
