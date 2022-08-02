package wildcards;

public class NumericFunction<T extends Number>
{
	T obj;
	
	public NumericFunction(T ob) {
		this.obj = ob;
	}
	
	double square() {
		return obj.intValue() * obj.doubleValue();
	}
	
	boolean absEqual(NumericFunction<?> ob ) {
		if(Math.abs(obj.doubleValue()) == Math.abs(ob.obj.doubleValue()))
		{
			return true;
		}
		return false;
	}
}
