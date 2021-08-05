import java.util.*;
import java.lang.*;
import java.io.*;
public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		s1=sc.next();
		char[] str2 = s1.toCharArray();
		 System.out.println("Reversed string=");
        for (int i = str2.length - 1; i >= 0; i--)
            System.out.print(str2[i]);
	}

}
