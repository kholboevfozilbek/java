package bounded_types;

import java.io.Serializable;

public class NumericFuntion<T extends Number & Serializable>
{
	T obj;
	
	public NumericFuntion(T ob) {
		this.obj = ob;
	}
	
	double square() {
		return obj.intValue() * obj.doubleValue();
	}
}