package Bank;

public abstract class Account {
    int balance;
    String type;
    public Account(int balance,String type)
    {
        this.balance=balance;
        this.type=type;
    }
    public abstract void deposit(int ammount);
    public abstract void withdraw(int ammount);
    public abstract int getBalance();
    public abstract String getType();

}