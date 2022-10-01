package Practice;
public class findPrettyNumber {
    public static void main(String[] args) {
    
                int count =0;
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 2 || i % 10 == 3 || i % 10 == 9) {
                    count ++;
            }
        }
        System.out.println(count);

    }

}
