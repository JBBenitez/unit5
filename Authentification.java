import java.util.Scanner;
public class Authentification
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean Continue;
		String Username, Password;
		System.out.println("Please enter your username and password");
		Continue=true;
		do
		{
			Username=scan.nextLine();
			Password=scan.nextLine();
			if(Username.equals("Sthfan007")||Password.equals("MountFluff"))
			{
				System.out.println("Welcome  " + Username);
				Continue=false;
			}
			else
			{
				System.out.println("Invalid Username or Password");
			}
			
		}while(Continue);

	}

}
