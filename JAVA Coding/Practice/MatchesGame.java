package Practice;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class MatchesGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try(Scanner scn  = new Scanner (System.in)){
		    int t = scn.nextInt();
		    
			while(t-->0){
		    int a = scn.nextInt();
		    int b = scn.nextInt();
			int c = a+b;
			int sum = 0;
			while(c!=0){
			
			if(c%10==0 || c%10==6 || c%10==9){
			    sum =sum +6;
			}
			else if(c%10==2 || c%10==3 || c%10==5){
			    sum = sum + 5;
			}
			    else if(c%10==1){
			        sum = sum +1;
			    }
			    else if(c%10==4){
			        sum = sum + 4;
			    }
			    else if (c%10==7){
			        sum = sum + 3;
			    }
			    else if (c%10==8){
			        sum = sum + 7;
			    }
			 c = c/10;
			}
				System.out.println(sum);
			
		}

	}
}
}