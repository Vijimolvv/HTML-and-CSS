package javapgms;

import java.util.Scanner;

public class Assess1 {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int r,max=0,i;
	while(n!=0)
	{
	r=	n%10;
	n=n/10;
	for(i=0;i<10;i++)
	{
		
	
	if(r>max)
	{
		max=r;
		System.out.println(max);
		
	}}}
		System.out.println(max);
	}
	}

	


