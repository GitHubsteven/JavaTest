package com.java.design_pattern;

public class Reduce extends Operation {


	public Double firstData;
	public Double secondData;
	
	 Reduce(Double first,Double second)
	{
		this.firstData=first;
		this.secondData=second;
	}
	@Override
	public Double getOperResult() {
		// TODO Auto-generated method stub
		return firstData-secondData;
	}
	
	
	public Double getFirstData() {
		return firstData;
	}
	public void setFirstData(Double firstData) {
		this.firstData = firstData;
	}
	public Double getSecondData() {
		return secondData;
	}
	public void setSecondData(Double secondData) {
		this.secondData = secondData;
	}

}
