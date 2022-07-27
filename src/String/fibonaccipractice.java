package String;

public class fibonaccipractice {

	public static void main(String[] args) {
		int a=1, b=2;
		System.out.print(a+" "+b);
		int C;
		for(int i=1;i<=10;i++)
			
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}


	}

}
