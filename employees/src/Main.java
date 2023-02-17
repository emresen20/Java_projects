import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to worker program");
        String transactions ="transactions \n "
                + "1. programmer\n"
                +"2. manager\n"
                +"press q for exit\n";
        System.out.println("*********************");
        System.out.println(transactions);
        System.out.println("*****************************");
    while(true){
        System.out.println("choose the transactions");
        String a = scanner.nextLine();
        if(a.equals("q")){
            System.out.println("exiting the program");
            break;
        } else if (a.equals("1")) {
        programmer programmer1 = new programmer("emre","şen",20253006,"c,java,phyton");
            String b =
                    "1. to format\n"
                            +"2. shows the infos\n"
                            +"press q for exit\n";
            System.out.println(b);
        while(true){
            System.out.println("choose the transactions");
            String c = scanner.nextLine();
            if(c.equals("q")){
                System.out.println("exiting the program");
                break;
            } else if (c.equals("1")) {
                System.out.println("Os");
                String os = scanner.nextLine();
                programmer1.doformat(os);
                
            } else if (c.equals("2")) {
                programmer1.showtheinfos();

            }
            else {
                System.out.println("invalid transaction");
            }


        }

        } else if (a.equals("2")) {
            manager manager1 = new manager("berna","varol",20253005,10);
            String f = "Manager transaction\n"
                    + " 1. make interest \n"
                    + "2. Show the infos\n"
                    + "Press q for exit \n";
            System.out.println(f);
            while (true){
                System.out.println("choose the transaction:");
                String j = scanner.nextLine();
                if (j.equals("q")){
                    System.out.println("exiting the program ");
                    break;
                }
                else if (j.equals("1")) {
                    System.out.println("how much do you need interest?");
                    int amountinterst = scanner.nextInt();
                    scanner.nextLine();
                    manager1.makeextra(amountinterst);


                } else if (j.equals("2")) {
                    manager1.showtheinfos();

                }
                else {
                    System.out.println("invalid transaction");

                }


            }



        }
        else{
            System.out.println("no means");
        }
    }

    }
}