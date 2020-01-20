package javapgms;

import java.util.Scanner;

public class Assesme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
			System.out.println("enter the num");
			int num=s.nextInt();
			int digit;int large=0,small=10;
			
			
			int nu=num;
	
		            while(num > 0) {
		                digit = num % 10;
		                if(digit > large)
		                    large = digit;
		                if(digit < small)
		                    small = digit;
		                else if(digit == 0)
		                    small = 0;
		                num /= 10;
		            }
		        
		        System.out.println("Largest digit in " + nu + " is: " + large);
		        System.out.println("Smallest digit in " + nu + " is: " + small);
		    }
		}
			
			
			
			
	
