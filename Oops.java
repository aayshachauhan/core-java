package JavaPackage;

/*class Circle
{
	public double radius;
	public double area()
	
	{
		return Math.PI*radius*radius;
	}
	public double parameter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return parameter();
	}
}
---------------------------------------------------------
class Rectangle
{
	public double length;
	public double breadth;
	
	public double area()
	{
		return length*breadth;
	}
	
	public double parameter()
	{
		return 2*(length+breadth);
	}
}
----------------------------------------------------------
*/
class Rectangle
{
private int length;
private int breadth;

public int getLength()
{
	return length;	
}
public  void setLength(int l)
{
	if(l>0)
	length=l;    			// this is small L not 1
else
	length=0;
}

public int getBreadth()
{
	return length;	
}
public  void setBreadth(int b)
{
	if(b>0)
	breadth=b;    			// this is small L not 1
else
	breadth=0;
}

public int area()

{
	return length*breadth;
}

public class Oops {
 public static void main(String[] args)
 {
	 /*Circle c1=new Circle();
	 
	 c1.radius=10;
	 System.out.println("Area :" +c1.area());
	 System.out.println("parameter :" +c1.parameter());
	 System.out.println("circumference :" +c1.circumference());
----------------------------------------------------------------------------
	 Rectangle r1=new Rectangle();
	 
	 r1.breadth=10;
	 r1.length=45;
	 
	 System.out.println("Area :" +r1.area());
	 System.out.println("Parameter :" +r1.parameter());
-------------------------------------------------------------------------------------	 
 */
	 
	 Rectangle r=new Rectangle();
	 
	 r.setLength(10);
	 r.setBreadth(5);
	 
	 System.out.println(r.area());
	 
 		}
	}
}
 
