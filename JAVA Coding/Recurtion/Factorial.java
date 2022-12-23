package Recurtion;

public class Factorial {

     public static int  FindFactorial(int number) {

       if(number == 0)
       return 1;
       return number * FindFactorial(number-1);
        
     }
    public static void main(String[] args) {
        System.out.println(FindFactorial(6));
    }
}


// Hi 