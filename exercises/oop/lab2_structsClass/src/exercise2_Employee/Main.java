package exercise2_Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee Muminjon = new Employee("Muminjon", "Siddikov", "Student", 1400);
		
		//System.out.println(Muminjon);
		
		Muminjon.print();
		
		Muminjon.incSalary(2000);
		
		Muminjon.print();
	}

}
