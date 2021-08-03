import java.util.*;
import java.math.*;
public class PowerCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		double result=Math.pow(num, 2);
		System.out.println("Result="+result);
	}

}
