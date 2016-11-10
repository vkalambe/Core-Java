package com.phoenix.demos.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstScreen extends JFrame implements ActionListener {
	
	JButton bDisplay;
	JButton bCancel;
	JTextField txtDisplay;
	
	public FirstScreen() {
		
		bDisplay=new JButton("Click Me");
		txtDisplay=new JTextField("Default Value");
		bCancel=new JButton("Me Too");
		add(txtDisplay);
		add(bDisplay);
		add(bCancel);
		txtDisplay.setText("New Value Set");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bDisplay.addActionListener(this);
		bCancel.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		FirstScreen app=new FirstScreen();
		app.setSize(200, 200);
		ActionListener listen=new FirstScreen();
		app.bDisplay.addActionListener(listen);
		app.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//String text=txtDisplay.getText();
		JButton temp=(JButton)arg0.getSource();
		String butName=temp.getText();
		switch(butName)
		{
		case "Click Me": 
			break;
		case "Me Too":
			break;
		}
		txtDisplay.setText("Button has been clicked");
		//System.out.println(text);
		
	}

}










