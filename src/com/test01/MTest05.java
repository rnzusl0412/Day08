package com.test01;
import com.test02.Student;
import encore.playdata.platform03.Address;

public class MTest05 {
	public static void main(String[] args) {
		Student s1 = new Student(1, new Address("�豹��", "����", "010"));
		Student s2 = new Student(2, new Address("���·�", "�Ⱦ�", "4360"));
		Student s3 = new Student(3, new Address("������", "����", "4941"));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("===============================================");
		//1�� �л��� �ּҸ� ����� ���� �� ��ü ����� �غ���.
		
		System.out.println("no :"+s1.getNo());
		System.out.println("name :"+s1.getAddress().getName());
		System.out.println("addr :"+s1.getAddress().getAddr());
		System.out.println("phone :"+s1.getAddress().getPhone());
		
		System.out.println(s1.getAddress());
//		Address ar = s1.getAddress();
//		System.out.println(ar);	//ar.toString();	��� ����
		s1.getAddress().setAddr("����");
		System.out.println(s1);
		s1.getAddress().setPhone("011");
		System.out.println(s1);
	}
}
