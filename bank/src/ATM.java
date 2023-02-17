import java.util.Scanner;

public class ATM {
    public void run(Account account){
    Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Shen BANK...");
        System.out.println("********************************");
        System.out.println("User Login");
        System.out.println("**************************");
        int entry=3;
        while(true){
            if (login.login(account)){
                System.out.println("Login successful");
                break;
            }
            else {
                System.out.println("Login unsuccessful");
                entry-=1;
                System.out.println("remaining entry"+entry);
            }
            if(entry==0){
                System.out.println("your remaining entry finshed");
                return;
            }
        }
        System.out.println("*************************************");
        String transactions = "1. view balance \n" +
                "2. deposit money \n" +
                "3.  withdraw money \n" +
                " press q for exit ....";

        System.out.println(transactions);
        System.out.println("******************************");
        while (true){
            System.out.println("please select transaction");
            String process =  scanner.nextLine();
            if(process.equals("q")){
                break;
            } else if (process.equals("1")) {
                System.out.println("balance    " + account.getBalance());
                
            } else if (process.equals("2")) {
                System.out.println("how much do you want to deposit? ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.depositMoney(amount);


            } else if (process.equals("3")) {
                System.out.println("how much do you want to withdraw? ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdrawMoney(amount);

            }
            else {
                System.out.println("invalid transaction , please check your transaction");

            }

        }



    }
}
