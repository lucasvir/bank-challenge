package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable {

    private static Long ID_COUNT = 1L;

    private Long id;
    private String name;
    private String cpf;
    private List<Account> accounts;

    public Client(String name, String cpf) {
        this.id = ID_COUNT++;
        this.name = name;
        this.cpf = cpf;
        this.accounts = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccount(Account account) {
        accounts.add(account);
    }

    public void listAccounts() {
        System.out.println("***** CONTAS DO CLIENTE *****");
        System.out.printf("Cliente: %s\n", this.getName());
        accounts.forEach(acc -> {
            System.out.printf("id: %d\n", acc.getId());
            System.out.printf("Agencia: %d\n", acc.getAgency());
            System.out.printf("Numero: %d\n", acc.getNumber());
            System.out.printf("Saldo: %.2f\n", acc.getBalance());

        });
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", accounts=" + accounts +
                '}';
    }


}
