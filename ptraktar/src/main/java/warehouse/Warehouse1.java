package warehouse;

public class Warehouse1 implements Sell, Order {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public Partners partnerList = new Partners();
    public Array a = new Array(3);

    protected boolean sellSuccess = false;

    protected Warehouse1(){}
    public static  Warehouse1 instance;
    public static Warehouse1 getInstance(){
        if(instance == null){
            instance = new Warehouse1();
        }
        return instance;
    }

    public void addProduct (Products p){
        if(a.contains(p)){
            a.adding(p);
        }
        else{
            a.insert(p);
        }
    }

    public void addSupplier (Supplier s){
        if(!partnerList.getsList().toString().contains(s.getsName())){
            partnerList.addNewSupplier(s);
        }
    }

    public void sellProduct(Products p){
        if(a.contains(p)){
           a.taking(p);
           sellSuccess = true;
        }
        else {
            System.out.println(ANSI_RED + "Nincs " + p.getName() + " termékünk!" + ANSI_RESET);
        }

    }

    public void addCustomer(Customer c){
        if (sellSuccess){
            if(!partnerList.getcList().toString().contains(c.getcName())){
                partnerList.addNewCustomer(c);
            }
        }
        sellSuccess = false;
    }

    public void listSupplier()
    {
        System.out.println(ANSI_BLUE+"A beszállítóink: " + partnerList.getsList() + ANSI_RESET);
    }

    public void listCustomer()
    {
        System.out.println(ANSI_CYAN+"A vevőink: " + partnerList.getcList() + ANSI_RESET);
    }

    @Override
    public String toString() {
        if(a.isEmpty())
            return ANSI_RED+"Az 1. számú raktár üres \n"+ANSI_RESET;
        return "Az 1. számú raktár árukészlete: " + a.PrintArray() + "\n";
    }
}
