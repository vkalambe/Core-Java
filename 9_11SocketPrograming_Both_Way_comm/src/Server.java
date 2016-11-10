import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Server extends JFrame {

	JTextArea area;
	ServerSocket server;
	Socket connect;
	DataInputStream serverIncoming;
	DataOutputStream serverOutgoing;
	
	public Server() throws IOException {
		area=new JTextArea();
		setLayout(null);
		area.setBounds(10,10,400,400);
		add(area);
		server=new ServerSocket(22000);
	}
	
	public static void main(String[] args) {
		
		try {
			Server s=new Server();
			s.setSize(500,500);
			s.setResizable(false);
			s.setVisible(true);
			s.connect=s.server.accept();
			s.serverIncoming=new DataInputStream(s.connect.getInputStream());
			s.serverOutgoing=new DataOutputStream(s.connect.getOutputStream());
			while(true)
			{
				if(s.serverIncoming.available()>0)
				{
					s.area.setText(s.area.getText()+s.serverIncoming.readUTF());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
