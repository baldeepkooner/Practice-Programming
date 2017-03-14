package accounts;

public class Account {
	
	private String name; 
	private int id; 
	private double balance;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", balance=" + balance
				+ "]";
	} 
	
	public double withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount; 
		} else if (amount > balance) {
			System.err.println("Amount has exceeded the balance.");
		}
		return balance; 
	}
	
	public double deposit(double amount) {
		if(amount > 0){
			balance = balance + amount;  
		}
		return balance; 
	}
	
	public double transferTo(Account other, float amountToBeTransferred) {
		if(other == null){
			System.err.println("Account not found."); 
		}
		else if(amountToBeTransferred > balance){
			System.err.println("Amount has exceeded the balance.");
		} 
		else if(amountToBeTransferred >= 0 || amountToBeTransferred <= balance) {
			withdraw(amountToBeTransferred); 
			other.deposit(amountToBeTransferred); 
		}
		return balance; 
	}
	
	public double balanceAtMonthEnd(){
		return balance; 
	}
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		Account account = (Account) obj;
		
		return (name == account.name && id == account.id && balance == account.balance);
	}

}
