
package Array;
import java.util.*;
public class maxSUBARRAY_sum {
    public static void main(String[] args) {
        int a[]={1,2,3,-4,-6,7,1,-2,5,7,4,3,2,-10,1,1,1,1};
        Arrays.sort(a);
        int max=a[a.length-1];
        for(int i=a.length-2;i>0;i--){
           int  max1=max+a[a.length-1];
            //  max1=max+a[i]
            if(max1>max){
                System.out.println(max1);
            }

        }
    }
   
    
}
