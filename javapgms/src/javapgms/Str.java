package javapgms;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		
		   

	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int i=0;;
	  int a[]=new int[n];
	  for(i=0;i<n;i++);
	  {
		  a[i]=s.nextInt();
	  }
	int size=a.length;
	  int result=a[0];
	  while(i<size)
	  {
		  if(result%a[i]==0)
		  {
			  i++ ;
		  }
		  else
		  {
			  result=result%a[i];
		  i++;
	  }
  }
	System.out.printf("Lcm is %d",result);
	 
	
			  
		  }
	
}
