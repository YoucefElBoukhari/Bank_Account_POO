package net.elboukhari;

import net.elboukhari.model.BankAccount;
import net.elboukhari.model.CurrentAccount;
import net.elboukhari.model.SavingAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1=null;
        account1= new CurrentAccount();
        //account1.setAccountId("123-593");
        account1.setCurrency("MAD");
        account1.setBalance(7690);
        printAccount(account1);

        BankAccount account2= new CurrentAccount("MAD",1200, 4000);
        printAccount(account2);

        BankAccount account3= new SavingAccount("MAD",1200, 3.4);
        printAccount(account2);

        account3.setAccountId(account2.getAccountId());
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account2.hashCode());
        System.out.println(account2.hashCode());
        System.out.println(account2==account3); // == compare les @memoire
        System.out.println(account2.equals(account3));
    }
    public static void printAccount(BankAccount account){
        System.out.println("---------------------------------------------");
        System.out.println("Account ID="+account.getAccountId());
        System.out.println("Balance="+account.getBalance());
        System.out.println("Status="+account.getStatus());
        System.out.println("Currency="+account.getCurrency());
        System.out.println(account.toString());
        System.out.println(account.hashCode());
        System.out.println(account.equals(account));
        System.out.println("---------------------------------------------");
    }
}