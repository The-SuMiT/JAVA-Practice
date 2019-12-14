package javalearning;


class vehicle extends car
{
	int a;
		void sound() 
	{
		System.out.println("Sounds");
	}
}
	class car 
	{  
		int b;
		void buzz()
		{
			System.out.println("Vroom...");
		}  
	
	} 
public class inheritance
{
	public static void main(String[] args)
	{
		car obj =new vehicle(); 
	//	vehicle obj =new car(); 
obj.b=0013;
		obj.buzz();
System.out.println(obj.b);
	}
}
