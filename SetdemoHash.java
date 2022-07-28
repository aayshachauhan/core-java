package JavaPackage;
import java.util.*;

public class SetdemoHash {
	 
	public static void main(String[] args) 
	{
	        
	        HashSet<Integer> hs=new HashSet<>(20,0.75f);
	        
	        hs.add(10);
	        hs.add(20);
	        hs.add(30);
	        hs.add(10);
	        
	        System.out.println(hs);
	    }
	    
	
	 /*  {
	         ArrayDeque<Integer> dq=new ArrayDeque<>();
	         
	         dq.offerLast(10);
	         dq.offerLast(20);
	         dq.offerLast(30);
	         dq.offerLast(40);
	         
	         dq.pollFirst();
	         
	         dq.offerLast(1);
	         dq.offerLast(2);
	         dq.offerLast(3);
	         dq.offerLast(4);
	         
		        System.out.println(dq);
	       //  dq.forEach((x)->System.out.println(x));
	        
	    }  */
}
