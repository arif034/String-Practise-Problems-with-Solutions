package string;
import java.util.*;
public class PalindromicSubStringCheckUsingIndexOfCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = sc.nextInt();
		int j = sc.nextInt();
		boolean res = Palindrome(s,i,j);
		System.out.println(res);
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