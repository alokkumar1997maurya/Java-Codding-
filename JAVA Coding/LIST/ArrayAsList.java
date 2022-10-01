package LIST;
import java.util.*;
import java.util.Arrays;
import java.util.List;

// Using           =====>    Arrays.asList()    <=====

// Creating Immutable List
// Arrays.asList() creates an immutable list from an array. Hence it can be used to instantiate a list with an array.

// Syntax:

// List<Integer> list=Arrays.asList(1, 2, 3);





public class ArrayAsList {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    System.out.println(list.toString());


    List<Integer> llist=new ArrayList<>(Arrays.asList(1, 2, 3));
    System.out.println(llist.toString());

    List<String> lllist=new ArrayList<>(Arrays.asList("Alok","Vivek"));
    System.out.println(lllist.toString());
}  
    }
