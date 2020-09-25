package Bank;

public class User extends Account {
    private String name;
    private int id;
    private String password;
    public User(String name, String password, int id, int ammount, String type)
    {
        super(ammount,type);
        this.name=name;
        this.id=id;
        this.password=password;
    }
    //.......................
    public void deposit(int ammount)
    {
        balance+=ammount;
        System.out.println("Ammound added");
    }
    //......................................
    //......................................
    public void withdraw(int ammount) {
        if(ammount>balance)
        {
            System.out.println("You dont have enough fund to withdraw money");
        }
        else{
            this.balance-=ammount;
            System.out.println(ammount+"TK Successfully witrwed");
        }
    }
    //..............................................
    //.............................................
    public int getBalance() {
        return balance;
    }
    //.........................................
    //........................................
    public String getType() {
        return type;
    }
    //.........................................
    public void showMessage()
    {
        System.out.println("Account Created\nName: "+name+"\nID: "+id+"\nPassword: "+password+"\nAccount Balance: "+getBalance()+"\nAccount Type: "+getType());
    }

    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}