import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MyServer extends JFrame implements ActionListener {
 JTextArea area;
 ServerSocket serversocket;
 Socket socket;
 JTextField txt;
 JButton btnSend;
 DataInputStream serverIncoming;
 DataOutputStream serverOutcoming;
 public MyServer() {
	 setLayout(null);
	 txt=new JTextField();
	 area=new JTextArea();
	 btnSend=new JButton("send");
	 
	 add(area);
	 add(txt);
	 add(btnSend);
	 
	 area.setBounds(0, 0, 400, 400);
	 txt.setBounds(0,420, 200,30);
	 btnSend.setBounds(220, 420, 90, 30);
	 
	 btnSend.addActionListener(this);
	 try {
		serversocket=new ServerSocket(22200);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 
 }
	public static void main(String[] args) {
     MyServer serverObj=new MyServer();
     serverObj.setTitle("server");
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
			serverObj.area.setText(serverObj.serverIncoming.readUTF());
		}
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
     try {
    	 String str=txt.getText();
    	 //System.out.println(str);
    	 area.setText(str);
		serverOutcoming.writeUTF(str);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	}

	

}
