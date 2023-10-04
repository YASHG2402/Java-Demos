class Account {
	private int balance;
	
	public Account() {
		balance=10000;
	}
	public synchronized void deposit(int amount) {
		System.out.println("Balance before deposit: " + balance);
		//synchronized(this) {
			balance = balance+amount;
		//}
		System.out.println("Balance after deposit: " + balance);
	}
	public synchronized void withdraw(int amount) {
		System.out.println("Balance before withdraw: " + balance);
		//synchronized(this) {
			balance = balance - amount;
		//}
		System.out.println("Balance after withdraw: " + balance);
	}
}
class AccountUser extends Thread {
	String name, tot;
	Account account;
	int amount;
	
	public AccountUser(String name, String tot, Account account, int amount) {
		this.name = name;
		this.tot = tot;
		this.account = account;
		this.amount = amount;
	}
	public void run() {
		if(tot.equals("deposit"))
			account.deposit(amount);
		else if(tot.equals("withdraw"))
			account.withdraw(amount);
	}
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		AccountUser user1 = new AccountUser("Yash","deposit",account,10000);
		AccountUser user2 = new AccountUser("Raj","withdraw",account,5000);
		user1.start();
		user2.start();

	}

}
