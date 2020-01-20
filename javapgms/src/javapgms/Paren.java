package javapgms;

import java.util.Scanner;

public class Paren {

			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				 System.out.println("enter size");
				String str=s.next();
				int sum=0;int i;
				char ch;sum=0;
			 for ( i = 0; i < str.length(); i++) { 
		       ch =str.charAt(i); 
		      if(ch=='1'||ch=='2')
		      {
		    	  
		    	  sum=sum+ch;
		      }
				
					
					
				}
				System.out.println(sum);
				
			}}
				
		  