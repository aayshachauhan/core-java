package JavaPackage;
import java.util.*;

public class Array {
	
	public static void main(String[] args)
		{
		ArrayList<Integer> al1=new ArrayList<>(List.of(50,60,70,80,90));
		
		ArrayList<Integer> al2=new ArrayList<>(List.of(80,90,100,110));

		al1.add(10);			//10 has no index number so it can print anywhere according to other index
		al1.add(0, 5);
		al1.addAll(1,al2);
		al1.set(6, 100);
		//al1.retainAll(al2);
		//System.out.println(al1.contains(50));
		//System.out.println(al1.contains(50));
		//System.out.println(al1.containsAll(al2));
		//System.out.println(al1.retainAll(al2));

		//System.out.println(al1);
		
		//System.out.println(al1.indexOf(90));
		
		
		for(int i=0; i<al1.size(); i++)
		System.out.println(al1.get(i));
		
	//	or another method to get the same result 
		//for (Integer x:al1)
			//System.out.println(x);

	}

	
/*	{
		LinkedList<Integer> al1=new LinkedList<>();
		
		LinkedList<Integer> al2=new LinkedList<>(List.of(80,90,100,110));

		al1.add(10);			//10 has no index number so it can print anywhere according to other index
		al1.add(0, 5);
		al1.addAll(1,al2);
		al1.set(6, 100);
	
		al1.forEach(n->show(n));
	}
	
	static void show(int n)
	{
		if (n>80)
			System.out.println(n);
	}*/
	
}



