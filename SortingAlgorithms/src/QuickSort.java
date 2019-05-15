
public class QuickSort {

	public static void main(String[] args) {
		int array[]= {10,9,8,29,0,-1};
		QuickSort qs=new QuickSort();
		int h=array.length-1;
		int l=0;
		qs.sort(array,l,h);
		qs.printAll(array);

	}
	void sort(int[] array,int low,int high)
	{
		if(high<=low)return;
		int j=partition(array,low,high);
		sort(array,low,j-1);
		sort(array,j+1,high);
	}
	int partition(int[] arr,int low,int high)
	{
		int pivot=low;
		int i=low+1;
		int j=high;
		while(i<j)
		{
			while(arr[pivot]>arr[i]&&i<=high)
			{
				i++;
			}
			while(arr[pivot]<arr[j]&&j>=low)
			{
				j--;
			}
			if(i<j)
			{
				swap(arr,i,j);
			}
	}
	swap(arr,pivot,j);
	return j;
		
	}
	 public  void swap(int[] array,int i,int j)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		public   void printAll(int[] array)
		{
			for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		}

}
