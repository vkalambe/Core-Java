import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mycleint extends JFrame implements ActionListener 
{
	JTextField jtxt;
	JTextArea area;
	JButton btn ;
	JButton btn1;
	JButton btn2;
	boolean connectflag;
	DataInputStream clientinput;
	DataOutputStream clientoutput;
	
	public Mycleint()
	{
		jtxt=new JTextField(20);
		area=new JTextArea();
		btn=new JButton("SE");
		btn1=new JButton("CONN");
		btn2=new JButton("acc");
				
		setLayout(null);
		setTitle("Mycleint");
		add(area);
		add(jtxt);
		
		add(btn);
		add(btn1);
		add(btn2);
		area.setBounds(0, 0, 400, 400);
		jtxt.setBounds(0,420, 230, 30);
		btn.setBounds(240, 420, 80, 30);
		btn1.setBounds(300, 420, 80, 30);
		btn2.setBounds(380, 420, 80, 30);
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		Mycleint app = new Mycleint();
		app.setVisible(true);
		app.setSize(800,800);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String btnlabel= ((JButton) e.getSource()).getText();
		//System.out.println(btnlabel);
		switch (btnlabel) {
		 
		 case "SE":
			 if(connectflag==false){
				 JOptionPane.showMessageDialog(this,"connection should be there");
				 //System.out.println("connection should be there");
				/* String sendtext= jtxt.getText();
					// System.out.println(sendtext);
				 	area.setText(area.getText()+sendtext);*/
			 }
			 
			 
			 else{
				 
				 	String sendtext= jtxt.getText();
				 	try {
				 		clientoutput.writeUTF(sendtext);
						area.setText(sendtext);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					// System.out.println(sendtext);
				 	area.setText(""+sendtext);
					 
				 }break;
			 
			 
			 
		 case "CONN":
			 
			 try {
				Socket s=new Socket(InetAddress.getByName("comp27"),21000);
				
				clientinput= new DataInputStream(s.getInputStream());
				clientoutput=new DataOutputStream(s.getOutputStream());
				//System.out.println("connection started");
				connectflag=true;
				//app.cleintinput=new DataInputStream()
			   System.out.println("ip   "+s);
			 } 
			 catch (UnknownHostException e1) 
			 {
				
				e1.printStackTrace();
			} 
			 catch (IOException e1) 
			 {
				
				e1.printStackTrace();
			}
			 break;
		 case "acc":
		 
			 try {
				area.setText(clientinput.readUTF());
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		 
		 break;
			 default :
				 break;
			 
			 
		}
	}
}
				 
				 
			
			 
			
		
		 
	
			
		



