package TestDrivenDevelopment;

public class Account {

    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(String name) {
        this.name = name;
        this.balance = 100;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (balance - amount >= 50) {
        balance -= amount;
        }
    }

    public void deposit(int amount) {
        if (amount >= 50) {
            balance += amount;
        }
    }
}
