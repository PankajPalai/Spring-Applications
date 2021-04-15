package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.beans.WishMessageGenerator;

public class SetterInjectionTest 
{
    public static void main( String[] args ){
    	
  ApplicationContext act=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
  WishMessageGenerator wmg=act.getBean("wmg",WishMessageGenerator.class);
  System.out.println(wmg.generateWishMessage("Pankaj"));
  
    }
}
