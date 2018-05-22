public class SavingsAccount {
	private double interestRate;
	private double balance;
	private double totalWithdraws;
	private double totalDeposits;
	private double totalInterest;
	private double annualInterestRate;
	private double monthlyInterestRate;
	

	// Constructors

	public SavingsAccount() {
		balance = 0.0;
	}
	public SavingsAccount(double startingBalance) {
		balance = startingBalance;
	}

	// mutators

	public void withdraw (double amount) {
		balance -= amount;
		totalWithdraws += amount;
	}
	public void deposit (double amount) {
		balance += amount;
		totalDeposits += amount;
	}
	public void setAnnualInterestRate (double IR) {
		annualInterestRate = IR;
		monthlyInterestRate = annualInterestRate / 12;
	}
	public void calculateMonthlyInterest () {
		totalInterest = totalInterest + balance * monthlyInterestRate;
		balance = balance + balance * monthlyInterestRate;
	}
	public void displayData () {
		balance = Math.round(balance * 100.0) / 100.0;
		totalInterest = Math.round(totalInterest * 100.0) / 100.0;
		System.out.println();
		System.out.println("The ending balance 			: $" + balance);
		System.out.println("Total amount of deposits 		: $" + totalDeposits);
		System.out.println("Total amount of withdraws		: $" + totalWithdraws);
		System.out.println("Total interest earned			: $" + totalInterest);
		System.out.println();
	}
}