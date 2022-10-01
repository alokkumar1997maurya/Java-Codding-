package LIST;
import java.util.*;;

// List<Integer> list = Collections.unmodifiableList(
//             Arrays.asList(1, 2, 3));

public class unmodifiable {
    public static void main(String[] args) {
        try{
        
        List<Integer> list = Collections.unmodifiableList(
            Arrays.asList(1, 2, 3));

            System.out.println("List is : " + list.size());
            list.add(6);      //  we can not modify the list
             System.out.println(list.toString());  
        }
             
        catch (Exception q) {
            System.out.println("Exception hai bro!  ");
    }
}
}