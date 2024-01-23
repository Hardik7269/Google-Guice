package com.home.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.home.prac.OfficeFlow;
import com.home.prac.OfficeFlowImpl;

public class GuiceMain {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new GuiceModule());
		
		OfficeFlow office = injector.getInstance(OfficeFlowImpl.class);
		
		office.firstHalf();
		office.secondHalf();
	}
}
