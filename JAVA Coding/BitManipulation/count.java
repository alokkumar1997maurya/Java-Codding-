public class count {
    public static void main(String[] args) {
        int number = 10;
        int count;
    //     while(number>0)
    //     {
    //         // number=number&(number-1);
    //         // count++;
    //         if((number&1)==1)
    //         count++;
    //         number >>= 1;
    // }
    
    for(count=0;number>0;count++ )
    number=number&(number-1);
    System.out.println("setbit "+count);
        }
  
    
}
