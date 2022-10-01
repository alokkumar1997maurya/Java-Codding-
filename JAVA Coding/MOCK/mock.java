package MOCK;
//  to find how many number who is less than given number.//
class mock{
    public static void main(String[] args) {
        int [] arr = {1,4,6,7,10,12,15,17,19};
        int k = 10;
        int first = 0;
        int last = arr.length-1;
        int mid = first + (last - first)/2;

        while(first < last){
            
            if(arr[mid] == k){
            //    mid = mid + 1;
                System.out.println(mid); break; 
        }
               
            if(arr[mid] < k){
                first=mid+1;
            }
            else{
                last = mid -1;
            }
            mid = first + (last - first)/2;
        }
    }
}