/*Write a program to find sum of two matrices of 3 x3.*/
import java.util.Scanner;
class sumArray2D
{
	public static void main(String[] args)
	{
		int ar1[][] = new int[3][3];
		int ar2[][] = new int[3][3];
		int sum[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Matrix 1 Data");
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				ar1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Matrix 2 Data");
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				ar2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				sum[i][j] = ar1[i][j] + ar2[i][j];
			}
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}		
}