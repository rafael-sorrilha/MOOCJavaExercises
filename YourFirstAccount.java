
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("Account's balance: ", 100.0);
        
        System.out.println("Initial state");
        System.out.println(account);
        
        account.deposit(20.0);
        System.out.println("The balance of the account is now: " + account);
        
        
    }
}
