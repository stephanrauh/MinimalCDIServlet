package com.byteslounge.cdi.bean;

public class ServiceBean implements Service {
	
	@Override
	public int doWork(int a, int b) {
		return a + b;
	}

}
