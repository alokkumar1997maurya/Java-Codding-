package Recurtion;

public class printFibonacciSerease {

    public static int fibSeries(int number) {
        if(number==0)
        {return 0;}
        if(number==1 || number==2)
        {return 1;}
        return fibSeries(number - 2 ) + fibSeries(number - 1);
    }
    public static void main(String[] args) {
    int n=5;
    // System.out.println(n);s
         for(int i=0; n<5; i++){
        System.out.print(fibSeries(i) + " ");
         }
    }
}
