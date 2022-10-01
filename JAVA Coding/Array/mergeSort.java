package Array;

public class mergeSort {
    public static void conquer(int [] arr , int si ,int mid, int ei){
        int [] mearge = new int[ei - si + 1]; 
        int idx1 = si;
        int idx2 = mid +1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                    mearge[x++] = arr[idx1++];
            }
                    else{
                    mearge[x++] = arr[idx2++];

                    }
            }
            while(idx1 <= mid){
                mearge[x++] = arr[idx1++];
            }
            while(idx2 <= ei){
                mearge[x++] = arr[idx2++];
            }
            for(int i=0, j=si ; i<mearge.length; j++, i++ ){
                    arr[j] = mearge[i];
            }
        }
    

    public static void divide(int [] arr , int si , int ei){
        if(si >= ei){
            return; 
        }
        int mid  = si + (ei - si)/2; 
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }
public static void main(String[] args) {
    int [] arr = {5,3,8,9,2,0,1,10,34};
    int n  = arr.length;
    divide(arr, 0 , n-1);   
    for(int i=0 ; i<n ; i++){
        System.out.print(" " + arr[i]);
    }
}    
}
