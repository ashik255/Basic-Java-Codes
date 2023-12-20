package OOP.Encapsulation;

public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            System.out.println("Balance must be greater than 0.0");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setBalance(1221);
        System.out.println("My balance is " + myAccount.getBalance());
    }
}
