public class PremiumAccount implements IAccount {
    private double balance;
    private int accountNumber;

    public PremiumAccount(int accountNumber){
       this.accountNumber = accountNumber;
       this.balance = 0;
    }
    public void Deposit(double amount){
        this.balance += amount;
    }
    public double Withdraw(double amount){
        this.balance -= amount;
        return amount;
    }
    public double GetCurrentBalance() {
        return this.balance;
    }
    public int GetAccountNumber() {
        return this.accountNumber;
    }
}