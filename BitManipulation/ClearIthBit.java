package BitManipulation;

public class ClearIthBit {
    
        public static int TOClearIthValue(int number, int i) {
           
                 int bitMask = (-1)<<i;
                 return number & bitMask;
           
        }
       
           public static void main(String[] args) {
               System.out.println(Integer.toBinaryString(TOClearIthValue(15, 2)));
               System.out.println(" ");
           }
       }



    

