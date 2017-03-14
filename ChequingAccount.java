package accounts;

public class ChequingAccount extends Account {
	
	private double withdrawalLimit;
	private static int withdrawalCounter = 0;

	public static int getWithdrawalCounter() {
		return withdrawalCounter;
	}

	public double getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public void setWithdrawalLimit(double withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}

	public ChequingAccount(String name, int id, double balance, double withdrawalLimit) {
		super(name, id, balance);
		this.withdrawalLimit = withdrawalLimit; 
	}
	
	public String toString() {
		return "ChequingAccount [withdrawalLimit=" + withdrawalLimit + "]";
	}

	public double withdraw(double amount) {
		if(amount > 0 && amount <= super.getBalance() && amount <= withdrawalLimit) {
			super.setBalance(super.getBalance() - amount); 
			withdrawalCounter += 1; 
		} else if (amount > 0 && amount <= super.getBalance() && amount > withdrawalLimit){
			super.setBalance(super.getBalance() - amount - 2); 
			withdrawalCounter += 1; 
		} else if (amount > super.getBalance()) {
			System.err.println("Amount has exceeded the balance.");
		}
		return super.getBalance(); 
	}
	
	public double balanceAtMonthEnd(){
		withdrawalCounter = 0; 
		return super.getBalance(); 
	}
	

}
