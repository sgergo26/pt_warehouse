package warehouse;

public class App 
{
    public static void main(String[] args)
    {
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RESET = "\u001B[0m";

        Warehouse1 wh1 = Warehouse1.getInstance();
        OrderProduct orderProduct = new OrderProduct(wh1);
        SellProduct sellProduct = new SellProduct(wh1);

        Warehouse2 wh2 = Warehouse2.getInstance();
        OrderProduct orderProduct2 = new OrderProduct(wh2);
        SellProduct sellProduct2 = new SellProduct(wh2);

        System.out.println(ANSI_PURPLE + "\nAz 1. raktár adatai\n" + ANSI_RESET);
        System.out.println(wh1.toString());
        orderProduct.Ordering("Villa",200,"Veg Eta");
        orderProduct.Ordering("Olló",80,"Kala Pál");
        orderProduct.Ordering("Kanál",50,"Virra Dóra");
        orderProduct.Ordering("Kanál",100,"Meg Győző");
        System.out.println(wh1.toString());
        sellProduct.Selling("Villa",50,"Erős Pista");
        sellProduct.Selling("Olló",90,"Vak Cina");
        sellProduct.Selling("Abrosz",2,"Git Áron");
        sellProduct.Selling("Kanál",10,"Vak Cina");
        System.out.println(wh1.toString());
        orderProduct.Ordering("Kés",100,"Meg Győző");
        orderProduct.Ordering("Szalvéta",400,"Meg Győző");
        System.out.println(wh1.toString());
        sellProduct.Selling("Kés",20,"Git Áron");
        sellProduct.Selling("Szalvéta",100,"Vak Cina");
        System.out.println(wh1.toString() + "\n\n");

        System.out.println(ANSI_PURPLE + "A 2. raktár adatai\n" + ANSI_RESET);
        System.out.println(wh2.toString());
        orderProduct2.Ordering("Mosógép",5,"Ipsz Ilonka");
        orderProduct2.Ordering("Hűtőszekrény",8,"Minden Áron");
        orderProduct2.Ordering("Mosogatógép",500,"Virra Dóra");
        orderProduct2.Ordering("Hűtőszekrény",10,"Meg Győző");
        System.out.println(wh2.toString());
        sellProduct2.Selling("Mosógép",4,"Erős Pista");
        sellProduct2.Selling("Mosogatógép",9,"Vak Cina");
        sellProduct2.Selling("Abrosz",2,"Git Áron");
        sellProduct2.Selling("Hűtőszekrény",2,"Patkóm Ágnes");
        System.out.println(wh2.toString());
        orderProduct2.Ordering("Hűtőszekrény",4,"Ipsz Ilonka");
        orderProduct2.Ordering("Mosogatógép",5,"Meg Győző");
        System.out.println(wh2.toString());
        sellProduct2.Selling("Mosógép",1,"Eszet Lenke");
        sellProduct2.Selling("Mosogatógép",3,"Vak Cina");
        System.out.println(wh2.toString() + "\n\n");

        wh1.listSupplier();
        wh2.listCustomer();
    }
}
