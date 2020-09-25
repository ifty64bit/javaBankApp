package Bank;

import java.util.Scanner;

import static Bank.Main.userDB;
import static Bank.Main.xx;
import static Bank.Main.i;

public class AccountForm {
    Scanner strInput=new Scanner(System.in);
    Scanner option=new Scanner(System.in);
    private int id=100;
    private int ammount;
    private String type,name,password;
    private boolean exiest=true;

    public void signUp(RData record)
    {
        System.out.println("Enter Your Name: ");
        while(exiest)
        {
            name=strInput.nextLine();
            for (String s : userDB) {
                if (name.equals(s)) {
                    System.out.println("Name Already Taken. Try Another");  //if found exiested name
                    break;
                } else {
                    exiest = false;
                }
            }
        }
        System.out.println("Enter Your Password: ");
        while(true)
        {
            password=strInput.nextLine();
            if(password.length()<5)
            {
                System.out.println("Password Must Be 6 Character Minimum Length");
            }
            else {
                break;
            }
        }
        System.out.println("Enter Initial Ammount: ");
        while(true)
        {
            try{
                while (true)
                {
                    ammount =option.nextInt();
                    if(ammount <500)
                    {
                        System.out.println("Minimum Ammount is 500TK");
                    }
                    else {
                        break;
                    }
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Please Input Only Numeric Value");
                option.next();
            }
        }
        System.out.println("Enter Your Account Type: \n1. Checking\n2. Savings");

        while(true)
        {
            String v=strInput.nextLine();
            if(v.equals("1"))
            {
                type="Checking";
                break;
            }
            else if(v.equals("2"))
            {
                type="Seving";
                break;
            }
            else {
                System.out.println("Please Type 1 or 2");
            }
        }
        xx[i]=new User(name,password,id=id+i, ammount,type);     //Creating new obj for new account
        xx[i].showMessage();
        userDB[i++]=name;   //recoding user name and counting regisrered account at same time
        record.appand(name,password,id, ammount,type);
    }

    public void logIn(Authentication auth)
    {
        System.out.println("Enter your Name");
        String authName=strInput.nextLine();
        System.out.println("Enter your password");
        String authpass=strInput.nextLine();
        for(int k=0;k<i;k++)            // as we recorded total account with "i". we will looping through all name to match userName
        {
            if(userDB[k].equals(authName))
            {
                auth.auth(xx[k], authpass); //send login info with matched obj name
                break;
            }
            else{
                System.out.println("Invalid Username");
            }
        }
    }
}