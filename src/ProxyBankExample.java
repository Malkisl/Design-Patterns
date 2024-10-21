public class ProxyBankExample {
    public static void main(String[] args) {
        // Using the proxy to access the real bank account
        BankAccount account = new SecureBankAccountProxy("secret");

        // Operations
        account.deposit(2000);
        account.withdraw(1000);
        double balance = account.getBalance();

        System.out.println("Current Balance: " + balance);
    }
}




