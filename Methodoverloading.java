package javalearning;


public class Methodoverloading 
/* 
	Methodoverloading is simply passing  parameter with different datattypes
	
In his section we r going to learn the how to create the multiple
   datatypes methods of same method name
   thank you .....
  */
{

	public static void main(String[] args) 
	{ 
     System.out.println(add(10,3));
     System.out.println(add(5.05,7.95));
	 System.out.println(add("The","SuMiT"));
	}

	public static int add(int a,int b)
	{
		return(a+b);
	}
  
	public static double add (double a,double b)
	{
		return(a+b);
	}
	public static String add (String a,String b)
	{
		return(a+b);
	}
}
       
