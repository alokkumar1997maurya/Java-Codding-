package LIST;
import java.util.*;
// How to remove the element at a given index in an ArrayList | =======> remove(int index)

// How to remove an element from an ArrayList |=========================> remove(Object o)

// How to remove all the elements from an ArrayList that exist in a given collection |==> removeAll()

// How to remove all the elements matching a given predicate |======> removeIf()

// How to clear an ArrayList | clear()

public class RemoveMethode {
    public static void main(String[] args) {
        List <String> ProgrammingLanguage = new ArrayList<>();
        ProgrammingLanguage.add("C++");
        ProgrammingLanguage.add("Python");
        ProgrammingLanguage.add("Java");
        ProgrammingLanguage.add("JS");

        System.out.println("Programming : " + ProgrammingLanguage);

        ProgrammingLanguage.remove(3);
        ProgrammingLanguage.remove("Java");

        System.out.println("After remove Js  and Java: " + ProgrammingLanguage);


        //  removeAll()  

        ProgrammingLanguage.removeAll(ProgrammingLanguage);
        System.out.println("All Remove :" +ProgrammingLanguage);


        ProgrammingLanguage.clear(); // There have no argument 
        System.out.println("After clear :"+ ProgrammingLanguage);

    }
}
