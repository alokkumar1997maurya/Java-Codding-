package LIST;
import java.util.*;
public class putVAlueOntherList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(9);


        ArrayList<Integer> ToTransferValue = new ArrayList<>(list);
        
        System.out.println(ToTransferValue );
    }
}
