/*
 Program to find the least INTEGERS required to write 'n' as a sum of squares...
 Example : n = a1 + a2 + a3 + a4...
 Where a1,a2,a3,a4... are perfect squares...
 and Count of a1,a2,a3,a4 in least possible...!
 
 Input  : An integer 'n'
 Output : An Integer 'count'
*/
package string;
import java.util.*;
import java.lang.*;
public class LeastSquaredSum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		count = func(n);
		System.out.println(count);
	}
	public static int NearestSquare(int n)
	{
		int res =0;
		for(int i=1;i<n/2;++i)
		{
			if(i*i > n)
			{
				res = (i-1)*(i-1);
			}
		}
		return res;
	}
	public static int func(int n)
	{
		int res = 0;
		while(n>0)
		{
			n = n - NearestSquare(n);
			++res;
		}
		return res;
	}
}