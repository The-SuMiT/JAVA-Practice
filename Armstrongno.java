package javalearning;
import java.util.Scanner;


public class Armstrongno {

	public static void main(String[] args)
	{
		System.out.println("Enter no to check");
		Scanner obj = new Scanner(System.in);
   
		int n1 =obj.nextInt();
  int n=n1;
		int r1 = n%10;
        n=n/10;
	    int r2 = n%10;
	     n=n/10;
	     int r3 = n%10;
	    int ans= (r1*r1*r1)+(r2*r2*r2)+(r3*r3*r3);
	 
	    if(ans==n1) 
	  {   System.out.println(ans+"   Yesss...iTs Armstrong no");  }
	  else
	  {System.out.println("Its not armstrong no.");}
	
	}

}



















// illahi mera ji aye aye............. :)