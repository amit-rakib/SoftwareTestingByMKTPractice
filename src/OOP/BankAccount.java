package OOP;

public class BankAccount {

	public static void main(String[] args) {
         BankAccount account1 = new BankAccount("1", 5000);
         
        account1. deposite(500);
        account1.withdraw(100);
        account1.checkBalance();
        account1.info();
		
	}
	
	
	private String accountNumber;
	private double balance;
	
	// construct 
	
	public BankAccount(String accountNumber, double balance) {
		   this.accountNumber = accountNumber;
		   this.balance = balance;
	}
	
	
	public void deposite(double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Deposite: "+amount+ "Total balance: "+ balance);
		} else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: "+amount );
		} else {
			System.out.println("Insufficient balance");
		}
		
		
		
	}
	
	
	public void checkBalance() {
		System.out.println("Balace: "+balance);
	}
	
	public void info() {
		System.out.println("Account number: "+ accountNumber+ "Balance: "+ balance);
	}
	
	
	
	
	
	

}
