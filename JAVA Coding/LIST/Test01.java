package LIST;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(7);
Iterator itr = list.iterator();


while(itr.hasNext()){
  
    System.out.println(itr.next());
}

    }
}
