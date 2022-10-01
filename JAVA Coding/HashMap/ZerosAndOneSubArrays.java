package HashMap;
import java.util.*;
public class ZerosAndOneSubArrays {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int [] arr = new int[n];
             for(int i=0; i<n ; i++){
                 arr[i] = scn.nextInt();
             }
             System.out.println(countSubarrays(arr, n));
        }
         }
         public static long countSubarrays(int arr[], int n){
                for(int i=0; i<n;i++){
                    if(arr[i]==0){
                        arr[i] = -1;
                    }
                }
                    int result =0;
                    int sum = 0;
                    HashMap <Integer,Integer> map = new HashMap<>();
                    for(int i=0; i<n ; i++){
                        sum = sum + arr[i];
                        if(sum==0){
                            result++;
                        }
                        if(map.containsKey(sum)){
                            result = result + map.get(sum);
                            map.put(sum, map.get(sum)+1);
                        }
                        else{
                            map.put(sum, 1);
                        }
                    }
                    return result;
          }
    }
    







