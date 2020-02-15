package string;
import java.util.*;
public class rotatedPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
	}
	public static boolean palindrome(String s)
	{
		int temp =0;
		int len = s.length();
		--len;
		for(int i=0;i<len;++i)
		{
			if(s.charAt(i) == s.charAt(len-i))
			{
				temp = 0;
			}
			else
			{
				temp =1;
			}
		}
		if(temp == 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static String rotateiTimes(String s, int i)
	{
		String rotatedString = null;
		
		return rotatedString;
	}
}