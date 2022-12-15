public class set {

public static int setvalue(int number, int i) {

    int setBit = 1 << i ; 
    return number | setBit;
}

    public static void main(String[] args) {
        System.out.println(setvalue(5, 1));
    }
}
