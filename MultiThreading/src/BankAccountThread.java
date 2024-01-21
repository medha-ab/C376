class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class DepositThread implements Runnable {
    private BankAccount account;

    public DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(100);
        }
    }
}

class WithdrawThread implements Runnable {
    private BankAccount account;

    public WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(50);
        }
    }
}

public class BankAccountThread {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositThread = new Thread(new DepositThread(account));
        Thread withdrawThread = new Thread(new WithdrawThread(account));

        depositThread.start();
        withdrawThread.start();
    }
}
