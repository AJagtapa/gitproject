package java_;

public class nousingrecurrsion {
	static int i=0;
	public  static void recurrcion()
	
	{
		i= i ++;
		
		
		if (i<=100) 
		{
			//break;
			System.out.println(i);
			recurrcion();
		}
	}

	public static void main(String[] args) {
		
		recurrcion();
		

	}

}
