package javatraining;

public class PrimeNumbersBetween1ToNApproach3 {
	
	void sieveOfEratosthenes(int n)
	{
		boolean prime[]=new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i]=true;
		for(int p=2;p*p<=n;p++)
		{
			if(prime[p]==true)
             {
				for(int i=p*p;i<=n;i+=p)
					prime[i]=false;
             }
		}
	
	   for(int i=2;i<=n;i++)
	   {
		   if(prime[i]==true)
			   System.out.println(i+"");
	   }
	}
	public static void main(String[] args) {
		
		int N=45;
		System.out.println("All the Prime numbers within 1 and"+N+"are");
		PrimeNumbersBetween1ToNApproach3 g=new PrimeNumbersBetween1ToNApproach3();
		g.sieveOfEratosthenes(N);
	}

}
