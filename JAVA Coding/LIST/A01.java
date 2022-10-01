package LIST;
import java.util.*;



public class A01 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        
        System.out.println("ArrayList : " + list.toString());

        List <Integer> llist = new LinkedList<>();
        llist.add(5);
        llist.add(7);
        System.out.println("LinkedList : " + llist.toString());


        List <Integer> stack = new Stack<>();

        stack.add(8);
        stack.add(23);
        System.out.println("Stack : " + stack.toString());



        List <Integer> sstack = new Stack <Integer>(){{
            add(3);
            add(1);
            add(1);

        }};

        System.out.println("WOWO" + sstack.toString());
    }
}
