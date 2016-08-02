package com.java.strategyPattern;

public class CashRebate extends CashSuper{

	private double discount;
	
	public void getDiscount(String discountStr)
	{
		this.discount=Double.parseDouble(discountStr);
	}
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money*this.discount;
	}

}
