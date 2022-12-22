package Recurtion;

public class MultipleTOValue {
  static int mul = 1;
    public static void MultiplyArray(int []arr, int i) {
            if(i==arr.length){
                return;
            }        
           mul = mul * arr[i];
        MultiplyArray(arr, i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        MultiplyArray(arr, 0);
        System.out.println(mul);
    }
}
