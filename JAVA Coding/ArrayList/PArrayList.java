package ArrayList;
import java.util.ArrayList;
public class PArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(7);
        list.add(18);
        list.add(36);
        list.add(1,11);
        System.out.println(list);

        list.set(1, 100);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
    }
}
