import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a;
	float b;
	String s;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a string");
	s= in.nextLine();
	System.out.println("Your Entered String: " +s);	
	
	System.out.println("Enter an Integer");
	a= in.nextInt();
	System.out.println("Entered Integer:" +a);
	
	System.out.println("Enter a Float value");
	b= in.nextFloat();
	System.out.println("Entered Float value: " +b);
	
	
	

	}

}
