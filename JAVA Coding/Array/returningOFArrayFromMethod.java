package Array;

class returningOFArrayFromMethod{

    public static int[] arr(){
        return new int [] {1,2,3,4,5,6,7};  // NOTE ---
    }
    public static void main(String[] args) {
        int [] arr1 = arr();
        for(int i=0 ; i<arr1.length ; i++){
            System.out.println(arr1[i]);
        }
    }
}