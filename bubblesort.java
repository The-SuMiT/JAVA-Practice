package javalearning;

public class bubblesort

 	{
 	
 	
 static void  bubbleSort(int[] arr)
{
	int temp;
                    
	for (int i=0;i<arr.length;i++)
{		
	for (int j=1;j<(arr.length);j++) 
	 {
		if(arr[j-1]>arr[j])
		{
	         			temp=arr[j-1];
	                    arr[j-1]=arr[j];
	                    arr[j]=temp;
		}
		} 
}
}
 

	public static void main(String[] args)
		
	{    
		int i;
		int arr[] = {83,23,3,0,1};
		System.out.println("Before sorting");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]+ "  ");	
	}
	
	bubbleSort(arr);
	

	System.out.println("after sorting");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]+ "  ");	
	}
	
}  
 }