/*Write program to create an array of company name and another array of price
quoted by the company. Fetch the company name who has quoted the lowest
amount.*/
class strArray
{
	public static void main(String[] args)
	{
		String strAr[] = {"A Company","B Company","C Company","D Company"};
		int ar[] = {1000,2000,350,400};
		int min = 0;
		for(int i = 0; i < 4; i++)
		{
			if(ar[i] < ar[min])
			{
				min = i;
			}			
		}
		
		System.out.println("Company Name: " + strAr[min]);
		System.out.println("Lowest amount: " + ar[min]);		
	}
}