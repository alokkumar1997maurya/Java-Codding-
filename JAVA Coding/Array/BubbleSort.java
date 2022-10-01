package Array;

public class BubbleSort {
    public static void main(String[] args) {
            int [] arr = {1,4,3,7,9,4,2,4,6,78,4,2,5};
            int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    // int temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;

                    // swap number Without using third variable
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print( " " + arr[i]);
        }
    }
    
}
