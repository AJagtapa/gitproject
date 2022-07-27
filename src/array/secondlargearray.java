package array;

public class secondlargearray {
public static void main(String[]args) {
	int []arr= {50,30,40,10,34,43,22,};
	for(int i:arr)
		
		System.out.print(i+" ");
	int secondlarge=arr[arr.length-2];
	
	System.out.println();
	System.out.println("secondlargestno: "+secondlarge);
	
}
}
