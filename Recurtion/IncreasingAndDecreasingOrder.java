package Recurtion;

public class IncreasingAndDecreasingOrder {

    public static void PrintNumberIncreasingOrderBoth(int number) {
        if(number==0)
        return;
        System.out.print(number + " ");
        PrintNumberIncreasingOrderBoth(number - 1);
        System.out.print(number + " ");

        
    }
    public static void main(String[] args) {
        PrintNumberIncreasingOrderBoth(10);
    }
}
