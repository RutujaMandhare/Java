import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int x;
  
  System.out.println("Enter an integer :");
   Scanner in = new Scanner(System.in);
   
   x= in.nextInt();
   if(x%2==0)
   {
	   System.out.println("Entered no is an Even no");
	   
   }
   else{
	   System.out.println("Entered no is an Odd no");
   }

	}

}
