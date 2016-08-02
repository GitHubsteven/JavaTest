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
         System.out.println("====================ͨ��getMethodsȡ�÷�����ʼ====================");  
         for (Method method : methods1) {  
             System.out.println(method);   
        }  
         System.out.println("====================ͨ��getMethodsȡ�÷�������====================");  
           
           
         Method[] methods2 = dogClass.getDeclaredMethods();  
         System.out.println("====================ͨ��getDeclaredMethodsȡ�÷�����ʼ====================");  
         for (Method method : methods2) {  
             System.out.println(method);   
        }  
         System.out.println("====================ͨ��getDeclaredMethodsȡ�÷�������====================");  
         
	
		/**
		 * 
		 * constructor
		 */
	
		Constructor<?>[] constructors = dogClass.getConstructors();  
		  
		System.out.println("====================�г����еĹ��캯������====================");  
		for (Constructor<?> constructor : constructors) 
			{           
			 System.out.println(constructor);  
			}  
		System.out.println("====================�г����еĹ��캯������====================");  
		
		System.out.println("====================ͨ��newInstance()�����ɶ���һ������Ĭ�Ϲ��캯��====================");  
		
		Dog dog1 = (Dog) dogClass.newInstance();  
		dog1.setName("����1��");  
		dog1.setAge(7);  
		System.out.println(dog1);  
		  
		System.out.println("====================ͨ��newInstance(����)����һ�����ɶ���====================");  
		Dog dog2 = (Dog)constructors[0].newInstance("����2��");  
		System.out.println(dog2);  
		  
		System.out.println("====================ͨ��newInstance(����)�����������ɶ���====================");  
		Constructor<?> con1 = dogClass.getConstructor(new  Class[]{String.class,int.class});     //��Ҫ���������  
		Dog dog3 = (Dog) con1.newInstance(new Object[]{"����3��",14});  
		System.out.println(dog3); 
		
		Method[] methods = dogClass.getDeclaredMethods();  
		for (Method method : methods) {  
		    System.out.println("��������"+method.getName() +"        �������ͣ�"+ method.getModifiers() + "         �������أ� "+ method.getReturnType() + "        ��������������" + method.getParameterCount());  
		      
		}  
		
	
	}
}
