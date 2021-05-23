package warehouse;

public class SellProduct {
    private final Sell sell;

    public SellProduct(Sell sell) { this.sell = sell; }
    public void Selling (String name, int qty, String customer){
        Products sproduct = new Products(name,qty);
        sell.sellProduct(sproduct);
        Customer customer1 = new Customer(customer);
        sell.addCustomer(customer1);

    }
}
