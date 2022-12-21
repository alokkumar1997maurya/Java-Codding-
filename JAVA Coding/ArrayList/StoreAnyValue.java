package ArrayList;
import java.util.ArrayList;

public class StoreAnyValue {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        
        list.add("ans");
        list.add(78);
        list.add(true);
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(787)));
    }
}
