//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. 
//Its constructor having parameters for length and breadth is used to initialize length and breadthof the rectangle.
//Print the area and perimeter of a rectangle

package pack1;

class Rect
{
	static int length;    //static data members
	static int breadth;
	
	public Rect(int length,int breadth)   //Parameterized constructor
	{
		this.length=length;
		System.out.println("Length:"+length);
		this.breadth=breadth;	
		System.out.println("Breadth:"+breadth);
	}
	public void area()
	{
		double area;
		area=breadth*length;
		
		System.out.println("Area of rectangle:"+area);  
	}
	public void perimeter()
	{
		double perimeter;
		perimeter=2 * (breadth + length);
		
		System.out.println("Perimeter of rectangle:"+perimeter);
	}
}

public class RectangleEx {

	public static void main(String[] args) {
		Rect r=new Rect(10,20);
		r.area();
		r.perimeter();
	}
}
