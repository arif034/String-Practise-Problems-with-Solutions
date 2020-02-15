package string;
import java.util.*;
public class PalindromicString 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	if(palindrome(s))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
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
}