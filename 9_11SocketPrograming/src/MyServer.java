import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MyServer extends JFrame  {
 JTextArea area;
 ServerSocket serversocket;
 Socket socket;
 DataInputStream serverIncoming;
 DataOutputStream serverOutcoming;
 public MyServer() {
	 setLayout(null);
	 add(area);
	 area.setBounds(0, 0, 400, 400);
	 try {
		serversocket=new ServerSocket(22000);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 
 }
	public static void main(String[] args) {
     MyServer serverObj=new MyServer();
     serverObj.setVisible(true);
     serverObj.setSize(500, 500);
 try {
	serverObj.socket=serverObj.serversocket.accept();
	serverObj.serverIncoming=new DataInputStream(serverObj.socket.getInputStream());
	serverObj.serverOutcoming=new DataOutputStream(serverObj.socket.getOutputStream());
	while(true)
	{
		if(serverObj.serverIncoming.available() > 1)
		{
			serverObj.area.setText(serverObj.area.getText()+serverObj.serverIncoming);
		}
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	

}
