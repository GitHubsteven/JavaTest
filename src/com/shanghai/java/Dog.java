package com.shanghai.java;

public class Dog implements Animal {

	 private String name;  
     
	    private int age;  
	      
	    public Dog() {  
	        // TODO �Զ����ɵĹ��캯�����  
	    }  
	      
	    public Dog(String name,int age) {  
	        this.name = name;  
	        this.age = age;  
	    }     
	      
	    public Dog(String name) {  
	        this.name = name;  
	        this.age = 10;  
	    }  
	      
	    private void sleep(int x) {  
	        System.out.println(name + "˯��" + x + "����");  
	    }  
	      
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    public int getAge() {  
	        return age;  
	    }  
	  
	    public void setAge(int age) {  
	        this.age = age;  
	    }  
	  
	    @Override  
	    public String eat(String obj) {  
	        System.out.println(name + "��"+ obj);  
	        return null;  
	    }  
	  
	    @Override  
	    public int run(int obj) {  
	        System.out.println("�ܣ��ٶȣ�"+ obj);  
	        return 0;  
	    }  
	      
	    @Override  
	    public String toString() {  
	        return "������" + name + "  ������ͣ�" + age;  
	    }  
	      
	    private static void play() {  
	        System.out.println("�����Լ��氡��");  
	    }  
}
