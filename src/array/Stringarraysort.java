package array;

import java.util.Arrays;

public class Stringarraysort {

	public static void main(String[] args)
	{
		String []Str= {"Priya","Neha","Suresh","Kajal","Pankaj","Aarti"};
		System.out.println("orignal array: ");
		for(String s:Str)
		{
		 System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("sorted array in ascending order");
		Arrays.sort(Str);
		for(String s:Str)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("sorted array in decending order");
		for(int i=Str.length-1;i>=0;i--)
		{
			System.out.print(Str[i]+" ");
		}
			

	}

}
