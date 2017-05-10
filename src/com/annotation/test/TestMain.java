package com.annotation.test;


import java.lang.annotation.*;
import java.lang.reflect.Field;


public class TestMain {
	
	  @UserAnnotation(age=20,gender="F",id=2014,name="zhangsan")//注解的使用，标注类的属性public Object obj
	  public Object obj;
	  
	  public static void main(String[] args) throws Exception {
	     Field objField = TestMain.class.getField("obj");
	     UserAnnotation ua = objField.getAnnotation(UserAnnotation.class);//得到注解,起到了标记的作用
	     
	     System.out.println(ua.age()+","+ua.gender()+","+ua.id()+","+ua.name());
	     //***进一步操作的话，假设Object要指向一个User类，那么可以讲注解的值给他
	     TestMain tm = new TestMain();
	    
	     objField.set(tm,new User(ua.age(),ua.gender(),ua.id(),ua.name())); //不错吧，将自己的信息送给obj，起到了附加信息的作用
	    
	     //-----------请自由遐想吧~~，下面来说说注解怎么能获得注解自己的注解-------------
	     Target t = ua.annotationType().getAnnotation(Target.class);
	     ElementType[] values = t.value();
	     //~~~~~~~~~~~~~~完了，再一次自由遐想吧~~~~~~~~~~~~~~
	   
	     System.out.println("注意：是遐想，不是瞎想！！");
	  }

}
