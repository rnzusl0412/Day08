package com.exam;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class MyClass02 {
	
	
	public static void main(String[] args) {
		Frame f = new Frame("�豹��");
		f.setVisible(true);
		f.setSize(300,200);
		f.setBackground(Color.gray);
		
		f.setTitle("������");
		
		System.out.println(f.getTitle());
		
		Button b_north = new Button("Ŭ���ϼ���");
		b_north.setBackground(Color.white);
		f.add(b_north,BorderLayout.NORTH);
		f.add(b_north,BorderLayout.NORTH);
		f.add(new Button("����"),BorderLayout.SOUTH);
		f.add(new Button("����"),BorderLayout.EAST);
		f.add(new Button("����"),BorderLayout.WEST);
		f.add(new Button("�߾�1"),BorderLayout.CENTER);
		System.out.println(f.getLayout());
	}
}

