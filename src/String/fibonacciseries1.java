package String;

public class fibonacciseries1 {

	public static void main(String[] args) {
		int a=1, b=2;
		System.out.println(a+" "+b);
		int c;
		for(int i=1;i<=10;i++)
		{
			int C=a+b;
			System.out.print(" "+C);
			a=b;
			b=C;
			
		}

	}
	
		
	
	
}
