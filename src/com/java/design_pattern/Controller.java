package com.java.design_pattern;

public class Controller {

	@SuppressWarnings("unused")
	public Operation getOperation(String opre, Double first,Double second)
	{
		Operation oper=new Operation();
		switch(opre)
		{
		case "+":
		{
			oper=new Add(first,second);
		}
		break;
		case"-":
		{
			oper=new Reduce(first,second);
		}
		break;
		case"*":
		{
			oper=new Mul(first,second);
		}
		break;
		case"/":
		{
			oper=new Divided(first,second);
		}
		defualt:
		{
			System.out.println("opreation choice error!");
		}
		break;
		}
		return oper;
	}
}
