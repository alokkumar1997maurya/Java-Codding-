 
public class SwapingOFTwoNumber {

   
    public static void main(String[] args) {
    
int number1 = 5;
int number2 = 7;

            number1^=number2;
            number2^=number1;
            number1^=number2;
        
            System.out.println("number1:=>" + number1);
            System.out.println("number2:=>"+ number2);
        }
    }

