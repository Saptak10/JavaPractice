package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

// Marker Annotation
// Single Value Annotation
// Multi Value Annotation
// Meta Annotation

@Inherited
@Documented
@Target(ElementType.TYPE)  //CONSTRUCTOR, METHOD, FIELD
@Retention(RetentionPolicy.RUNTIME) //SOURCE, CLASS
@interface SmartPhone{
	String os() default "Android";
	int version() default 1;
}

@SmartPhone(os = "ios", version = 5)
class Iphone{
	String model;
	int size;
	
	public Iphone(String model, int size) {
//		super();
		this.model = model;
		this.size = size;
	}
}

public class prog1 {
	Iphone obj = new Iphone("Fire", 5);
	
	Class c = obj.getClass();
	Annotation an = c.getAnnotation(SmartPhone.class);
	SmartPhone s = (SmartPhone)an;
	System.out.println(s.os());
}
