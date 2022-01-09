package Basic_Prgms;

public class SortArray
{

	public static void main(String[] args) 
	{
		int a[]=new int [] {2,1,33,22,1,6,89,21};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.print( " " +a[i] +" " );

	}

  }
}
