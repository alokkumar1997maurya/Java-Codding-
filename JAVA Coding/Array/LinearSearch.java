package Array;
class LinearSearch{
    public static void main(String[] args) {
        int [] arr = {1,23,5,6,7,4,2,6,8};

        int search = 7;
        for(int i=0;i<arr.length;i++){
            if(search == arr[i]){
                System.out.println(i); break;
            }
        }
        
    }
}