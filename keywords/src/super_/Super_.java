package super_;

public class Super_ {

	protected int a;
	
	
	public Super_() {
		
	}
	
	public Super_(int new_val) {
		a = new_val;
	}

}

class Sub extends Super_ 
{
	protected double new_feature;
	
	public Sub() {
		
	}
	
	public Sub(int aa, int d) {
		super(aa);
		new_feature = d;
	}
}
