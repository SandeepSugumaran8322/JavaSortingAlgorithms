
public class SelectionSort {
public static void main(String args[])
{
	int array[]= {85,2,22,19,0,2,-1,79,79};
	SelectionSort ss=new SelectionSort();
	ss.sort(array);
}
public void sort(int[] array)
{
	for(int i=0;i<array.length-1;i++)
	{
		int min=i;
		for(int j=i+1;j<array.length;j++)
		{
			if(array[min]>array[j])
			{
				min=j;
			}
		}
		swap(min,i,array);
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
	for(int i=0;i<array.length;i++)
	System.out.print(array[i]+" ");
}
	

}
