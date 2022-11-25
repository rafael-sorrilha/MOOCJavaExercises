
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account account = new Account("Matthews account", 1000.0);
        Account broke = new Account ("My account", 0.0);
        account.withdrawal(100.0);
        broke.deposit(100.0);
        System.out.println(account);
        System.out.println(broke);
    }
}

