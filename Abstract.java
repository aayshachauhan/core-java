package JavaPackage;

abstract class Mother
{
    public Mother() 
    { 
    	System.out.println("Super Constructor"); 
    	}
    
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    abstract public void meth2();
}

class Son extends Mother
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}

public class Abstract 
{
	 public static void main(String[] args) 
	    {
		 Mother m=new Son();
	        m.meth1();
	        m.meth2();
	    } 
}
