public class Account {
    private  String User_name;
    private  String password;
    private int balance;

    public Account(String user_name, String password, int balance) {
        User_name = user_name;
        this.password = password;
        this.balance = balance;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public  void  depositMoney(int amount){
        balance+= amount;
        System.out.println("new balance "+balance);

    }
    public void withdrawMoney(int amount){
        if(amount>balance){
            System.out.println("you don't have enough money. Plaease check your ballance."+balance);
        }
        else{
            balance= balance-amount;
            System.out.println("new ballance : " + balance);
        }
    }
}
