package com.home.prac;

import com.google.inject.Inject;
import com.home.binders.Break;

public class OfficeFlowImpl implements OfficeFlow{
	
	Ps5 ps5;
	Work work;
	
	@Inject
	public OfficeFlowImpl(Ps5 ps5 , Work work) {
		this.ps5 = ps5;
		this.work = work;
	}
	
	@Override
	public void firstHalf() {
		System.out.println("First Half");
		ps5.playGame();
		work.wrok();
	}

	@Override
	@Break
	public void secondHalf() { 
		System.out.println("Second Half");
		work.wrok();
	}
	
}
