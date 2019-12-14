package javalearning;

class animal
{
	int a;
		void sound() 
	{
		System.out.println("Sounds");
	}
}
	class cat extends animal
	{  
		int b;
		void meow()
		{
			System.out.println("meowing...");
		}  
	
	} 
public class Hierarchicalinheritance 
{
	public static void main(String[] args)
	{
		cat obj =new cat(); //here is error
obj.a=0013;
		obj.sound();
	System.out.println(obj.a);
	}
}
