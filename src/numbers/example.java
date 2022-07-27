package numbers;

public class example {

	public static void main(String[] args) {
		String a="swaraj";
		String b=" ";
		for(int i=a.length()-1;i>=0;i--)
		{
			 b=b+a.charAt(i);
		}
		System.out.println("it is the orignal String: "+a);
		System.out.println("it is the Reverse String: "+b);
		if(a.equalsIgnoreCase(a))
		{
			System.out.println(a+ "is palindrome");
			
		}
		else
		{
			System.out.println(a+ "is not palindrome");
		}

	}

}
