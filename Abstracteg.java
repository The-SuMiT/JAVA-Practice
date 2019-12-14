package javalearning;
public class Abstracteg

{
	public static void main(String[] args)
	{
		Shape d =new Rectangle();
	d.draw();
	Shape t=new triangle();
	t.draw();
	
	}
	}

 abstract class Shape
{  abstract void draw();  }  


 class Rectangle extends Shape
{  
void draw(){System.out.println("drawing rectangle");}  
}  



class triangle extends Shape
{	
public void draw() {System.out.println("Drawing Triangle");	}
}