package Recurtion;

public class PrintNumberIncreasingOrder {

        public static void numberInIncreasingOrder(int number) {
            if(number==0)
            return;
            numberInIncreasingOrder(number - 1);
            System.out.println(number);
        }
    
    public static void main(String[] args) {
        numberInIncreasingOrder(8);
    }
}
