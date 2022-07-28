package JavaPackage;

public class CreateObject {
		   
	    
		public static void main(String[] args)   
		{    
			//creating an object using new keyword   

			CreateObject obj = new CreateObject();   
			
			//invoking method using the object 

		obj.show();    
		} 
		void show()    // if we make this method static - public static void show() then we dont need obj.show. we simply use Ayesha.show
		{    
		System.out.println("Welcome");    
		}   
}
