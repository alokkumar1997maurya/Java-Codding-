package LIST;
import java.util.*;

// =====>   Collections.addAll(list, 1, 2, 3, 4);   <======
        //    where list is listName 


public class collectionAddAll {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4); 
        System.out.println("ArryaList" + list.toString());


        List <Integer> llist = new LinkedList<>();
        Collections.addAll(llist, 1, 2, 3, 4); 
        System.out.println("LinkedList" + llist.toString());

        List <Integer> stack = new Stack<>();
        Collections.addAll(stack, 1, 2, 3, 4); 
        System.out.println("Stack" + stack.toString());



        
    }
}
