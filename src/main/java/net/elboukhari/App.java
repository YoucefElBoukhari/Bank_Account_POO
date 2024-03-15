package net.elboukhari;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.elboukhari.model.BankAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.elboukhari.model.CurrentAccount;
import net.elboukhari.model.SavingAccount;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        BankAccount[] accounts=new BankAccount[4];
        accounts[0]= new CurrentAccount("MAD", 5400,500);
        accounts[1]= new CurrentAccount("USD", 5500,600);
        accounts[2]= new CurrentAccount("MAD", 5800,700);
        accounts[3]= new CurrentAccount("USD", 5600,800);
        for (BankAccount acc:accounts){
            System.out.println("---------------------------------------------");
            System.out.println("Account ID="+acc.getAccountId());
            System.out.println("Balance="+acc.getBalance());
            System.out.println("Status="+acc.getStatus());
            System.out.println("Currency="+acc.getCurrency());
            System.out.println("---------------------------------------------");
        }


        System.out.println("-------------------Listes------------------");


        List<BankAccount> bankAccounts=new ArrayList<>();
        bankAccounts.add(new CurrentAccount("USD", 5700,665));
        bankAccounts.add(new SavingAccount("USD", 5500,678));
        bankAccounts.add(new CurrentAccount("USD", 5600,685));
        bankAccounts.add(new SavingAccount("USD", 5700,6868));
        bankAccounts.add(new CurrentAccount("USD", 5200,576));

        for (BankAccount acc:bankAccounts){
            System.out.println(acc.getType());
            if(acc instanceof SavingAccount){
                System.out.println("Rate="+((SavingAccount)acc).getInterestRate());
            }
            if(acc instanceof CurrentAccount){
                System.out.println("Over_Draft="+((CurrentAccount)acc).getOverDraft());
            }
        }


        System.out.println("-------------------Map------------------");


        Map<String, BankAccount> bankAccountMap= new HashMap<>();
        bankAccountMap.put("cc1", new CurrentAccount("USD", 5700,686));
        bankAccountMap.put("cc2", new CurrentAccount("MAD", 5600,675));
        bankAccountMap.put("cc3", new SavingAccount("USD", 5400,75));
        bankAccountMap.put("cc4", new SavingAccount("MAD", 5900,68));

        BankAccount acc=bankAccountMap.get("cc3");
        System.out.println(acc.toString());

        for(String key : bankAccountMap.keySet()){
            System.out.println(bankAccountMap.get(key));
        }

        for(BankAccount ba : bankAccountMap.values()){
            System.out.println(toJson(ba));
        }
    }

    public static String toJson(Object o) throws JsonProcessingException {
        ObjectMapper objectMapper= new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);

    }
}
