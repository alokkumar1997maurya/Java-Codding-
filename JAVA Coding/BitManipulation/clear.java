public class clear {
public static int  clearBitGivenPosion(int number, int i) {
    int bitMask = ~(1<<i);

    return number & bitMask;
}

    public static void main(String[] args) {
        System.out.println(clearBitGivenPosion(10, 2));

    }
}
