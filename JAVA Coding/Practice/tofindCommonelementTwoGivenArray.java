package Practice;
import java.util.*;

// In this I have to given two array 
// TO find common element  

public class tofindCommonelementTwoGivenArray {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5};
        int [] arr2 = {5,4,8,9};
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr1.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                if(arr1[i]==arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }
             System.err.println(set);
    }
    
}
