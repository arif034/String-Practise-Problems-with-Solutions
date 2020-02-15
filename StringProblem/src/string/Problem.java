package string;
import java.util.*;
public class Problem implements Interface1
{

	@Override
	public int add(int a, int b)
	{
		// TODO Auto-generated method stub
		return a+b;
		//return 0;
	}

	@Override
	public int sub(int a, int b) 
	{
		// TODO Auto-generated method stub
		return a-b;
		//return 0;
	}

	@Override
	public int mul(int a, int b) 
	{
		// TODO Auto-generated method stub
		return a*b;
		//return 0;
	}

	@Override
	public int div(int a, int b)
	{
		if(b!=0)
		{
			return a/b;
		}
		else
			return Integer.MAX_VALUE;
		//return 0;
	}
	public static void main(String[] args) 
	{
		Problem p = new Problem();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(p.add(a,b));
		System.out.println(p.sub(a, b));
		System.out.println(p.mul(a, b));
		System.out.println(p.div(a, b));
	}
}