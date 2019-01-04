package com.exam;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class MyClass02 {
	
	
	public static void main(String[] args) {
		Frame f = new Frame("김국현");
		f.setVisible(true);
		f.setSize(300,200);
		f.setBackground(Color.gray);
		
		f.setTitle("송진영");
		
		System.out.println(f.getTitle());
		
		Button b_north = new Button("클릭하세요");
		b_north.setBackground(Color.white);
		f.add(b_north,BorderLayout.NORTH);
		f.add(b_north,BorderLayout.NORTH);
		f.add(new Button("남쪽"),BorderLayout.SOUTH);
		f.add(new Button("동쪽"),BorderLayout.EAST);
		f.add(new Button("서쪽"),BorderLayout.WEST);
		f.add(new Button("중앙1"),BorderLayout.CENTER);
		System.out.println(f.getLayout());
	}
}

