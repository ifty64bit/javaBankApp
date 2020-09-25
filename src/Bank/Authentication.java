package Bank;

public class Authentication{
    public void auth(User obj, String pass) {
        if(obj.getPassword().equals(pass))
        {
            System.out.println("Successfully Looged In as "+obj.getName());
            UserOpration uop1=new UserOpration();
            uop1.UserOp(obj);
        }
        else{
            System.out.println("Incorrect Password");
        }
    }
}