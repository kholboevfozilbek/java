package hierarchichal_inheritance;

public class Main 
{
	public static void main(String[] args) {
		
		Manager m = new Manager();
		Scientist s = new Scientist();
		Laborer l = new Laborer();
		
		System.out.println("Enter data for manager:  ");
		m.getData();
		
		System.out.println("Enter data for scientist:  ");
		s.getData();
		
		System.out.println("Enter data for laborer:  ");
		l.getData();
		
		m.putData();
		s.putData();
		l.putData();
		
		
	}
}
