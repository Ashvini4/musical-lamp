package Basic_Prgms;

public class Extract_Int_FromString {

	public static void main(String[] args) 
	{
		Extract_Int_FromString e=new Extract_Int_FromString();
		

		e.simpleStringReverse();
		e.removeChar();
		System.out.println(findSum());
		
	}
		public void simpleStringReverse() 
		{
			String s2="Maske";//creates in String pool memory
			System.out.print("Reverse Maske: ");

			for(int i=s2.length()-1;i>=0;i--) 
			{
				System.out.print(s2.charAt(i));
			}

		}
		public void removeChar() 
		{
			String s1=new String("12As h5vi ni4");//creates in Heap memory
			String s2=s1.replaceAll("[0-9]","");
			System.out.println("\nafter removing Digits = "+s2);//+s1.replaceAll("[0-9]", ""));//removes digits
			
			//System.out.println("\n"+s1.replaceAll("[a-z||A-Z]", ""));//removes digits
			String z=s1.replaceAll("[a-z||A-Z]", "");
			System.out.println("After removing Chars: "+z);
			
			String s3=s1.replaceAll(" ","");
			System.out.println("After removing WhiteSpaces: "+s3);
		} 
		public static int findSum() 
		{
			String temp="0";// 
			String s3="12As h5vi ni4Maske Rani4Koy6na";
			int sum=0;
			for(int i=0;i<s3.length();i++)
			{
				char ch=s3.charAt(i);
				if(Character.isDigit(ch)) {
					temp+=ch;
				}
				else {
					sum +=Integer.parseInt(temp);
					temp="0";
					}
			}
			return sum+Integer.parseInt(temp);	
		}
	}
