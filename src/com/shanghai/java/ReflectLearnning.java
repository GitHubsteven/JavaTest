package com.shanghai.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectLearnning {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub 
		Dog dog=new Dog();
		System.out.println(dog.getClass());
		System.out.println(dog.getClass().getName());
		
		Class<?> dogClass=dog.getClass();
		Class<?> dogClass1=Dog.class;
		Class<?> dogClass2 = Class.forName("com.shanghai.java.Dog");  
		 
	   Method[] methods1 = dogClass.getMethods();  
         System.out.println("====================通过getMethods取得方法开始====================");  
         for (Method method : methods1) {  
             System.out.println(method);   
        }  
         System.out.println("====================通过getMethods取得方法结束====================");  
           
           
         Method[] methods2 = dogClass.getDeclaredMethods();  
         System.out.println("====================通过getDeclaredMethods取得方法开始====================");  
         for (Method method : methods2) {  
             System.out.println(method);   
        }  
         System.out.println("====================通过getDeclaredMethods取得方法结束====================");  
         
	
		/**
		 * 
		 * constructor
		 */
	
		Constructor<?>[] constructors = dogClass.getConstructors();  
		  
		System.out.println("====================列出所有的构造函数结束====================");  
		for (Constructor<?> constructor : constructors) 
			{           
			 System.out.println(constructor);  
			}  
		System.out.println("====================列出所有的构造函数结束====================");  
		
		System.out.println("====================通过newInstance()来生成对象，一定在有默认构造函数====================");  
		
		Dog dog1 = (Dog) dogClass.newInstance();  
		dog1.setName("狗狗1号");  
		dog1.setAge(7);  
		System.out.println(dog1);  
		  
		System.out.println("====================通过newInstance(参数)方法一来生成对象====================");  
		Dog dog2 = (Dog)constructors[0].newInstance("狗狗2号");  
		System.out.println(dog2);  
		  
		System.out.println("====================通过newInstance(参数)方法二来生成对象====================");  
		Constructor<?> con1 = dogClass.getConstructor(new  Class[]{String.class,int.class});     //主要就是这句了  
		Dog dog3 = (Dog) con1.newInstance(new Object[]{"狗狗3号",14});  
		System.out.println(dog3); 
		
		Method[] methods = dogClass.getDeclaredMethods();  
		for (Method method : methods) {  
		    System.out.println("函数名："+method.getName() +"        函数类型："+ method.getModifiers() + "         函数返回： "+ method.getReturnType() + "        函数参数个数：" + method.getParameterCount());  
		      
		}  
		
	
	}
}
