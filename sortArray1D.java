/*Write a program to sort the elements of one dimensional array. Read value of
array elements through command line argument.*/
class sortArray1D
{
	public static void main(String ar[])
	{
		int val[] = new int[10];
		int len = ar.length;
		int tmp;
		
		for(int i = 0; i<len; i++)
		{
			val[i] = Integer.parseInt(ar[i]);
		}
		
		for(int i =0; i<len; i++)
		{
			for(int j = i+1; j < len; j++)
			{
				if(val[i]>val[j])
				{
					tmp = val[i];
					val[i] = val[j];
					val[j] = tmp;
				}
			}			
		}
		
		for(int i = 0; i < len; i++)
		{
			System.out.println(val[i]);
		}		
	}	
	
}