import java.util.Scanner;
public class squareRoot
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double Number, sqRoot;
		System.out.println("Please enter a number and i will ouput the square root");
		Number=scan.nextDouble();
		sqRoot=Math.sqrt(Number);
		System.out.println(sqRoot);
		
		

	}

}
