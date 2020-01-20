package javapgms;
import java.util.Scanner;
public class Assessment {

	public static void main(String[] args) {
		
		
		
		

	
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter a numerator: ");
		        int numerator = s.nextInt();
		        System.out.print("Enter a denominator: ");
		        int denominator = s.nextInt();

		        if (numerator > denominator)
		        {  
		            System.out.println(numerator + " / " + denominator + " is a proper     fraction"); // Sample 2
		        }
		        else if (numerator<denominator)
		        {
		            int mix = numerator / denominator;
		            int remainder = numerator % denominator;    
		            System.out.println(numerator + " / " + denominator + " is a improper fraction and it's mixed fraction is " + mix + " and "+ remainder + " / " + denominator);// Sample 1
		        }
		        else 
		        {
		            int whole = numerator / denominator ;
		            System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + whole);//Sample 3      
		        }  
		    }

		}
		
