public class StandardAccount implements IAccount {
    private double balance;
    private double creditLimit;
    private int accountNumber;
    public StandardAccount(int accountNumber, double creditLimit){
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.balance = 0;
    }
    public void Deposit(double amount){
        this.balance += amount;
    }
    public double Withdraw(double amount){
        if(amount > balance + creditLimit) {
            amount = balance + creditLimit;
        }
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