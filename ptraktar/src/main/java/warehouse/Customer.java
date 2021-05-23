package warehouse;

public class Customer {
    private String cName;

    public Customer(String cName) {
        this.cName = cName;
    }

    public String getcName() {
        return cName;
    }

    @Override
    public String toString() {
        return cName;
    }
}
