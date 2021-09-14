//SWITCH STATEMENT
public class Class6 {

	public static void main(String[] args) {

		int score = 95;
		
		switch(score)
		{
		case 100:
		case 95:
		case 90 :
		System.out.println("Very Good");
		break; 
// we break the switch statement here
//without break it print the value of that statement which break the case
// it will read the case till break.
		
		case 60 :
		System.out.println("Good");
		break;
		
		case 40 :
		System.out.println("Ok");
		break;
		
		default :
			System.out.println("Grades Not Defined");
			break;
// default use, if any case not defined then it will show what we give in default 
		}
	}
}
// now it will give the result Very Good because score is 90 so it will print case 90 statement