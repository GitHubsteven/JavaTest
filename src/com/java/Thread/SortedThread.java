package com.java.Thread;

import com.java.algorithm.MergeSorted;

public class SortedThread extends Thread{

	public void run()
	{
		MergeSorted merge=new MergeSorted();
		merge.operate();
	}
}
