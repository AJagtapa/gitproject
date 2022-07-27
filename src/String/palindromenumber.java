package String;

public class palindromenumber {

	public static void main(String[] args) {
		String Str="Aniket";
		String rev=" ";
		for(int i=Str.length()-1;i>=0;i--)
		{
			rev = rev+Str.charAt(i);
		}
     
		System.out.println("orignal String:"+Str);
		System.out.println("orignal String:"+rev);
		if(Str.equalsIgnoreCase(Str))
		{
			System.out.println(Str+"  is palindrome string");
		}
		else
		{
			System.out.println(Str+"  is palindrome string");
		}
	}

}
