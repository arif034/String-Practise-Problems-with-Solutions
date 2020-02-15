package string;
import java.util.*;
public class RotateStringOnce 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder m = new StringBuilder(s);
		StringBuilder rotated = rotateOnce(m);
		System.out.println(rotated);
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