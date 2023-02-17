import java.util.Scanner;

public class Login {
    public  boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        String User_name;
        String password;
        System.out.println("username:  ");
        User_name = scanner.nextLine();
        System.out.println("password:  ");
        password= scanner.nextLine();

        if(account.getUser_name().equals(User_name) && account.getPassword().equals(password)){
            return true;
        }
        else {
            return false;
        }


    }
}
