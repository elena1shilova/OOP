public class CreditAccount extends Account{


    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void take(double withdrawal) {
        double fee = withdrawal * 0.01;
        super.take(withdrawal + fee);
    }
}
