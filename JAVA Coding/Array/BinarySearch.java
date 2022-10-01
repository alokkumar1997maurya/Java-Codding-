package Array;

public class BinarySearch {
    public static void main(String[] args) {
        
    
    int [] arr = {1,2,3,4,5,6,7,8};

    // Note --> In the binary search arrya should be sorted.
    int search = 8;
    int low  = 0;
    int high = arr.length-1;
    int midd = low + (high - low)/2;
    while(low <= high){
        if(arr[midd] == search ){
            System.out.println("index is " + midd); break;
            
        }
        if(arr[midd] > search){
            high = midd - 1;
        }
        else{
        low = midd + 1;
        }
    
    midd = low + (high - low)/2;
    }
}
    
}
