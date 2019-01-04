package com.test01;

public class MTest04 {
	private Test t1;

	public MTest04() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MTest04(Test t1) {
		super();
		this.t1 = t1;
	}

	public Test getT1() {
		return t1;
	}

	public void setT1(Test t1) {
		this.t1 = t1;
	}
	public String toString() {
		String str = String.format("t1");
		return str;
	}
}
