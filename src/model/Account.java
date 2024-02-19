package model;

import java.io.Serializable;

public class Account implements Serializable {
    private static int NUMBER_COUNT = 1;
    private static Long ID_COUNT = 1L;
    private static final int DEFAULT_AGENCY = 1;

    private Long id;
    private int agency;
    private int number;
    private double balance;
    private Client client;

    public Account(Client client) {
        this.id = ID_COUNT++;
        this.agency = DEFAULT_AGENCY;
        this.number = NUMBER_COUNT++;
        this.client = client;
        client.setAccount(this);
    }

    public Long getId() {
        return id;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void withdraw(double value) {
        this.balance -= value;
        System.out.println("Saque efetuado com sucesso.");
    }

    public void deposite(double value) {
        this.balance += value;
        System.out.println("Deposito efetuado com sucesso");
    }

    public void transfer(double value, Account account) {
        this.withdraw(value);
        account.deposite(value);
        System.out.println("Transferencia efetuada com sucesso.");
    }

    public void accountStatement() {
        System.out.println("***** Extrato *****");
        System.out.printf("Agencia: %d\n", this.agency);
        System.out.printf("Numero: %d\n", this.number);
        System.out.printf("Saldo: %.2f\n", this.balance);
        System.out.printf("Cliente: %s\n", this.client.getName());
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", agency=" + agency +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
