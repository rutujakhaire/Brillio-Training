import java.util.*;
public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		s1=sc.next();
		s2=s1.replace('r', 'a');
		System.out.println("The replaced string is:"+s2);
	}

}
