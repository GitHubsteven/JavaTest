package com.java.Thread;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SortedThread sortThread=new SortedThread();
			sortThread.start();
			for(int i=0;i<100;i++)
			{
				AnotherThread outThread=new AnotherThread();
				Thread oThread=new Thread(outThread);
				
				oThread.start();
			}
	}

}
