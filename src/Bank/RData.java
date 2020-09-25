package Bank;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import static Bank.Main.*;

public class RData {
    File f1;
    FileWriter write;
    public RData()
    {
        System.out.println("Searching for Existing Record");
        try{
            f1=new File("src/record.csv");
            if(!f1.createNewFile())
            {
                System.out.println("Existing User RecordBook Found\nInitializing Data.........");
                try{
                    Scanner sc=new Scanner(f1);
                    while(sc.hasNextLine())
                    {
                        String data=sc.nextLine();
                        String[] dataAr;
                        dataAr=data.split(",");
                        userDB[i]=dataAr[1];
                        xx[i++]=new User(dataAr[1],dataAr[3],Integer.parseInt(dataAr[0]),Integer.parseInt(dataAr[4]),dataAr[2]);
                        System.out.println("New Record Added to RecordBook");
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            else {
                System.out.println("No Existing Record Found.\nNew RecordBook Created.");
            }
            write=new FileWriter(f1,true);   //Createing writter obj
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void appand(String name,String pass,int id,int ammount,String type)
    {
        try{
            write.write(id+","+name+","+type+","+pass+","+ammount+"\n");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void close()
    {
        try{
            write.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}