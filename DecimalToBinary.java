import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args)
	{
		int decimal, quotient,i=1,j;
		int binary[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal  number");
		decimal=sc.nextInt();
		quotient=decimal;
		while(quotient!=0)
		{
			binary[i++]=quotient%2;
			quotient=quotient/2;
		}
		System.out.println("The binary conversion of number is:");
		for(j=i-1;j>0;j--)
		{
			System.out.print(binary[j]+"\t");
		}
	}
}
