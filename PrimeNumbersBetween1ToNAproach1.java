package javaindebuggingmode;

public class PrimeNumbersBetween1ToNAproach1 {
	static void prime_N(int N)
	{
		int x,y,flag;
		System.out.println("All the Prime Numbers within 1 and "+N+"are");
		for(x=1;x<=N;x++)
		{
			if(x==1 || x==0)
				continue;
			flag=1;
			for(y=2;y<=x/2;++y)
			{
				if(x%y==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(x+"");
		}
	}
	public static void main(String[] args) {
		int N=45;
		prime_N(N);
	}

}
