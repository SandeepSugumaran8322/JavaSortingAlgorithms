
public class BubbleSorting {
int len;
	public static void main(String[] args) {
		 int array[]= {10,20,1,3,0,-1,8,11};
		BubbleSorting bs=new BubbleSorting();
		bs.sort(array);

	}
	public void sort(int[] array)
	{
		len=array.length;
		boolean swapped;
		for(int j=0;j<len;j++)
		{
			swapped=false;
			for(int i=0;i<len-j;i++)
			{
				if(array[i]>array[i+1])
				{
					swap(i,i+1,array);
					swapped=true;
				}
			}
			if(!swapped)
				break;
		}
		printAll(array);
	}
	public void swap(int i,int j,int[] array)
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public void printAll(int[] array)
	{
		for(int i=0;i<len;i++)
		System.out.print(array[i]+" ");
	}

}
