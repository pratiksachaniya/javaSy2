/*Create a class called NumberData that accept any array of the five numbers.
Create a sub class called Numplay which provides methods for followings:
1. Display numbers entered.
2. Sum of the number.
3. Average of the numbers.
4. Maximum of the numbers.
5. Minimum of the numbers.
Create a class that provides menu for above methods. Give choice from the
User.*/
import java.util.Scanner;
class NumberData
{
	int ar[] = new int[5];

	NumberData(int[] arNo)
	{
		for(int i = 0; i < 5; i++)
		{
			ar[i] = arNo[i];
		}
	}
}
class Numplay extends NumberData
{
	public void display()
	{
		for(int i=0; i < 5; i++)
		{
			System.out.println(ar[i]);
		}
	}
	
	public void sum()
	{
		int sm = 0;
		for(int i = 0; i < 5; i++)
		{
			sm += ar[i];
		}
		System.out.println("Sum Is " + sm);
	}
	public void avg()
	{
		int sm = 0;
		for(int i = 0; i < 5; i++)
		{
			sm += ar[i];
		}
		System.out.println("Average Is " + ((float)sm/5));
	}
	public void max()
	{
		int max = 0;
		for(int i = 0; i < 5; i++)
		{
			if(max < ar[i])
			{
				max = ar[i];
			}
		}
		System.out.println("Max Is " + max);
	}
	public void min()
	{
		int min = ar[0];
		for(int i = 0; i < 5; i++)
		{
			if(min > ar[i])
			{
				min = ar[i];
			}
		}
		System.out.println("Min Is " + min);
		
	}
	
	Numplay(int[] arr)
	{
		super(arr);
	}
}

class mainNumber
{
	public static void main(String[] args)
	{
		int ch;
		int ar[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Number");
		for(int i = 0; i < 5; i++)
		{
			ar[i] = sc.nextInt();
		}
		Numplay np = new Numplay(ar);
		System.out.println("1. Display numbers entered.");
		System.out.println("2. Sum of the number.");
		System.out.println("3. Average of the numbers.");
		System.out.println("4. Maximum of the numbers.");
		System.out.println("5. Minimum of the numbers.");
		System.out.println("Enter Your Choice");
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				np.display();
				break;
			case 2:
				np.sum();
				break;
			case 3:
				np.avg();
				break;
			case 4:
				np.max();
				break;
			case 5:
				np.min();
				break;
			default:
				System.out.println("Invald Choice");
		}
		
		
	}
}