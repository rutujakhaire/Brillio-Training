import java.util.*;
public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[25];
		int n,i,largest,temp=0;
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[j];
					a[j]=temp;
					temp=a[i];
				}
			}
		}
	}

}
