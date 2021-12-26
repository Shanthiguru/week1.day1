package week1.day1;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		int range = 8, firstnum = 0, secnum = 1, sum, i;
		System.out.println(firstnum);
		for( i =2; i<range; i++)
		{
			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
		}

	}

}
