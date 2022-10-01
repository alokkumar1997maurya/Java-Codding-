package Practice;
import java.util.*;


public class ToRemoveDuplicateValue {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        mp.put(1, 2);
        mp.put(2, 3);
        mp.put(3, 4);
        mp.put(4, 6);
        mp.put(5, 3);
        mp.put(6, 2);
        for(int i=1;i<7;i++){
            for(int j=i+1;j<7;j++){
                if(mp.containsValue(i)!= mp.containsValue(j) ){
                    System.out.println(mp);
            }
            }
        }
        }

    }
    

