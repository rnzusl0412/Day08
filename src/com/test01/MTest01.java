package com.test01;

//toString() : java.lang.Object = 객체의 주소를 동적으로 할당된 16진수 값을 리턴한다. 
public class MTest01 {

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
		public String toString() {
		return "나의 주소는 "+super.toString();
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
		System.out.println("두개의 객체의 주소가 같은지 다른지 비교 : "+m1.equals(m2));
							// 주소를 비교합니다. 
		
		
		
		/*	System.out.println(new MTest01());
		System.out.println(new MTest01().toString());
		
		MTest01 m1 = new MTest01();
		System.out.println(m1);
		System.out.println(m1.toString());
		*/
		
	}

}
