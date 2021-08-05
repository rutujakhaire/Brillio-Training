import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Year "+year+" is a leap year.");
		}
		else {
			System.out.println("Year "+year+" is not a leap year.");
		}
	}
}
