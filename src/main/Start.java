package main;

import model.Account;
import model.Client;
import model.CurrentAccount;
import model.SavingsAccount;

public class Start {
    public static void main(String[] args) {
        Client client = new Client("Lucas", "123456789011");

        Account cc = new CurrentAccount(client);
        cc.deposite(100.0);
        cc.accountStatement();

        Account sc = new SavingsAccount(client);

        cc.transfer(100.0, sc);
        sc.accountStatement();

        Account cc2 = new CurrentAccount(client);
        cc2.accountStatement();
        System.out.println(cc2);

        client.listAccounts();
    }
}
