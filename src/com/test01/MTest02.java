package com.test01;

import encore.playdata.platform03.*;
import MyCalc.calc;

public class MTest02 {
	public static void main(String[] args) {
		Address a1 = new Address("±è±¹Çö", "¼ö¿ø", "001");
		System.out.println(a1);

		calc c1 = new calc(29, 15);
		System.out.println(c1);

	}
}