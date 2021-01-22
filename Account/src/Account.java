public class Account {
    private double balance = 0;
    public Account(double balance){
        this.balance = balance;
    }
    public synchronized void deposit(double amount){ //Implementation here
        this.balance += amount;
        System.out.println("Deposit: " + amount + " balance: " + this.balance);
    }
    public synchronized void withdraw(double amount){ //Implementation here
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println("Withdraw: " + amount + " balance: " + this.balance);
        }else{
            System.out.println("There is not enough in the account to withdraw.");
        }
    }
}
