package com.exam;

public class MyClass {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void View(MyClass m) {	//��ü�� �����ؼ� ȣ���Ѵ�.
		m.setA(100);					// non_static ��ü���� & ������.
		System.out.println(m.getA());	// ���
	}

	public static void main(String[] args) {
		// new MyClass().View();
		MyClass.View(new MyClass());
	}
}
