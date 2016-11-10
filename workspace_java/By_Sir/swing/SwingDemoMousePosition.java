package com.phoenix.demos.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemoMousePosition extends JFrame implements MouseListener, MouseMotionListener {

	JTextField position;
	public SwingDemoMousePosition() {
		
		position = new JTextField(23);
		JPanel pane= (JPanel)this.getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(position);
		pane.addMouseMotionListener(this);
		pane.addMouseListener(this);
	}
	public static void main(String[] args) {
		
		SwingDemoMousePosition app=new SwingDemoMousePosition();
		app.setSize(500, 500);
		app.setVisible(true);

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x=arg0.getX();
		position.setText(Integer.toString(x));
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		int x=arg0.getX();
		int y=arg0.getY();
		
		position.setText(""+Integer.toString(x)+" , "+Integer.toString(y));
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
