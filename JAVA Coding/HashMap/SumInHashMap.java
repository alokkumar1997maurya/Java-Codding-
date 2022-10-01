package HashMap;

import java.util.HashMap;

public class SumInHashMap {
    public static void main(String[] args) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        mp.put(1, 2);
        mp.put(2, 3);
        int sum =0;
        for(int i=1;i<3;i++){
            sum+=mp.get(i);
       
    }
    System.out.println(sum);
}
}
