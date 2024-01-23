package com.home.binders;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class Beraks implements MethodInterceptor{


	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Break Started");
		Object obj = invocation.proceed() ;
		System.out.println("Break Over");
		System.out.println("Break Over");
		return obj;
	}
	
}
