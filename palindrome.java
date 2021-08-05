import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,reverse=0,rem;
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num!=0) {
		rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
		}
		System.out.println("Reverse="+reverse);
		if(num==reverse)
		{
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}
