package string;
import java.util.*;
public class Fib 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
	public static int fib(int n)
	{
		int memo[] = new int[n];
		for(int i=0;i<n;++i)
		{
			memo[i] = Integer.MIN_VALUE;
		}
		int fibs =0;
		if(n == 1)
		{
			fibs =0;
		}
		else
		{
			if(n ==2 )
			{
				fibs =1;
			}
			else
			{
				if(memo[n-2]>Integer.MIN_VALUE&&memo[n-1]>Integer.MIN_VALUE)
				{
					fibs = memo[n-1]+memo[n-2];
				}
				else
				{
				fibs = fib(n-1) + fib(n-2);
				}
			}
		}
		return fibs;
	}
}