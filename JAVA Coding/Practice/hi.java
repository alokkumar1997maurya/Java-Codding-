package Practice;
import java.util.*;
public class hi {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {8,7,6,5,4};
        int a = arr1.length;
        int b = arr2.length;
        int c  = a+b;
        Arrays.sort(arr2);
        int [] arr = new int[c];
        for(int i=0 ; i<a ;i++){
            arr[i] = arr1[i];
        }
        for(int i=0 ; i<b ;i++){
            arr[a + i] = arr2[i];
        }
        for(int i=0 ; i<c ;i++){
            System.out.print(" " +arr[i]);
        }
    }
    
}
