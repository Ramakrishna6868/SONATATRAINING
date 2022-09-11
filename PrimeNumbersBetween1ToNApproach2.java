package javatraining;

public class PrimeNumbersBetween1ToNApproach2 {
	
static void prime_N(int N)
{
	int x,y,flag;
	System.out.println("All the prime Numbers within 1 and "+N+"are:");
	for(x=2;x<=N;x++)
	{
		flag=1;
		for(y=2;y*y<=x;y++)
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
