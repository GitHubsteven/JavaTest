package com.java.algorithm;

public class MergeSorted {
	
	public void operate() {
		// TODO Auto-generated method stub
		int N=100;
		int[] data=new int[N];
		for(int i=0;i<N;i++)
		{
			int ele=(int) (Math.random()*N);
			data[i]=ele;
		}
		double start=System.currentTimeMillis();
		print(data);
		mergeSort(data);
		System.out.println("Sorted data: ");
		print(data);
		double end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	public static void mergeSort(int[] data)
	{
		sort(data,0,data.length-1);
	}

	private static void sort(int[] data, int left, int right) {
		// TODO Auto-generated method stub
		if(left>=right)
		{
			return;
		}
		//find the mid number;
		int center=(left+right)/2;
		//recursion on the left array
		sort(data,left,center);
		//recursion on the right array
		sort(data,center+1,right);
		//merge, wait, when you realize the sort
		merge(data,left,center,right);
		print(data);
	}

	private static void merge(int[] data, int left, int center, int right) {
		// TODO Auto-generated method stub
		//temp array, what for?
		int[] tmpArr=new int[data.length];
		//rigth subarray index
		int mid=center+1;
		//index for the subarray left index
		int third=left;
		//temp for the first element of the left array 
		int tmp=left;
		while(left<=center&&mid<=right)
		{
			//get the min from two sorted array and put into the temp array
			if(data[left]<=data[mid])
			{
				tmpArr[third++]=data[left++];
			}
			else
			{
				tmpArr[third++]=data[mid++];
			}
		}
		//deal the left data 
		while(left<=center)
		{
			tmpArr[third++]=data[left++];
		}
		while(mid<=right)
		{
			tmpArr[third++]=data[mid++];
		}
		//copy the tmp array data into the primitive array and the data ranked left-right will 
		//be copied to the primitvie array
		while(tmp<=right)
		{
			data[tmp]=tmpArr[tmp++];
		}
	}
	
	public static void print(int[] data)
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+"\t");
		}
		System.out.println();
	}

}
