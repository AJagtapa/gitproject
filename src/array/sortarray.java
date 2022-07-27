package array;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args)
	{
		int a[] = {10,23,40,50,32,50,34};
		System.out.println("orignal array:" );
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("array in ascending order");
		Arrays.sort(a);
	for(int i:a)
		
		{
			System.out.print(i+" ");
		}
		

	}

}
