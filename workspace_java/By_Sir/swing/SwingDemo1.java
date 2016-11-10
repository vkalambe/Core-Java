package com.phoenix.demos.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SwingDemo1 extends JFrame implements ActionListener{
	
	JTextField userText;
	JPasswordField passText;
	JList<String> skillList;
	JButton button;

	public SwingDemo1()
	{
/*		//Code for Flow Layout
		userText = new JTextField("Default Value");
		passText = new JPasswordField(30);
		skillList = new JList<String>(new String[]{"ABC","DEF","GHI"});
		button=new JButton("Label for the button");
		setLayout(new FlowLayout());
		add(userText);
		add(passText);
		add(skillList);
		add(button);
		button.addActionListener(this);*/

/*		// Code for using Border Layout
		Container pane = this.getContentPane();
		userText = new JTextField("Default Value");
		passText = new JPasswordField(30);
		skillList = new JList<String>(new String[]{"ABC","DEF","GHI"});
		pane.setLayout(new BorderLayout());
		JTextArea area=new JTextArea(10,10);
		pane.add(userText, BorderLayout.PAGE_START);
		pane.add(passText,BorderLayout.LINE_START);
		pane.add(skillList,BorderLayout.LINE_START);
		pane.add(area,BorderLayout.PAGE_END);*/
		//pane.add(userText,BorderLayout.CENTER);
		//pane.add(passText,BorderLayout.PAGE_END);

		
		//Code for using Grid Layout
		userText = new JTextField("Default Value");
		passText = new JPasswordField(30);
		skillList = new JList<String>(new String[]{"ABC","DEF","GHI"});
		setLayout(null);
		add(userText);
		userText.setBounds(100, 100, 50, 50);
		add(passText);
		passText.setBounds(100, 200, 50, 50);
		add(skillList);
		userText.setForeground(Color.RED);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		JFrame app = new SwingDemo1();
		app.setSize(500, 500);
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
