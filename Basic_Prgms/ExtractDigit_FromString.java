package Basic_Prgms;

public class ExtractDigit_FromString 
{

	public static void main(String[] args)
	{
		String str="234agshg3";
		char ch=0;
		int alpha,digit;
		alpha=digit=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
			{
				alpha++;
				//System.out.print(alpha);
			}
			else if(ch>='0' && ch<='9')
				{
					digit++;
					//System.out.print(digit);
				}
		}
		System.out.println("Alphabets are= "+alpha);
		System.out.println("Digits are : "+digit);
	}

}
