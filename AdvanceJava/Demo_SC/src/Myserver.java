import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;


	


	public class Myserver extends JFrame {
		
		JTextArea txt;
		ServerSocket ss;
		Socket s;
		DataInputStream serverinput;
		DataOutputStream serveroutput;
	
		
		
		  
		
		
		public Myserver(){
			txt=new JTextArea();
			setLayout(null);
			add(txt);
			txt.setBounds(0,0, 400, 400);
			try {
				ss=new ServerSocket(22000);
			} catch (IOException e) {
				e.printStackTrace();
			}
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		}
			
			public static void main(String[] args) throws IOException {
				
		   Myserver app1=new Myserver();
		   app1.setVisible(true);
		   app1.setSize(500,500);
		   app1.setTitle("MYSERVER");
		   app1.s=app1.ss.accept();
		   
		   app1.serverinput= new DataInputStream(app1.s.getInputStream());
		 
		   app1.serveroutput=new DataOutputStream(app1.s.getOutputStream());
		  
		   
		   while(true){
			   if(app1.serverinput.available()>0){
				   app1.txt.setText( app1.serverinput.readUTF());
				   
				  
			   }
			   
			   
			   
		   }
		   
		   	
		   
				
				
			}
			
			
			
		}

		
	