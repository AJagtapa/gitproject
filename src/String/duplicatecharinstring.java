package String;

public class duplicatecharinstring {
	public static void main (String[]args)
	{
		String str="aassddffgg";
		       char[]c =str.toCharArray();
		       //c={a,a,h,h,j,j,a,a,k,n,a,a}
		       
		       
		       for(int i=0;i<c.length;i++)
		       {
		    	   for(int j=i+1;j<c.length;j++)
		    	   {
		    		   if(c[i]==c[j])
		    		   {
		    			   System.out.print(c[i]);
		    			   break;
		    		   }
		    	   }
		       }
	}

}
