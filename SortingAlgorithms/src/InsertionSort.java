
public class InsertionSort {

	public static void main(String[] args) {
		int array[]= {22,34,51,1,5,2,7,8,0,-1,-2};
		sort(array);
		printAll(array);
	}
	 static void sort(int[] array)
	{
		 int n=array.length;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j>0&&array[j]<array[j-1];j--)
			{
				swap(j,j-1,array);
			}
		}
	}
	 public static void swap(int i,int j,int[] array)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		public static  void printAll(int[] array)
		{
			for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		}

}
