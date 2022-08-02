package exercise1_BankAccount;

public class Main {

	public static void main(String[] args) {
		
		BankAccount bank_pekao = new BankAccount("Fozilbek Kholboev", "5352 3041 9006 4971", 8, 2026);
		
		bank_pekao.addOperation(1400);
		bank_pekao.addOperation(-800);
		bank_pekao.addOperation(-200);
		bank_pekao.addOperation(-250);
		bank_pekao.addOperation(-200);
		bank_pekao.addOperation(400.96f);
		
		
		System.out.println(bank_pekao);
		
		System.out.println("\nAll incomes:  " + bank_pekao.getIncomes());
		System.out.println("\nAll outcomes:  " + bank_pekao.getOutcomes());

	}

}
