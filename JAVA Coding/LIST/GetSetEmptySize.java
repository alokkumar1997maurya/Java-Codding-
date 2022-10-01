package LIST;
import java.util.*;
import java.util.ArrayList;

public class GetSetEmptySize {
    public static void main(String[] args) {
        
        List <String> list = new ArrayList<>();
        System.out.println("is list is empty : " + list.isEmpty());
        list.add("Iphone");
        list.add("Sumsung");
        list.add("Nokia");
        System.out.print("Top" + list.size() + " " );
        System.out.println("Companese is : " + list);

            // Retrive the element to given list
            String topfirstCompaney = list.get(0);
            String topSecondCompaney = list.get(1);
            String topThirdCompaney = list.get(list.size()-1);
            System.out.println("Top first Companey : " + topfirstCompaney);
            System.out.println("Top Second Companey : " + topSecondCompaney);
            System.out.println("Top Third Companey : " + topThirdCompaney);

               //  to modify the element to given Element
                list.set(2, "Oppo");
                System.out.println("Modified companese is : " + list);


    }
}
