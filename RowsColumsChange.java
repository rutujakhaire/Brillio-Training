import java.util.*;
public class RowsColumsChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j;
		int arr[][]=new int[10][10];
		System.out.println("Enter number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter column values:");
		int columns=sc.nextInt();
		for(i=0;i<rows;i++)
		{
		for(j=0;j<columns;j++)
		{
			arr[i][j]=sc.nextInt();
		}
		}
		for( i=0;i<rows;i++)
		{
			System.out.println("\n");
			for(j=0;j<columns;j++)
			{
				System.out.print("\t"+arr[i][j] );
			
			}
		}
		System.out.println("\nAfter interchanging rows and columns:");
		for( i=0;i<rows;i++)
		{
			System.out.println("\n");
			for(j=0;j<columns;j++)
			{
				System.out.print("\t"+arr[j][i] );
			}
		}
		}

}
