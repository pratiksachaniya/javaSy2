/*Write an interface called numbers, with a method in Process(int x, int y). Write a
class called Sum, in which the method Process finds the sum of two numbers
and returns an int value. Write another class called Average, in which the
Process method finds the average of the two numbers and returns an int.*/
interface Number
{
	public int process(int x,int y);
}

class Sum implements Number
{
	public int process(int x,int y)
	{
		return x+y;
	}
}
class Average implements Number
{
	public int process(int x,int y)
	{
		return (x+y)/2;
	}
}

class interFaceClass 
{
	public static void main(String[] args)
	{
		Sum s = new Sum();
		Average a = new Average();
		
		System.out.println("Sum Is " + s.process(10,20));
		System.out.println("Average Is " + a.process(10,20));
		
	}
}