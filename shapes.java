import java.util.*;
abstract class shape
{
	protected int l,b;
	protected float area;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st dimension");
		l = sc.nextInt();
		System.out.println("Enter 2nd dimension");
		b = sc.nextInt();
	}
	abstract float calculate();
	void printarea()
	{
		System.out.println("Area = "+calculate());
	}
	}
	class Rectangle extends shape
	{
		float calculate()
		{
			area = l*b;
			return area;
		}
	}
	class Triangle extends shape
	{
		float calculate()
		{
			area = (l*b)/2;
			return area;
		}
	}
	class Circle extends shape
	{
		float r;
		float calculate()
		{
			System.out.println("Enter radius");
			r= sc.nextFloat();
			area=3.14*r*r;
			return area;
		}
	}
	class Area
	{
		public static void main(String args[])
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter\n1. rectangle\n2.Triangle\n3.Circle");
			int n = sc.nextInt();
			shape ref;
			if(n==1)
				ref = new Rectangle();
			else if(n==2)
				ref = new Triangle();
			else
				ref= new Circle();
			ref.getdata();
			ref.calculate();
			ref.printarea();
		}
	}
