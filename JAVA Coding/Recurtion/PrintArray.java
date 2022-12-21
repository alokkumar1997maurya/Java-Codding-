package Recurtion;
public class PrintArray {
    public static void PrintArrayUsingRecursion(int[] arr, int idx) {
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
          PrintArrayUsingRecursion(arr, idx+1);
        System.out.print(arr[idx] + " ");

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4};
        
            PrintArrayUsingRecursion(arr, 0);
        
       
    }
}
