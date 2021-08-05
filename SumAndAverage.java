import java.util.*;
public class SumAndAverage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4,num5,sum,average;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		sum=(num1+num2+num3+num4+num5);
		System.out.println("Sum="+sum);
		average=(sum/5);
		System.out.println("Average="+average);
	}

}
