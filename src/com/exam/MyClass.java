package com.exam;

public class MyClass {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void View(MyClass m) {	//객체를 생성해서 호출한다.
		m.setA(100);					// non_static 객체생성 & 값대입.
		System.out.println(m.getA());	// 출력
	}

	public static void main(String[] args) {
		// new MyClass().View();
		MyClass.View(new MyClass());
	}
}
