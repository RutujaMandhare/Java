import java.util.Scanner;

public class Largest {

	public static void main(String[] args){
		
		int a, b, c;
		System.out.println("enter value of a, b, c");
		Scanner in = new Scanner(System.in);
		
		a= in.nextInt();
		b= in.nextInt();
		c= in.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is the largest");
		
		else if(b>c  && b>a)
			System.out.println("b is the largest");
		
			else 
				System.out.println("c is the largest");
				
		
	}
	
}
