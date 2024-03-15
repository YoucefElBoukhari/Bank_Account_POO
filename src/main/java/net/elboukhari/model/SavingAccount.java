package net.elboukhari.model;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount() {
        super();
    }

    @Override
    public String getType() {
        return "Saving_Account";
    }

    public SavingAccount(String currency, double initialBalance, double interestRate) {
        super(currency, initialBalance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
