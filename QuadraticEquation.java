import java.util.*;
public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,root1,root2;
		System.out.println("Enter value of a");
		a=sc.nextDouble();
		System.out.println("Enter value of b");
		b=sc.nextDouble();
		System.out.println("Enter value of c");
		c=sc.nextDouble();
		d=(b*b)-4*a*c;
		if(d>0)
		{
		root1=(-b+Math.pow(d, 0.5))/(2.0*a);
		root2=(-b-Math.pow(d, 0.5))/(2.0*a);
		System.out.println("The roots are:"+root1+root2);
		}
		else if(d==0)
		{
			root1=-b/(2.0*a);
			System.out.println("The root is:"+root1);
		}
		else {
			System.out.println("Roots are not real.");
		}
	}

}
