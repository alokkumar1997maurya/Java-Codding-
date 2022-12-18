
class evenoddBit{
    public static void main(String[] args) {
        
        int number = 634;
        if((number & 1) == 0)
            System.out.println("Even");
        else
        System.out.println("Odd");

        // ((number & 1)==0)?System.out.println("Even"):System.out.println("odd");
    }
}