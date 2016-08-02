package com.java.Thread;

public class CreateData {
	public int[] getData(String type)
	{
		switch(type)
		{
			case "file":return getDataByFile(); 
			case "input":return getDataByInput();
			default: return getDataBySystem(); 
		}
		
	}

	private int[] getDataBySystem() {
		// TODO Auto-generated method stub
		return null;
	}

	private int[] getDataByInput() {
		// TODO Auto-generated method stub
		return null;
	}

	private int[] getDataByFile() {
		// TODO Auto-generated method stub
		return null;
	};
}
