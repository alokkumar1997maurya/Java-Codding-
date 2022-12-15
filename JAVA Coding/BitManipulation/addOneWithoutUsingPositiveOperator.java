public class addOneWithoutUsingPositiveOperator {

    public static int addNumber(int number) {

        int bitMask = 1;
        while((number & bitMask) != 0){
            
            number = number^bitMask;
            bitMask = bitMask << 1;
        }
        number = number^bitMask;
        return number;
    }

    public static void main(String[] args) {
         System.out.println(addNumber(100));
        
    }
}
