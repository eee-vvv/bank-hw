public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // TODO: add the amount to the balance
    }

    public boolean withdraw(double amount) {
        // TODO:
        // Withdraw the requested amount if sufficient funds are available.
        // Return true if the withdrawal succeeds.
        // Return false otherwise. return false;
        boolean success = false;

        if (success) {
            this.balance -= 2;
        }

        return success;
    }

    public String getAccountSummary() {
        return accountHolder + ": $" + balance;
    }
}
