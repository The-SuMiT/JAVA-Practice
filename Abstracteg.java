package javalearning;
public class Abstracteg   // This porgram gives the example and information about Abstract class

{
	public static void main(String[] args)
	{
		Shape d =new Rectangle();   // d object created 
	d.draw();              // this will run the upadted draw function  i.e  of Rectangle class function  
	Shape t=new triangle();
	t.draw();   
	
	}
	}

 abstract class Shape    // shape is an abstract class it that why  will  not contain the implementation of its function 
	 		// function of abstact class are implictly abstact ...!
{  abstract void draw();  }  


 class Rectangle extends Shape
{  
void draw(){System.out.println("drawing rectangle");}  
}  



class triangle extends Shape
{	
public void draw() {System.out.println("Drawing Triangle");	}
}
