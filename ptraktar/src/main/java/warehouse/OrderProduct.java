package warehouse;

public class OrderProduct {
    private final Order order;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";


    public OrderProduct(Order order){
        this.order = order;
    }
    public void Ordering(String name, int qty, String supp){
        Products product = new Products(name,qty);
        order.addProduct(product);
        Supplier supplier = new Supplier(supp);
        order.addSupplier(supplier);
        System.out.println(ANSI_GREEN+
                "Beérkező szállítmány, " + product + " - " + supplier + " részéről"
                +ANSI_RESET);
    }
}
