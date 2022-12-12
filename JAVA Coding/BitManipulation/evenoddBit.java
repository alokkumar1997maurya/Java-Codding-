
class evenoddBit{
    public static void main(String[] args) {
        
        int number = 6341;
        if((number & 1) == 0)
            System.out.println("Even");
        else
        System.out.println("Odd");
    }
}