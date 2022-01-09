package Basic_Prgms;

public class FindDuplicatesNum 
{

	public static void main(String[] args)
	{
		int ar[]=new int[] {22,11,40,11,30,22};
		System.out.println("Duplicates are");

		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
			} 
		}

	}

}
