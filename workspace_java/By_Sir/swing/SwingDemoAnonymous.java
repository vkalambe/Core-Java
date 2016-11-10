package com.phoenix.demos.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemoAnonymous extends JFrame {

	JTextField name;
	JButton button,meToo;
	
	public SwingDemoAnonymous() {
		
		name=new JTextField(25);
		button = new JButton("Click");
		meToo = new JButton("Click me too");
		JPanel pane=(JPanel) this.getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(name);
		pane.add(button);
		pane.add(meToo);
		
//		button.addActionListener(this);
		//meToo.addActionListener(this);
		
		meToo.addActionListener(new ActionListener() {
			
			
			String nme="ASDF";
			public void actionPerformed(ActionEvent arg0) {
				name.setText("This text will be printed after changing the code to anonymous inner class");
			}
		});
		
		
		button.addActionListener(
				
				new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				name.setText("Value Changed from anonymous class");
			}
		});
	}
	
	public static void main(String[] args) {
		
		SwingDemoAnonymous app = new SwingDemoAnonymous();
		app.setSize(500, 500);
		app.setVisible(true);
		

	}
}








