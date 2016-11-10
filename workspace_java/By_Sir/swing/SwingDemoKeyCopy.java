package com.phoenix.demos.swing;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemoKeyCopy extends JFrame implements KeyListener {
	
	JTextField original;
	JTextField copy;

	public SwingDemoKeyCopy() {
		
		original=new JTextField(25);
		copy=new JTextField(25);
		JPanel pane = (JPanel) this.getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(original);
		pane.add(copy);
		original.addKeyListener(this);
	}
	public static void main(String[] args) {
		
		SwingDemoKeyCopy app= new SwingDemoKeyCopy();
		app.setSize(500, 500);
		app.setVisible(true);

	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		char character=arg0.getKeyChar();
		System.out.println(character);
		copy.setText(copy.getText()+character);
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}

}
