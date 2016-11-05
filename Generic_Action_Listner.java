

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemoEventHandler extends JFrame {
	
	JTextField name;
	JButton submit;
	JLabel label;
	
	private static SwingDemoEventHandler instance = new SwingDemoEventHandler();
	
	private SwingDemoEventHandler()
	{
		name=new JTextField(25);
		submit=new JButton("Click Me");
		label=new JLabel("Enter your Name: ");
		label.setLabelFor(name);
		setLayout(new FlowLayout());
		add(label);
		add(name);
		add(submit);
		submit.addActionListener(new GenericActionListener());
	}

	public static SwingDemoEventHandler getInstance()
	{
		return instance;
	}
	
	public static void main(String[] args) {
		
//		SwingDemoEventHandler app = new SwingDemoEventHandler();
		SwingDemoEventHandler app= SwingDemoEventHandler.getInstance();
		app.setSize(500, 500);
		app.setVisible(true);

	}

}
