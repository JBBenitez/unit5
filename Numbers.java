import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Num, Positive,Negative, allNum;
		double Total, Avg;
		Boolean Continue;
		Continue=true;
		Positive=0;
		Negative=0;
		Total=0;
		allNum=0;
		Avg=0;
		System.out.println("Enter an integer, the input ends if it is 0:");
		do {

			Num=scan.nextInt();
			if(Num==0)
			{
				break;
			}
			allNum++;
			if(Num<0)
			{
				Negative++;
			}
			if(Num>0)
			{
				Positive++;
			}
			Total=Num+Total;
			
		  }while(Continue);
		Avg=Total/allNum;
		System.out.println("The number of positives is " + Positive);
		System.out.println("The number of negatives is " + Negative);
		System.out.println("The total is " + Total);
		System.out.println("The average is " + Avg);
		

	}

}
