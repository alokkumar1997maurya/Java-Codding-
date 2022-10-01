package Practice;
 import java.util.*;
// In this programming find element common element and remove it 
// then print array after removing .................

public class removeDublicateElementArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,7,7,5,3,9,7};
        // in the out put all value but single  time 
        
        HashSet<Integer> map = new HashSet<Integer>();
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i  ; j<arr.length ; j++){
                    if(arr[i]!=arr[j]);
                    map.add(arr[j]);

            }
        }
        System.out.println(map);
    }
    
}
