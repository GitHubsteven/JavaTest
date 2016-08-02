package com.java.design_pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ui {

		public String first;
		public String second;
		public String oper;
		
	/*	public String[] getData()
		{
			Console con=new Console();
			return null;
			
		}*/
		
		public static void main(String[] args)
		{
			Scanner input =new Scanner(System.in);
			System.out.println("input number:");
			Double [] data=new Double[2];
			String sen=null;
			if(input.hasNext())
			{
				sen=input.next();
				System.out.println(sen);
			}
			
			String regex="[\\+|\\-|\\*|\\/]";
			Pattern pattern=Pattern.compile(regex);
			String [] dataStr=null;
			Matcher m=pattern.matcher(sen);
			if(sen.split(regex).length==2)
			{
				dataStr=sen.split(regex);
			}
			else
			{
				System.out.println("split error!");
			}
		
			String oper=null;
			while(m.find())
			{
				oper=m.group();
				System.out.println(oper);
			}
			
			
			
			
			
			
			
			
			
			
			
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("input the first data: £º");
		Double firstData=null;
		Double secondData=null;
		String oper=null;
		if(input.hasNextDouble())
		{
			firstData=input.nextDouble();
		}
		else
		{
			System.out.println("wrong number input!");
		}
		System.out.print("input operation(+/-/\\*\\/): ");
		if(input.hasNext())
		{
			oper=input.next();
		}
		else
		{
			System.out.println("wrong operation input!");
		}

		System.out.print("input the second data: ");
		if(input.hasNextDouble())
		{
			secondData=input.nextDouble();
		}
		else
		{
			System.out.println("wrong number input!");
		}

		System.out.println(firstData+oper+secondData);*/
		
		
		/*
		Scanner getData=new Scanner(System.in);
		System.out.println("input the operation sentence");
		String data=null;
		if(getData.hasNext())
		{
			data=getData.nextLine();
		}
		
		}*/
		}
		
}
