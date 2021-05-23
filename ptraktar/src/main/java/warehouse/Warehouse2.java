package warehouse;

public class Warehouse2 extends Warehouse1 {

    protected Warehouse2(){}
    public static Warehouse2 instance;
    public static Warehouse2 getInstance(){
        if(instance == null){
            instance = new Warehouse2();
        }
        return instance;
    }

    public Array pList = new Array(3);

    public void addProduct (Products p){
        if(pList.getCount()+p.getQty() <= 100){
            if(p.getQty()<=5){
                if(pList.contains(p)){
                    pList.adding(p);
                }
                else{
                    pList.insert(p);
                }
            }
            else
                System.out.println(ANSI_RED + "Hiba A " + p.getName() +
                        " Maximális beszerzési tételnagysága 5 db! \b" + ANSI_RESET);
        }
        else
            System.out.println(ANSI_RED + "A 2. számú raktár megtelt vagy meg fog telni!" + ANSI_RESET);
    }

    public void sellProduct(Products p){
        if(p.getQty() <= 5){
            if(pList.contains(p)){
                pList.taking(p);
                sellSuccess = true;
            }
            else {
                System.out.println(ANSI_RED + "Nincs " + p.getName() + " termékünk!" + ANSI_RESET);
            }
        }
        else
            System.out.println(ANSI_RED + "A " + p.getName() + " maximális eladási tételnagysága 5db" + ANSI_RESET);
    }

    @Override
    public String toString() {
        if(pList.isEmpty())
            return ANSI_RED+"Az 2. számú raktár üres \n"+ANSI_RESET;
        return "Az 2. számú raktár árukészlete: " + pList.PrintArray() + "\n";
    }
}
