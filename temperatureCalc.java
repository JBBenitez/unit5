import java.util.Scanner;
public class temperatureCalc {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double Celsius; 
		double Fahrenheit;
		System.out.println("Hello please enter a number in Celsius and i will convert it to Fahrenheit");
		Celsius=scan.nextInt();
		Fahrenheit= (9.0/5.0) * Celsius + 32;
		System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");

	}

}
