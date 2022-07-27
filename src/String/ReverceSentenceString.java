package String;

public class ReverceSentenceString {

	public static void main(String[] args)
	{
		String str="hello aniket how are u ?";
		String a[]=str.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
			

	}

}
