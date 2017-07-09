import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float temp;
		Scanner in = new Scanner( System.in);
		System.out.println("Enter temperature in farenheit");
		temp= in.nextFloat();
		temp = ((temp - 32)*5)/9;
		 
	    System.out.println("Temperatue in Celsius = " + temp);
	  }
	}
		

	
