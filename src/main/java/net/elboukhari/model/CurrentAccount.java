package net.elboukhari.model;

public class CurrentAccount extends BankAccount{
    private double overDraft;


    //Constructeur sans paramétre
    public CurrentAccount() {
        super();
    }

    @Override
    public String getType() {
        return "Current_Account";
    }


    //Constructeur avec paramétres
    public CurrentAccount(String currency, double initialBalance, double overDraft) {
        super(currency, initialBalance);
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return "Current Account , Overdraft=" +overDraft+super.toString();
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }
}
