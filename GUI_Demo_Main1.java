package com.victory;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI_Demo_Main1 extends JFrame implements ActionListener {
	  JTextField txt=new JTextField(20);
	  JButton btn=new JButton("click");
	     private static GUI_Demo_Main1 instance=new GUI_Demo_Main1();
	private GUI_Demo_Main1()
	{

      this.setLayout(new FlowLayout());
      this.add(txt);
      this.add(btn);  
      this.setSize(500,500);
      btn.addActionListener( new GenericClass());
	};
   public static GUI_Demo_Main1 getInstance() {
	   return instance;
	
}

     
	
	public static void main(String[] args)
	{
		 GUI_Demo_Main1 app= GUI_Demo_Main1.getInstance();
		 app.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		txt.setText(" Hello ");
	}


}
