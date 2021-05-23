package warehouse;

public class Array {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private Products arr[];
    private int count;

    public Array (int length){
        arr = new Products[length];
    }

    public boolean isEmpty(){
        if(count == 0)
            return true;
        return false;
    }

    public void insert (Products element){
        if (arr.length == count){
            Products newArr [] = new Products[2*count];
            for (int i = 0; i< count; i++){
                newArr[i] = arr[i];
            }
            arr=newArr;
        }
        arr[count++]=element;
    }

    public boolean contains (Products element){
        for (int i = 0; i < count; i++){
            if (arr[i].getName() == element.getName()){
                return true;
            }
        }
        return false;
    }

    public void adding(Products element){
        for (int i = 0; i < count; i++){
            if (arr[i].getName() == element.getName()){
                arr[i].setQty(arr[i].getQty()+element.getQty());
            }
        }
    }

    public void taking(Products element){
        for (int i = 0; i < count; i++){
            if (arr[i].getName() == element.getName()){
                if(arr[i].getQty() >= element.getQty()) {
                    arr[i].setQty(arr[i].getQty() - element.getQty());
                    System.out.println(ANSI_YELLOW + "Eladva, " + element.toString() + ANSI_RESET);
                }
                else
                    System.out.println(ANSI_RED + "A " + element.getName() + " termékből nincs elég készleten!" + ANSI_RESET);
            }
        }
    }

    public String PrintArray()
    {
        String s ="";
        for(int i = 0; i < count; i++){
            s=s+arr[i].toString()+", ";
        }
        return s;
    }

    public int getCount() {
        return count;
    }
}
