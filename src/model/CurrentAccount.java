package model;

import java.io.Serializable;

public class CurrentAccount extends Account implements Serializable {

    public CurrentAccount(Client client) {
        super(client);
    }
}
