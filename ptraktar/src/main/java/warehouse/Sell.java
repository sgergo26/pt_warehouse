package warehouse;

//Az eladási folyamat interfésze

public interface Sell {
    void sellProduct(Products products);
    void addCustomer(Customer customer);
}
