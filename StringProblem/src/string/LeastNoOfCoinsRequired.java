package string;
import java.util.*;
public class LeastNoOfCoinsRequired 
{
	private static final int number1 = 12;
	private static final int number2 = 3;
	private static final int number3 = 2;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		if(n%number1 == 0)
		{
			count = n/number1;
		}
		else
		{
		while(n>number1)
		{
			if(n >=number1)
			{
				count++;
				n-=number1;
			}
			else
			{
				break;
			}
		}
		if(n%number2 == 0)
		{
			count+=n/number2;
		}
		else
		{
		while(n>=number2)
		{
			if(n > number2)
			{
				count++;
				n-=number2;
			}
			else
			{
				break;
			}
		}
		}
		while(n>number3)
		{
			if(n > number3)
			{
				count++;
				n-=number3;
			}
			else
			{
				break;
			}
		}
		if(n == number3)
			count++;
		}
		System.out.println(count);
	}
}