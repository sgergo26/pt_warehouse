package warehouse;

public class Products {

    private String name;
    private int qty;

    public Products(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name + ": " + qty + " db";
    }
}
