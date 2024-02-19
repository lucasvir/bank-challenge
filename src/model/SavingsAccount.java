package model;

import java.io.Serializable;

public class SavingsAccount extends Account implements Serializable {
    public SavingsAccount(Client client) {
        super(client);
    }
}
