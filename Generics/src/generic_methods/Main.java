package generic_methods;

public class Main {

	public static void main(String[] args) {
		shout("Fozil");
		shout(18);
	}
	
	public static <T> T shout(T thingtoshout) {
		System.out.println(thingtoshout + "!!!!!!!!");
		
		return thingtoshout;
	}

}
