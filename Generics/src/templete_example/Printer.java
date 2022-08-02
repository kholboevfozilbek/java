package templete_example;

public class Printer<T>
{
	protected T obj;
	
	public Printer(T o) {
		this.obj = o;
	}
	
	public void print() {
		System.out.println(obj);
	}
	
	public T get() {
		return obj;
	}
}
