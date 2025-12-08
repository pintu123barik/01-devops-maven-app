package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.sbeans.WishMessegeGenerator;

public class DependencyInjection {

	public static void main(String[] args) {
		
AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
WishMessegeGenerator generator=(WishMessegeGenerator) ctx.getBean("wmg");
  String msg=generator.generateWishmessege("narayan");
System.out.println(msg);

ctx.close();
	}

}
