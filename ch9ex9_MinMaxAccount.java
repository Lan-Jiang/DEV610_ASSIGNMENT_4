public class MinMaxAccount extends BankingAccount {
    private double minBalance;
    private double maxBalance;

    public MinMaxAccount(Startup startup) {
        super(startup);
        this.minBalance = startup.startup_getBalance();
        this.maxBalance = startup.startup_getBalance();
    }

    public void debit(Debit debit) {
        super.debit(debit);

        double balance = getBalance();

        if(balance < minBalance)
            minBalance = balance;

        if(balance > maxBalance)
            maxBalance = balance;
    }

    public void credit(Credit credit) {
        super.credit(credit);

        double balance = getBalance();

        if(balance < minBalance)
            minBalance = balance;

        if(balance > maxBalance)
            maxBalance = balance;
    }

    public double getMin() {
        return this.minBalance;
    }

    public double getMax() {
        return this.maxBalance;
    }
}
