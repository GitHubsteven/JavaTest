package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest1 {

	@SuppressWarnings({"unused" })
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, NoSuchFieldException {
		// TODO Auto-generated method stub

		ITworker itworker=new ITworker();
		System.out.println(itworker.getClass().getName());
		Class<?> itclass=ITworker.class;
		Class<?> itworkerClass=itworker.getClass();
		Method [] methods=itworkerClass.getMethods();
		System.out.println("itworker class public method number: "+methods.length);
		Method [] DeclaredMethods=itworkerClass.getDeclaredMethods();
		for(Method m :methods)
		{
			System.out.println(m);
		}
		
		System.out.println("itworker class All method number: "+DeclaredMethods.length);
		for(Method m :DeclaredMethods)
		{
			System.out.println(m);
		}
		
		Constructor<?> [] constroctors=itworkerClass.getDeclaredConstructors();
		System.out.println("ITworkerclass constroctors number:  "+constroctors.length);
		for(int i=0;i<constroctors.length;i++)
		{
			Constructor<?> con=constroctors[i];
			System.out.println("Constructor name "+con.getName()+"constructor params :"+con.getParameterCount()+con.getParameters().toString());
		}
		ITworker itworker1=(ITworker) constroctors[1].newInstance();
		
		itworker1.setDomain("PM");
		itworker1.setJobDomain("manager");
		itworker1.setSex("female");
		itworker1.setWorkAge(2);
		System.out.println(itworker1.toString());
		
		ITworker itworker2=(ITworker) constroctors[2].newInstance("test");
		System.out.println(itworker2.toString());
		
		Constructor<?> con_two_paras=itworkerClass.getDeclaredConstructor(new Class[]{String.class,Integer.class});
		ITworker itworker_2=(ITworker) con_two_paras.newInstance(new Object[]{"dev",2});
		System.out.println(itworker_2.toString());
		
		Class<?> itworker_setter=ITworker.class;
		Object o=itworker_setter.newInstance();
		setter(o,"JobDomain","developer",String.class);
		getter(o,"JobDomain");
		
		Field field=itworker_setter.getDeclaredField("workAge");
		field.setAccessible(true);
		field.set(o, "");
		
		
		
		
		
		
	}
		public static void getter(Object o,String att)
		{
			try {
				Method method=o.getClass().getMethod("get"+att);
				System.out.println(method.invoke(o));
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	
		public static void setter(Object o,String att,Object value,Class<?> type)
		{
			try {
				Method method=o.getClass().getDeclaredMethod("set"+att, type);
				method.invoke(o, value);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
