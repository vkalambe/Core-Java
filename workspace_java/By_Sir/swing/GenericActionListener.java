package com.phoenix.demos.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenericActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		SwingDemoNormalEvents app = SwingDemoNormalEvents.getInstance();
		OneMoreUIClass app1= OneMoreUIClass.getInstance();
		
		
		
		if(arg0.getSource()==app.submit)
		{
			app.name.setText("Button Clicked");
		}
		else
			if(arg0.getSource()==app1.demo)
			{
				System.out.println("From the second UI class");
			}
		
/*		SwingDemoEventHandler app = SwingDemoEventHandler.getInstance();
		app.name.setText("Changing the value on click");
*/	}

}
