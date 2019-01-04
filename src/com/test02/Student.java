package com.test02;

import encore.playdata.platform03.Address;

public class Student {
	private int no;
	private Address address;

	public Student() {
		super();
	}

	public Student(int no, Address address) {
		super();
		this.no = no;
		this.address = address;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
		//Address ��ü�� address �� �ּҸ� �����ϰڴ�.
	public Address getAddress() {
		return address;
	}
		//Address address = new Address();
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		String str = String.format("no. %1d", this.getNo());
		return str + address;
		// return str + address.toString();
	}
}
