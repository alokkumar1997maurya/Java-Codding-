package HashMap;
import java.util.*;
public class Syntex {
    public static void main(String[] args) {
        HashMap <Integer,String>  mp = new HashMap<>();
        mp.put(1, "Alok");
        mp.put(2, "Vivek");
        mp.put(null, "Vivek");
        mp.put(null, "Ayush");
        System.out.println(mp);
        System.out.println(mp.size());
        System.out.println(mp.isEmpty());
        System.out.println(mp.containsValue("Alok"));
        HashMap <Integer,String>  mp1 = new HashMap<>(mp);
        System.out.println("new map" + mp1);
    
    }
    
}
