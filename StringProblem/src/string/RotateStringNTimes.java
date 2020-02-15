package string;
import java.util.*;
public class RotateStringNTimes 
{
	public static void main(String[] args) 
	{
		String s = null;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		int n = sc.nextInt();
		StringBuilder res = rotateNTimes(s,n);
		System.out.println(res);
	}
	public static StringBuilder rotateNTimes(String s, int n)
	{
		StringBuilder rotated = new StringBuilder(s);
		for(int i=0;i<n;++i)
		{
			rotated = rotateOnce(rotated);
			
		}
		return rotated;
	}
	public static StringBuilder rotateOnce(StringBuilder s)
	{
		int len = s.length();
		StringBuilder rotated = new StringBuilder("");
		char temp = s.charAt(len-1);
		rotated.append(temp);
		for(int i=0;i<len-1;++i)
		{
			rotated.append(s.charAt(i));
		}
		return rotated;
	}
}