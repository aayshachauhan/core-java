package JavaPackage;

public class MethodPractice {

	static void inc(int x) 
	{
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		
		int a=10, b=15;
		
		inc(b);
		System.out.println(a);
	}
}	

/* public class MethodPractice {

// int max(int x, int y)  
{
	if (x>y)
		return x;
	
	else 
		return y;
}

public static void main(String[] args) {
	
	int a=10, b=15;
	System.out.println(max(a,b));
	
	MethodPractice mp=new MethodPractice();
	System.out.println(mp.max(a,b));
}
}

if you dont want to make max method static then create an object of class

 we make max method static then we don't need to create an object and also dont need to call object referance with class. 
*/
	
//#passing parameters

/*public class MethodPractice {

    static void change(int A[],int index,int value)
    {
        A[index]=value;
    }
    
    static void change2(int x,int value)
    {
        x=value;
    }
    
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        
        change(A,2,20);
        
        for(int x:A)
        {
            System.out.println(x);
        }
        
        int x=10;
        
        change2(x,20);
        
        System.out.println("Value of primitive "+x);
    }
    
} */

