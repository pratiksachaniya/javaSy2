/*Write a program to create an array to store 5 integer values. Also initialize the
array with 5 numbers and display the array Elements in reverse order.*/
class revArray1D
{
	public static void main(String args[])
	{
		int ar[] = {10,20,30,40,50};
		
		for(int i = 4; i >= 0; i--)
		{
			System.out.println(ar[i]);
		}
	}		
}