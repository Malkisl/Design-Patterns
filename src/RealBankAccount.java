//  Proxy design Pattern
// Subject interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
    class RealBankAccount implements BankAccount {
        private double balance;

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds!");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }


