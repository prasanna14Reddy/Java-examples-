//2)create an interface representing a basic banking functionality, create an interface "BankingInterface " with abstract methods "deposit", "Withdraw" and "getBalance" and then implement it with two different 
//types of bank accounts: savings account and current account.
interface BankingInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankingInterface {
    private double balance;
    private static final double INTEREST_RATE = 0.05; // 5% interest rate

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            balance += balance * INTEREST_RATE; // Applying interest on deposit
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements BankingInterface {
    private double balance;
    private static final double OVERDRAFT_LIMIT = 1000.00; // Overdraft limit of $1000

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankingInterface savingsAccount = new SavingsAccount(500.00);
        BankingInterface currentAccount = new CurrentAccount(1000.00);

        System.out.println("Savings Account:");
        savingsAccount.deposit(200);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());

        System.out.println("\nCurrent Account:");
        currentAccount.deposit(500);
        System.out.println("Balance after deposit: " + currentAccount.getBalance());
        currentAccount.withdraw(2000); // Should show overdraft limit exceeded
        System.out.println("Balance after withdrawal: " + currentAccount.getBalance());
    }
}
