package com.java.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//������Ŀ�ӿ�
interface Subject {
    public String say(String name, int age);
}
 
// ������ʵ��Ŀ
class RealSubject implements Subject {
    @Override
    public String say(String name, int age) {
        return name + "  " + age;
    }
}
 
class MyInvocationHandler implements InvocationHandler {
    private Object obj = null;
 
    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
                .getClass().getInterfaces(), this);
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object temp = method.invoke(this.obj, args);
        return temp;
    }
}
 
public class Reflection_proxy {

	    public static void main(String[] args) {
	        MyInvocationHandler demo = new MyInvocationHandler();
	        Subject sub = (Subject) demo.bind(new RealSubject());
	        String info = sub.say("Rollen", 20);
	        System.out.println(info);
	    }
}
