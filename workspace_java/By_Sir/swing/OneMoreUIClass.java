package com.phoenix.demos.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OneMoreUIClass extends JFrame {
	
	JButton demo;
	
	private static OneMoreUIClass instance=new OneMoreUIClass();

	private OneMoreUIClass()
	{
		demo=new JButton("Click");
		add(demo);
		demo.addActionListener(new GenericActionListener());
	}
	
	public static OneMoreUIClass getInstance()
	{
		return instance;
	}
	
	public static void main(String[] args) {
		
		OneMoreUIClass app=getInstance();
		app.setSize(400, 400);
		app.setVisible(true);

	}

}
