package com.test01;

public class MTest03 {
	private Test t1;
	private Test t2;
	private Test t3;

	public MTest03() {
		t1 = new Test();
		t2 = new Test();
		t3 = new Test();
	}
	public MTest03(Test t1, Test t2, Test t3) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}


	public Test getT3() {
		return t3;
	}
	public void setT3(Test t3) {
		this.t3 = t3;
	}
	public Test getT2() {
		return t2;
	}

	public void setT2(Test t2) {
		this.t2 = t2;
	}


	public Test getT1() {
		return t1;
	}

	public void setT1(Test t1) {
		this.t1 = t1;
	}

	public static void main(String[] args) {
		MTest03 m1 = new MTest03();
		System.out.println(m1.getT1());
		System.out.println(m1);

		Test t1 = new Test();
		t1.setA(100);
		m1.setT1(t1);
		// System.out.println(m1.getT1(),getA());

		Test r = m1.getT1();
		System.out.println(r.getA());
	}
}
