package array;

import java.util.Arrays;

public class arrayinascendingorder {

	public static void main(String[] args) {
		int []a= {50,80,46,12,53,64,72,10};
		System.out.println("orignal array");
		for(int i:a)
		{
			System.out.print(i+" ");
		
		}
		System.out.println();
		System.out.println("sorted array in ascending array");
		Arrays.sort(a);
		for(int i:a)
		
			System.out.print(i+" ");
		System.out.println();
		System.out.println("sorted array in desending order");
		for(int i=a.length-1;i>=0;i--);
		
		{
			System.out.println(a+" ");
		}

		
		
		
		}
	
	

	}


