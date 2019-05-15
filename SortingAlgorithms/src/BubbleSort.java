
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5,9,10,24,57,90};
		int i=binarySearch(array,90);
		
System.out.println(i);
	}
	public static int binarySearch(int[] array,int value) 
	{
		int hi=array.length-1;
		int lo=0;
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(array[mid]>value)
			{
				hi=mid-1;
			}
			if(array[mid]<value)
			{
				lo=mid+1;
			}
			else
			{
				return mid;
			}
			
		}
		return -1;
	}

}
