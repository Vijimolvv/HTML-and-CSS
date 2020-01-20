package javapgms;

import java.util.Scanner;

public class Asses2 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the number");
		  int n=s.nextInt();
		  int a[]=new int[n];
		  int i;
		  for(i=0;i<n;i++)
		  {
			  a[i]=s.nextInt();
		  }
		   for(i=0;i<n;i++)
		  {
			   if((a[i]+a[i+1])<=0)
			   {
				   System.out.printf(""+a[i]+"",a[i+1]);
			   }
		   }
		  
		  
		  
	  }
	

}
