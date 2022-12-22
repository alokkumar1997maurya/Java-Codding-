package Recurtion;


class SumOfArray{
         static  int sum =0;
    public static void SumofArry(int[] arr , int i) {
         
        if(i==arr.length){
            return;
        }
         sum = sum + arr[i];
        
        //  System.out.println(sum);
            SumofArry(arr, i+1);
           
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,1,9,1,30};
        SumofArry(arr, 0);
        System.out.println(sum);
    }
}