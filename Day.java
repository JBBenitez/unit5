import java.util.Scanner;
public class Day
{
	private String name;
	public void read( )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("what is todays day?");
		name=scan.nextLine();

	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDay(String name)
	{
		this.name=name;

	}
	public void checkDay()
	{
		if (name.equalsIgnoreCase(("monday")))
		{
			System.out.println("today is monday, yesterday was sunday and tomorrow will be tuesday.");
		}
		else if(name.equalsIgnoreCase("sunday"))
		{
			System.out.println("today is sunday, yesterday was saturday and tomorrow will be monday.");
		}
		else if(name.equalsIgnoreCase("tuesday"))
		{
			System.out.println("today is tuesday, yesterday was monday and tomorrow will be wednesday.");
		}
		else if(name.equalsIgnoreCase("wednesday"))
		{
			System.out.println("today is wednesday, yesterday was tuesday and tomorrow will be wednesday.");
		}
		else if(name.equalsIgnoreCase("thursday"))
		{
			System.out.println("today is thursday, yesterday was wednesday and tomorrow will be friday.");
		}
		else if(name.equalsIgnoreCase("friday"))
		{
			System.out.println("today is friday, yesterday was thursday and tomorrow will be saturday.");
		}
		else if(name.equalsIgnoreCase("saturday"))
		{
			System.out.println("today is saturday, yesterday was friday and tomorrow will be sunday.");
		}
	}
	public void calculateDay()
	{
		if (name.equalsIgnoreCase(("sunday")))
		{
			sunday();
		}
		else if(name.equalsIgnoreCase("monday"))
		{
			monday();
		}
		else if(name.equalsIgnoreCase("tuesday"))
		{
			tuesday();
		}
		else if(name.equalsIgnoreCase("wednesday"))
		{
			wednesday();
		}
		else if(name.equalsIgnoreCase("thursday"))
		{
			thursday();
		}
		else if(name.equalsIgnoreCase("friday"))
		{
			friday();
		}
		else if(name.equalsIgnoreCase("saturday"))
		{
			saturday();
		}

	}
	public String getName()
	{
		return name;
	}
	public void sunday()
	{
		Scanner scan = new Scanner(System.in);
		int test;
		int days;
		int count;
		days=0;

		System.out.println("Enter the number of days you would like to advance in the future");
		test = scan.nextInt();

		for(count = 0; count<test; count++)
		{
			days++;
			if(days>=7)
			{
				days=0;
			}

		}
		if(days==1) {
			System.out.println(test + " days in the future will be monday");
		}
		else if(days==2) {
			System.out.println(test + " days in the future will be tuesday");
		}
		else if(days==3) {
			System.out.println(test + " days in the future will be wednesday");
		}
		else if(days==4) {
			System.out.println(test + " days in the future will be thursday");
		}
		else if(days==5) {
			System.out.println(test + " days in the future will be friday");
		}
		else if(days==6) {
			System.out.println(test + " days in the future will be saturday");
		}
		else if(days==0) {
			System.out.println(test + " days in the future will be sunday");
		}
	}
	public void monday()
	{
		Scanner scan = new Scanner(System.in);
		int test;
		int days;
		int count;
		days=0;

		System.out.println("Enter the number of days you would like to advance in the future");
		test = scan.nextInt();

		for(count = 0; count<test; count++)
		{
			days++;
			if(days>=7)
			{
				days=0;
			}

		}
		if(days==0) {
			System.out.println(test + " days in the future will be monday");
		}
		else if(days==1) {
			System.out.println(test + " days in the future will be tuesday");
		}
		else if(days==2) {
			System.out.println(test + " days in the future will be wednesday");
		}
		else if(days==3) {
			System.out.println(test + " days in the future will be thursday");
		}
		else if(days==4) {
			System.out.println(test + " days in the future will be friday");
		}
		else if(days==5) {
			System.out.println(test + " days in the future will be saturday");
		}
		else if(days==6) {
			System.out.println(test + " days in the future will be sunday");
		}
	}
	public void tuesday()
	{
		Scanner scan = new Scanner(System.in);
		int test;
		int days;
		int count;
		days=0;

		System.out.println("Enter the number of days you would like to advance in the future");
		test = scan.nextInt();

		for(count = 0; count<test; count++)
		{
			days++;
			if(days>=7)
			{
				days=0;
			}

		}
		if(days==6) {
			System.out.println(test + " days in the future will be monday");
		}
		else if(days==0) {
			System.out.println(test + " days in the future will be tuesday");
		}
		else if(days==1) {
			System.out.println(test + " days in the future will be wednesday");
		}
		else if(days==2) {
			System.out.println(test + " days in the future will be thursday");
		}
		else if(days==3) {
			System.out.println(test + " days in the future will be friday");
		}
		else if(days==4) {
			System.out.println(test + " days in the future will be saturday");
		}
		else if(days==5) {
			System.out.println(test + " days in the future will be sunday");
		}
	}
	public void wednesday()
	{
		Scanner scan = new Scanner(System.in);
		int test;
		int days;
		int count;
		days=0;

		System.out.println("Enter the number of days you would like to advance in the future");
		test = scan.nextInt();

		for(count = 0; count<test; count++)
		{
			days++;
			if(days>=7)
			{
				days=0;
			}

		}
		if(days==5) {
			System.out.println(test + " days in the future will be monday");
		}
		else if(days==6) {
			System.out.println(test + " days in the future will be tuesday");
		}
		else if(days==0) {
			System.out.println(test + " days in the future will be wednesday");
		}
		else if(days==1) {
			System.out.println(test + " days in the future will be thursday");
		}
		else if(days==2) {
			System.out.println(test + " days in the future will be friday");
		}
		else if(days==3) {
			System.out.println(test + " days in the future will be saturday");
		}
		else if(days==4) {
			System.out.println(test + " days in the future will be sunday");
		}
	}
	public void thursday()
	{
		Scanner scan = new Scanner(System.in);
		int test;
		int days;
		int count;
		days=0;

		System.out.println("Enter the number of days you would like to advance in the future");
		test = scan.nextInt();

		for(count = 0; count<test; count++)
		{
			days++;
			if(days>=7)
			{
				days=0;
			}

		}
		if(days==4) {
			System.out.println(test + " days in the future will be monday");
		}
		else if(days==5) {
			System.out.println(test + " days in the future will be tuesday");
		}
		else if(days==6) {
			System.out.println(test + " days in the future will be wednesday");
		}
		else if(days==0) {
			System.out.println(test + " days in the future will be thursday");
		}
		else if(days==1) {
			System.out.println(test + " days in the future will be friday");
		}
		else if(days==2) {
			System.out.println(test + " days in the future will be saturday");
		}
		else if(days==3) {
			System.out.println(test + " days in the future will be sunday");
		}
	}

public void friday()
{
	Scanner scan = new Scanner(System.in);
	int test;
	int days;
	int count;
	days=0;

	System.out.println("Enter the number of days you would like to advance in the future");
	test = scan.nextInt();

	for(count = 0; count<test; count++)
	{
		days++;
		if(days>=7)
		{
			days=0;
		}

	}
	if(days==3) {
		System.out.println(test + " days in the future will be monday");
	}
	else if(days==4) {
		System.out.println(test + " days in the future will be tuesday");
	}
	else if(days==5) {
		System.out.println(test + " days in the future will be wednesday");
	}
	else if(days==6) {
		System.out.println(test + " days in the future will be thursday");
	}
	else if(days==0) {
		System.out.println(test + " days in the future will be friday");
	}
	else if(days==1) {
		System.out.println(test + " days in the future will be saturday");
	}
	else if(days==2) {
		System.out.println(test + " days in the future will be sunday");
	}
}
public void saturday()
{
	Scanner scan = new Scanner(System.in);
	int test;
	int days;
	int count;
	days=0;

	System.out.println("Enter the number of days you would like to advance in the future");
	test = scan.nextInt();

	for(count = 0; count<test; count++)
	{
		days++;
		if(days>=7)
		{
			days=0;
		}

	}
	if(days==2) {
		System.out.println(test + " days in the future will be monday");
	}
	else if(days==3) {
		System.out.println(test + " days in the future will be tuesday");
	}
	else if(days==4) {
		System.out.println(test + " days in the future will be wednesday");
	}
	else if(days==5) {
		System.out.println(test + " days in the future will be thursday");
	}
	else if(days==6) {
		System.out.println(test + " days in the future will be friday");
	}
	else if(days==0) {
		System.out.println(test + " days in the future will be saturday");
	}
	else if(days==1) {
		System.out.println(test + " days in the future will be sunday");
	}
}

}



