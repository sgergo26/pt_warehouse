package warehouse;

public class Supplier {
    private String sName;

    public String getsName() {
        return sName;
    }

    public Supplier(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return sName;
    }



}
