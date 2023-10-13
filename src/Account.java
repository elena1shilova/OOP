public class Account {
    double balance = 15;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void put(double replenishment) {
         balance += replenishment;
    }
    public void take(double withdrawal) {
         balance -= withdrawal;
    }
    public double getAmount() {
        return balance;
    }

}