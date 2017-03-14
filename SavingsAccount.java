package accounts;

public class SavingsAccount extends Account {

	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate / 100.0;
	}

	public SavingsAccount(String name, int id, double balance, double interestRate) {
		super(name, id, balance);
		this.interestRate = interestRate; 
	}

	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + "]";
	} 
	
	public double withdraw(double amount) {
		if(amount > 0 && amount <= super.getBalance()) {
			super.setBalance(super.getBalance() - amount - 3); 
		} else if (amount > super.getBalance()) {
			System.err.println("Amount has exceeded the balance.");
		}
		return super.getBalance(); 
	}
	
	public double balanceAtMonthEnd(){
		return super.getBalance() + (super.getBalance() * interestRate); 
	}
	
}
