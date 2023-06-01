
	public class Account {
	    private int AccountNumber;
	    private double Balance;

	    public Account(int accountNumber, double balance) {
	   
	        this.AccountNumber = accountNumber;
	        this.Balance = balance;
	    }

	    public double getBalance() {
	        return Balance;
	    }

	    public void withdraw(double amount) {
	        if (Balance - amount >= 2000)
	        
	        {
	            Balance= Balance - amount;
	            System.out.println("Withdrawal successful. Current balance: " + Balance);
	        } else {
	            System.out.println("Insufficient funds. Minimum balance of 2000 required.");
	        }
	    }
	    public static void main(String[] args) {
	        Account account = new Account(12345, 10000);
	        System.out.println("Current balance: " + account.getBalance());
	        account.withdraw(6000);
	        System.out.println("Current balance: " + account.getBalance());
	        account.withdraw(4000);
	        System.out.println("Current balance: " + account.getBalance());
	    }
	}

