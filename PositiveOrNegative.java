import java.util.*;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		if(num<0)
		{
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is positive.");
		}
	}

}
