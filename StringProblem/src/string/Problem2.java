package string;
import java.util.*;
public class Problem2 extends Problem3 implements Interface1
{
	public static void main(String[] args) 
	{
		Problem2 p2 = new Problem2();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(p2.add(a, b));
		System.out.println(p2.sub(a, b));
		System.out.println(p2.mul(a, b));
		System.out.println(p2.div(a, b));
	}
	@Override
	public int add(int a, int b) 
	{
		return a+b + a+b;
		// TODO Auto-generated method stub
		// return 0;
	}

	@Override
	public int sub(int a, int b) 
	{
		return a-b + a-b;
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public int mul(int a, int b) 
	{
		return a*b + a*b;
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public int div(int a, int b) 
	{
		return a/b + a/b;
		// TODO Auto-generated method stub
		//return 0;
	}
}
