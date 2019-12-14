package javalearning;

public class Interfaceeg
{
public static void main(String[] args)
	{
	Square s=new Square();
	s.angle();
	s.draw();
	}
}
interface Draw
{
void draw();
}

interface Angle
{
void angle();	
}
class Square implements Draw,Angle
{
	public void draw()
	{
	System.out.println("Drawing square");

	}
	public void angle()
	{ System.out.println("90°"); }
	
}
	