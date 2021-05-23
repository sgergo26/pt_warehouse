package warehouse;

import java.util.ArrayList;

public class Partners {
     private ArrayList<Supplier> sList = new ArrayList<>();
    private ArrayList<Customer> cList = new ArrayList<>();

    public ArrayList<Supplier> getsList() {
        return sList;
    }

    public void addNewSupplier (Supplier s){
        sList.add(s);
    }

    public ArrayList<Customer> getcList() {
        return cList;
    }

    public void addNewCustomer (Customer c){
        cList.add(c);
    }

}
