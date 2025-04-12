package org.aptech.OOP;

import java.util.List;

public class BankImplementation implements IBank{

    @Override
    public String registerUser(Bank bank) {
        bank.setAccountNo("6202900011");
        bank.setBalance(100.00);
        bank.setLastName("Jacob");
        bank.setFirstName("Inala");
        return "";
    }

    @Override
    public void displayCustomer(long id) {

    }

    @Override
    public String deleteCustomer(long id) {
        return "";
    }

    @Override
    public List<Bank> displayAll() {
        return List.of();
    }

    @Override
    public Bank updateCustomer(Bank bank, long id) {
        return null;
    }
}
