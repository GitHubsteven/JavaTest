package com.java.strategyPattern;

public class CashReturn extends CashSuper{

	private double condition;
	private double reMoney;
	
	CashReturn (String condition,String reMoney)
	{
		this.condition=Double.parseDouble(condition);
		this.reMoney=Double.parseDouble(reMoney);
	}
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		double result=money;
		if(money>condition)
		{
			result=money-reMoney;
		}
		else
		{
			System.out.println("Not meet activity condition!");
		}
		return result;
	}

}
