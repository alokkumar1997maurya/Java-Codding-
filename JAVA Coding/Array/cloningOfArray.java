package Array;

public class cloningOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = arr.clone();   //   clone()  is a method to make coopy one array to another array
        System.out.println(arr==arr1); // will print false as deep copy is created
                                         // for one-dimensional array
        for(int i=0; i<arr1.length ; i++){
            System.out.print(" " + arr1[i]);

            
        }
     }
    
}
