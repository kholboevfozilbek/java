package exercise1;

public class WeightBox extends Box
{
	private float m_max;
	
	
	public WeightBox(float l, float w, float h) {
		super(l, w, h);
		
	}

	public WeightBox() {
		
	}
	
	public float getMax() {return m_max; }
}
