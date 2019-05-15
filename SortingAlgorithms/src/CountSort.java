
public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {3,2,2,0,5,6,0,5,4};
		countSort(array);
		

	}
	public static void countSort(int[] array)
	{
		int max=array[0];
		int[] outputArray=new int[array.length];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		int countArray[]=new int[max+1];
		for(int i=0;i<array.length;i++)
		{
			countArray[array[i]]++;
		}
		
		for(int i=1;i<countArray.length;i++)
		{
			countArray[i]+=countArray[i-1];
			
		}
		
		for(int i=0;i<array.length;i++)
		{
			outputArray[countArray[array[i]]-1]=array[i];
			countArray[array[i]]--;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(outputArray[i]+" ");
		}
		
	}

}
