package string;
import java.util.*;
public class BackTrackingSample 
{
	private static int a = 0;
	private static int b = 1;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println(backTracking(m));
	}
	public static int backTracking(int n)
	{
		int memo[] = new int[n];
		for(int i=0;i<n;++i)
		{
			memo[i] = Integer.MIN_VALUE;
		}
		int fib=0;
		try
		{
		if(n == 1)
		{
			fib = 0;
		}
		else
		{
			if(n == 2)
			{
				fib = 1;
			}
			else
			{
				if(memo[n-2]>Integer.MIN_VALUE&&memo[n-3]>Integer.MIN_VALUE)
				{
					fib = memo[n-2]+memo[n-3];
				}
				else
				{
				fib = backTracking(n-1)+backTracking(n-2);
				memo[n-1] = fib;
				}
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return fib;
		}
	}
}