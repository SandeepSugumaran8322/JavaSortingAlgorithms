
public class MergeSort {
	public static void main(String args[])
	{
		int array[]= {29,-1,0,98,12,1};
		int low=0;
		int high=array.length-1;
		int aux[]=new int[array.length];
		mergeSort(array,aux,low,high);
		printAll(array);
	}
	public static void mergeSort(int[] array,int[] aux,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergeSort(array,aux,low,mid);
			mergeSort(array,aux, mid+1, high);
			merge(array,aux,low,mid,high);
		}
	}
	public static void merge(int[] array,int[] aux,int low,int mid,int high)
	{
		for(int i=low;i<=high;i++)
		{
			aux[i]=array[i];
		}
		int k=low;
		int j=mid+1;
		while(low<=mid&&j<=high)
		{
			if(aux[low]<aux[j])
			{
				array[k]=aux[low];
				k++;
				low++;
			}
			
			else
			{
				array[k]=aux[j];
				k++;
				j++;
			}
		}
		for(;low<=mid;low++)
		{
			array[k]=aux[low];
			k++;
		}
		for(;j<=high;j++)
		{
			array[k]=aux[j];
			k++;
		}
		}
	public static  void printAll(int[] array)
	{
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]+" ");
	}
}
