package String;

public class reverse_string {

	public static void main(String[] args) {
		
		String s1="aniket";
		String s="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s=s+s1.charAt(i);
		}
		System.out.println("orignal string:"+s1);
		System.out.println("reverse string:"+s);

	}

}
