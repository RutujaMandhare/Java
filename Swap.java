import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args)
	{
		
	
	int x, y, temp;
	System.out.println("Enter value of x and y");
	Scanner input = new Scanner(System.in);
	x= input.nextInt();
	y= input.nextInt();
	
	System.out.println("Before Swapping\nx= "+x+"\ny = "+y);
	
	temp= x;
	x= y;
	y= temp;
	
	System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	
	
	}
}
