package Array;

public class findPairGivenNumber {
    public static void main(String[] args) {
      
        int [] Arr = {1,2,3,4,5,6,7,8};
        int n = Arr.length;
        int valueIs = 13;
        for(int i=0 ;i<n; i++ ){
            for(int j=i+1 ; j<n-1; j++){
                if(Arr[i] + Arr[j] == valueIs){
                    System.out.println("(" + Arr[i] + ","+ Arr[j] + ")" );
                }
            }
        }
    }
}
