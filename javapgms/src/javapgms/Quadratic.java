package javapgms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {


				
			Scanner s=new Scanner(System.in);
			System.out.println("enter first num");
			int b=s.nextInt();
			System.out.println("enter secondrst num");
			int c=s.nextInt();
				int a = 1;
				int ss=(b*b-4*a*c);
			double d=Math.sqrt(ss);

			//  System.out.println(Math.sqrt(ss));
			
			
			double d2=b-d;
			double d3=b-(-d);
		double x1=(d2/2*a);
			double x2=(d3/2*a);
			System.out.println(x1);
			System.out.println(x2);
		
			
		
		
		
	}

}
