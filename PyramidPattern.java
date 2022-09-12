package javaindebuggingmode;

public class PyramidPattern {

	public static void main(String[] args) {
		int num=5;
		int i=0,x=0;
		for(i=1;i<=num;i++)
		{
			x=i-1;
			for(int j=i;j<=num-1;j++)
			{
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int j=0;j<=x;j++)
				System.out.print((i+j)<10?(i+j)+" ":(i+j)+" ");
			for(int j=1;j<=x;j++)
				System.out.print((i+x-j)<10?(i+x-j)+"":(i+x-j)+" ");
				System.out.println();
		}
		
	}
}
