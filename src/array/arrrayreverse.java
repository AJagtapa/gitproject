package array;

public class arrrayreverse {

	public static void main(String[] args) {
		int []arr = {40,50,86,47,59,62,14,89,52,32,90,50};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("array reversd");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
