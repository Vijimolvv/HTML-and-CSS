package javapgms;

import java.util.Scanner;

public class Hello {

	
  public static void main(String [] args)
  {
    //Type your code here
	  Scanner s=new Scanner(System.in);
	     
      int min, max, x, lcm = 0;
	  int n=s.nextInt();
	  int i;
	  int a[]=new int[n];
	  for(i=0;i<n;i++);
	  {
		  a[i]=s.nextInt();
	  }
	  
	  
	  
	  for(i = 0; i<a.length; i++) 
	  {
         for(int j = i+1; j<a.length-1; j++) 
		 {
            if(a[i] > a[j]) 
			{
               min = a[j];
               max =a[i];
            }
			 else
			 {
               min = a[i];
               max = a[j];
            }
            for(int k =0; k<a.length; k++) 
			{
               x = k * max;
               if(x % min == 0)
			   {
                  lcm = x ;
               }
            }
         }
      }
     System.out.printf("Lcm is %d",lcm);
	 
	  
 
		
		
		
	}

}
