package com.annotation.test;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(value = {FIELD })
public @interface UserAnnotation {
	public int id() default 0;
	public String name() default "";
	public int age() default 18;
	public String gender() default "M";
}
