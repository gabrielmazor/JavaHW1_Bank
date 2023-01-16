public class BasicAccount implements IAccount{

    private double balance;
    private int accountNumber;
    private double withdrawalLimit;

    public BasicAccount(int accountNumber, double withdrawalLimit){
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        this.balance = 0;
    }
    public void Deposit(double amount){
        this.balance += amount;
    }
    public double Withdraw(double amount){
        if(amount > this.withdrawalLimit){
            amount = withdrawalLimit;
        }
        if(amount > this.balance){
            amount = balance;
        }
        this.balance -= amount;
        return amount;
    }
    public double GetCurrentBalance(){
        return this.balance;
    }
    public int GetAccountNumber(){
        return this.accountNumber;
    }
}
