
package JavaPackage;

class Test
{
	int max(int x, int y)
	{
	return x>y ? x:y;
	}
	float max (float x, float y)
	{
	return x>y ? x:y;
	}
	int max(int x, int y, int z)
	{
	return x>y&&x>z ? x:(y>z?y:z);
	}
}


public class MethodOverloading {

	public static void main(String[] args)
	{
		Test t=new Test();
		t.max(5, 9, 5);
		t.max(5, 9);
		t.max(10, 5);
		
	}
	
}
