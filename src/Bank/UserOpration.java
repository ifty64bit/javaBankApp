package Bank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserOpration {
    private boolean xy=true;
    private int userChoice;
    Scanner choice=new Scanner(System.in);
    public void UserOp(User obj)
    {
        while(xy)
        {
            System.out.println("1. Show Balance.\n2. Deposit Money\n3. Withdraw Money\n4. Account Details\n5. Log out");
            userChoice=choice.nextInt();
            switch(userChoice){
                case 1:
                    System.out.println("Your Current Balance is: "+obj.getBalance());
                    break;
                case 2:
                    while (true)
                    {
                        try{
                            while (true)
                            {
                                System.out.println("Enter Your Ammount");
                                int ammount=choice.nextInt();
                                if(ammount<0)
                                {
                                    System.out.println("Invalid Ammount");
                                }
                                else {
                                    obj.deposit(ammount);
                                    break;
                                }
                            }
                            break;
                        }
                        catch (InputMismatchException e)
                        {
                            System.out.println("Please Input Only Numeric Value");
                            choice.next();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Your Ammount");
                    while (true)
                    {
                        try{
                            int withAmmount=choice.nextInt();
                            obj.withdraw(withAmmount);
                            break;
                        }
                        catch (InputMismatchException e)
                        {
                            System.out.println("Please Input Only Numeric Value");
                            choice.next();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Account Holder Name: "+obj.getName()+"\nID: "+obj.getId()+"\nBalance: "+obj.getBalance());
                    break;
                case 5:
                    xy=false;
                    break;
            }
        }
    }
}