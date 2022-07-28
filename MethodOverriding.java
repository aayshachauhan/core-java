package JavaPackage;
class Super
{
    public void display()
    {
        System.out.println("Hello");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Hello Welcome");
    }
}

public class MethodOverriding {
	
	    public static void main(String[] args) 
	    {
	    	
	    	Super sp=new Super();
	    	sp.display();
	    	
	    	Sub sb=new Sub();
	    	sb.display(); 		
	    // two display method - one is coming from parent class and other is again efine in child class. How it can be two methods – only one method execute and parent class method shadow(hidden). 
	    	
	    	
	        Super s=new Sub();
	        s.display();
	     // A parent class of reference when holding an object of sub class and override method is called then it is called dynamic method dispatch. 
	     //Always method of object will be called, not method of refrence.	          
	    }
	
}
