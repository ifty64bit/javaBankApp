package Bank;
import java.util.Scanner;

public class Main {
    public static String[] userDB;//database for record user name
    public static User[] xx;
    public static int i=0;    //additional var for looping and tracking how many account registered

    public static void main(String[] args){
        Scanner option=new Scanner(System.in);
        //All needed var start here
        boolean x = true;       //we will use this for loop user option
        userDB=new String[500];  //initilizing database array
        xx=new User[500];    //initializing obj array for every account
        String choice;     //will use this for scanner

        //All needed var stop here
        //All needed Obj Start
        RData record=new RData();   //Record File obj
        Authentication auth=new Authentication();   //Creating obj for authentication class
        AccountForm acc=new AccountForm();      //Account Form obj
        //All needed Obj stop
        System.out.println("Welcome to Bla Bla Bank");
        while(x)
        {
            System.out.println("Chose Option: \n1. Create New Account\n2. Log in\n3. Exit");
            choice=option.nextLine();

            switch(choice){
                case "1":
                    acc.signUp(record);
                    break;
                case "2":
                    acc.logIn(auth);
                    break;
                case "3":
                    record.close();     //closing file stream
                    x=false;
                    break;
                default:
                    System.out.println("Please Input Only Numeric Value [1-3]");
            }
        }
    }
}