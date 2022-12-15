public class get {

public static int getTheBitGivenPosition(int number, int i) {
    
    int bitMask = 1 << i;
    if((number & bitMask) == 1){
        return 1;
    }  else
    return 0;
}

    public static void main(String[] args) {
        System.out.println(getTheBitGivenPosition(5, 0));
    }
}
