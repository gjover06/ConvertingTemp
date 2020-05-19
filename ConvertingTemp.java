import java.util.Scanner;

//Author: George Samu


public class ConvertingTemp
{
	public static void main(String[] args)
	{
	
	System.out.println("Converting F to C");
	Scanner keyboard=new Scanner(System.in);
	double F = keyboard.nextDouble();
	double C= 5*(F-32)/(9);
	
	System.out.println("The Celcius is: "+C+" Celcius");
	}//end main
}//end ConvertingTemp