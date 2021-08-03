import java.util.*;
public class stringcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		s1=sc.next();
		s2=sc.next();
		if(s1.equals(s2))
		{
			System.out.println("Strings are same.");
		}
		else {
			System.out.println("Strings are different.");
		}
	}

}
