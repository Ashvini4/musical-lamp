package Basic_Prgms;

public class ArrayMinMaxValue {

	public static void main(String[] args) {

		int a[]= {8,2,2,1,1,8,9,5,67,12,0,1};
		int len=a.length;
//Sorting of an array elements
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len-1;j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}//System.out.print(" "+a[j]);
			}System.out.print(" "+a[i]);
		}
		//Max Element
		int max=0,min=0;
		for(int i=0;i<len-1;i++) {
				if(a[i]>max)
					max=a[i];
				else if(a[i]<min)
					min=a[i];
				}
			System.out.println("\nMax: "+max);
			System.out.println("Min: "+min);
		//Duplicates 
			
	}
		
}
