package java_;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args)
	{
		String x = "ARADHYA";
		String y = "HRADAYA";
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result =Arrays.equals(a, b);
		if(result == true)
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("string is not anagram");
		}
		
		
		
		
		
		
		

	}

}
