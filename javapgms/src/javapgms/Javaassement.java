package javapgms;

import java.util.Scanner;

public class Javaassement {

	public static void main(String[] args) {
		
		
		
		        Scanner s=new Scanner(System.in);
		        int n,p;
		        n=s.nextInt();
		        int i,sum=0,sum1=0;
		        for(i=1;i<=n;i++)
		        {
		            if(i%2==0)
		            {
		                sum=sum+i*i;
		            }
		            else 
		            {
		                sum1=sum1+i*i;
		            }
		        }
		        p=sum-sum1;
		        System.out.println(p);
		    }
		}
		 
		
		
		

