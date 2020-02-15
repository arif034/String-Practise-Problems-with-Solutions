package string;
import java.util.*;
public class LargestContinuousMultiplicationArray 
{
	public static void main(String[] args) 
	{
		int finalResult = 0;
		int TempLargestContinuousMultiplication =1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;++i)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;++i)
		{
			if(a[i] <= 0)
			{
				if(TempLargestContinuousMultiplication > finalResult)
				{
					finalResult =TempLargestContinuousMultiplication;
				}
				TempLargestContinuousMultiplication = 1;	
			}
			else
			{
				TempLargestContinuousMultiplication*=a[i];
			}
			
		}
		if(TempLargestContinuousMultiplication > finalResult)
		{
			finalResult =TempLargestContinuousMultiplication;
		}
		System.out.println(finalResult);
	}
}