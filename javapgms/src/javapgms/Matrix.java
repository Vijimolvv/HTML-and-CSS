package javapgms;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {


		


	  Scanner s=new Scanner(System.in);
	  
   int n=s.nextInt();
	  int m=s.nextInt();
	  int arr[][]=new int[n][m];
	  int i,j=0,flag=0;
	  
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   arr[i][j]=s.nextInt();
		   }}
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   
			   if(i==j)
			   {
				   flag=1;
				   
			   }
			   }}
	   if(flag==1)
	   {
		   System.out.print("First diagonal %d"+arr[i][j]);
	   }
	  
  }
}
		
		
