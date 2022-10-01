package LIST;
import java.util.*;

public class ArrayListIteratorRemove {
    public static void main(String[] args) {
      List <Integer> numbers = new ArrayList<>();
      numbers.add(4);
      numbers.add(6);
      numbers.add(7);
      numbers.add(9);
        
      Iterator <Integer> numberIterator = numbers.iterator();
       while(numberIterator.hasNext()){
        Integer num = numberIterator.next();
        if(num%2 ==0){
           numberIterator.remove();
        }
       }
System.out.println(numbers);

    }
}
