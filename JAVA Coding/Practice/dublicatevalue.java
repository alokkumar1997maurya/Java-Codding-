package Practice;

public class dublicatevalue {
    public static void main(String[] args) {
        // to find the number who is repeated
        int [] arr = {1,1,2,3,5,5,8,9,8};
        
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1; j<arr.length ; j++){
            if(arr[i] == arr[j] ){
            System.out.println(arr[i]);
            }
            }
        }
    }
    
}
