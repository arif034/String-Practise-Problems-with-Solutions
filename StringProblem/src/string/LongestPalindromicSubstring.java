package string;
import java.util.*;
public class LongestPalindromicSubstring 
{
	private static int TempMaxLength = 0;
	private static int finalResult =0;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		int i,j;
		for(i=0;i<len;++i)
		{
			for(j =i+1;j<len;++j)
			{
				if(Palindrome(s,i,j))
				{
					TempMaxLength = j-i+1;
					if(TempMaxLength > finalResult)
					{
						finalResult = TempMaxLength;
					}
				}
			}
		}
		System.out.println(len - finalResult);
	}
	public static boolean Palindrome(String s, int i, int j)
	{
		boolean answer;
		int tempCheck = 0;
		int itr1, itr2;
		int len = j-i+1;
		len/=2;
		--len;
		for(itr1 = i,itr2 = j; itr1 <= len && itr2 >=len; ++itr1,--itr2)
		{
			if(s.charAt(itr1) == s.charAt(itr2))
			{
				tempCheck = 0;
			}
			else
			{
				tempCheck = 1;
			}
		}
		if(tempCheck == 0)
		{
			answer = true;
		}
		else
		{
			answer = false;
		}
		return answer;
	}
}