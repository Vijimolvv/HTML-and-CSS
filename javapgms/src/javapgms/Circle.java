package javapgms;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		System.out.println("enter  x1");
		int x1=s.nextInt();
		System.out.println("enter y1");
		int y1=s.nextInt();
		
		System.out.println("enter  x2");
		int x2=s.nextInt();
		System.out.println("enter y2");
		int y2=s.nextInt();
		System.out.println("enter  r1");
		int r1=s.nextInt();
		System.out.println("enter r2");
		int r2=s.nextInt();
		int rad=r1+r2;
		int res=(x1-x2)*(x1-x2);
		int res1=(y1-y2)*(y1-y2);
		int res3=res+res1;
		double result=Math.sqrt(res3);
		
		if(result==rad)
		{
			System.out.println(" Circle A and B are touch to each other.");
		}
		else if(result>rad)
		{
			System.out.println(" Circle A and B are not touch to each other.");
		}
		else
		{
			System.out.println("   Circle intersects each other.");
		}
		
		
		
		
		
		
	}

}
