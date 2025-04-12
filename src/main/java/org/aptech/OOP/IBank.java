package org.aptech.OOP;

import java.util.List;

public interface IBank {
    String registerUser(Bank bank);
    void displayCustomer(long id);
    String deleteCustomer(long id);
    List<Bank> displayAll();
    Bank updateCustomer(Bank bank, long id);
}
