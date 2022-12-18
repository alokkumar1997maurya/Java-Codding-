package Recurtion;

public class DecreasingOrder {

    public static void DecreasingOrderTOPrint(int number) {
       if(number==0)
       return;
       System.out.print(number+" ");
       DecreasingOrderTOPrint(number - 1);        
    }
    public static void main(String[] args) {
        DecreasingOrderTOPrint(10);
    }
}
