package Practice;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class HowManyGreater
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner scn = new Scanner (System.in)) {
				int t = scn.nextInt();
					while(t-->0){
				    int n = scn.nextInt();
				    int s = scn.nextInt();
				    int [] arr = new int[n];
				    for(int i=0; i<n; i++){
				        arr[i] = scn.nextInt();
				    }
				       int  count = 0;
				    for(int i=0; i<n ; i++){
				        if(s<arr[i]){
				            count ++;
				        }
				        
				    }
				    System.out.print(count);
					    
					}
			}
	}
}
