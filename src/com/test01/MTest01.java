package com.test01;

//toString() : java.lang.Object = ��ü�� �ּҸ� �������� �Ҵ�� 16���� ���� �����Ѵ�. 
public class MTest01 {

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
		public String toString() {
		return "���� �ּҴ� "+super.toString();
	}
	public static void main(String[] args) {
		MTest01 m1 = new MTest01();
		System.out.println(m1);
		System.out.println(m1.hashCode());
		System.out.println(m1.getClass().getSimpleName());
		
		MTest01 m2 = new MTest01();
		
		System.out.println(m2);
		System.out.println(m2.hashCode());
		System.out.println(m2.getClass().getSimpleName());
		System.out.println("�ΰ��� ��ü�� �ּҰ� ������ �ٸ��� �� : "+m1.equals(m2));
							// �ּҸ� ���մϴ�. 
		
		
		
		/*	System.out.println(new MTest01());
		System.out.println(new MTest01().toString());
		
		MTest01 m1 = new MTest01();
		System.out.println(m1);
		System.out.println(m1.toString());
		*/
		
	}

}
