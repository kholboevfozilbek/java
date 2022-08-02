package exercise2_Student;

public class Main {

	public static void main(String[] args) {
		
		Student Muminjon = new Student("Muminjon", "Siddikov", 398456);
		
		Muminjon.addMark(3.5f);
		Muminjon.addMark(4.0f);
		Muminjon.addMark(5.0f);
		Muminjon.addMark(4.5f);
		
		Muminjon.print();
		
		System.out.println("\n\nAverage:  " + Muminjon.avgGrade());
		
		//Student Muminjon = new Student("Muminjon", "Siddikov", 398456);
		Student Mansurjon = new Student("Mansurjon", "Zokirjonov", 398456);
		Mansurjon.addMark(3.5f);
		Mansurjon.addMark(4.0f);
		Mansurjon.addMark(5.0f);
		Mansurjon.addMark(3.5f);
		Student Abror = new Student("Abror", "Siddikov", 398456);
		Abror.addMark(3.5f);
		Abror.addMark(3.0f);
		Abror.addMark(4.0f);
		Abror.addMark(3.5f);
		
		Student Sharifjon = new Student("Sharifjon", "Khazratkulov", 398456);
		
		
		Student Fozilbek = new Student("Fozilbek", "Kholboev", 398456);
		
		Fozilbek.addMark(5.0f);
		Fozilbek.addMark(5.0f);
		Fozilbek.addMark(4.0f);
		Fozilbek.addMark(4.5f);
		
		Group gr2 = new Group(2);
		gr2.addStudent(Muminjon);
		gr2.addStudent(Mansurjon);
		gr2.addStudent(Abror);
		gr2.addStudent(Sharifjon);
		gr2.addStudent(Fozilbek);
		
		gr2.print();
		
		System.out.println("\nThe best Student:  " + gr2.bestStudent());
		
		gr2.removeStudent(Fozilbek);
		gr2.print();
	}

}
