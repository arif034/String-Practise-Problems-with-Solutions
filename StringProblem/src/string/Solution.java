package string;
import java.util.*;
	public class Solution 
	{
		public static void main(String[] args) 
		{
			ArrayList<Integer> A = new ArrayList<Integer>();
			A.add(1);
			A.add(2);
			A.add(3);
			System.out.println(plusOne(A));
		}
	    public static ArrayList<Integer> plusOne(ArrayList<Integer> al) 
	    {
	        int n = al.size();
	        int m = al.get(n-1);
	        al.remove(n-1);
	        al.add(m + 1);
	        return al;
	    }
	}