package Basic_Prgms;

public class NotDivisibleBy3n4 {

	public static void main(String[] args)
	{
		int n=100;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.print(i+" ");
			}
			else 
			{
			System.out.println(i+" is not divisible by 3 and 5");
			}
			

		}
	}

}
