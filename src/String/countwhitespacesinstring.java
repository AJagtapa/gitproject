package String;

public class countwhitespacesinstring {

	public static void main(String[] args)
	{
		String Str="bquh wkjb cwjo weu324 54 5%9 4gef &%98jheo 7yrwiui";
		int count=0;
		char []d=Str.toCharArray();
		for(char s:d)
		{
			if(s==' ')
			{
				count++;
			}
		}
		System.out.println("No of whhitespaces:"+count);

	}

}
