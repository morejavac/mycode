package com.annotation.test;


import java.lang.annotation.*;
import java.lang.reflect.Field;


public class TestMain {
	
	  @UserAnnotation(age=20,gender="F",id=2014,name="zhangsan")//ע���ʹ�ã���ע�������public Object obj
	  public Object obj;
	  
	  public static void main(String[] args) throws Exception {
	     Field objField = TestMain.class.getField("obj");
	     UserAnnotation ua = objField.getAnnotation(UserAnnotation.class);//�õ�ע��,���˱�ǵ�����
	     
	     System.out.println(ua.age()+","+ua.gender()+","+ua.id()+","+ua.name());
	     //***��һ�������Ļ�������ObjectҪָ��һ��User�࣬��ô���Խ�ע���ֵ����
	     TestMain tm = new TestMain();
	    
	     objField.set(tm,new User(ua.age(),ua.gender(),ua.id(),ua.name())); //����ɣ����Լ�����Ϣ�͸�obj�����˸�����Ϣ������
	    
	     //-----------�����������~~��������˵˵ע����ô�ܻ��ע���Լ���ע��-------------
	     Target t = ua.annotationType().getAnnotation(Target.class);
	     ElementType[] values = t.value();
	     //~~~~~~~~~~~~~~���ˣ���һ�����������~~~~~~~~~~~~~~
	   
	     System.out.println("ע�⣺�����룬����Ϲ�룡��");
	  }

}
