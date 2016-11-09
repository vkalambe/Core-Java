import java.awt.HeadlessException;
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

public class Client extends JFrame implements ActionListener {
	
	JTextField txt;
	JTextArea area;
	JButton btnSend;
	JButton btnConnect;
	boolean connectFlag;
	DataInputStream clientIncoming;
	DataOutputStream clientOutgoing;
	
	public Client() {
		setLayout(null);
		txt=new JTextField();
		area=new JTextArea();
		btnSend=new JButton("Send");
		btnConnect=new JButton("Connect");
		area.setBounds(10,10,400,400);
		txt.setBounds(10, 420, 300, 50);
		btnSend.setBounds(330,420,80,50);
		btnConnect.setBounds(410,420,80,50);
		add(txt);
		add(area);
		add(btnSend);
		add(btnConnect);
		setTitle("Client");
		btnSend.addActionListener(this);
		btnConnect.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		Client s=new Client();
		s.setSize(500,500);
		s.setVisible(true);
		s.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String btnLabel=((JButton)arg0.getSource()).getText();
		switch(btnLabel)
		{
		case "Send":
			if(connectFlag==false)
			{
				JOptionPane.showMessageDialog(this,"Connection not established");
			}
			else
			{
				try {
					String sendText=txt.getText();
					area.setText(area.getText()+sendText);
					clientOutgoing.writeUTF(sendText);
					//JOptionPane.showMessageDialog(this,"Connected");
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		case "Connect":
			try {
				Socket s=new Socket(InetAddress.getByName("localhost"),22000);
				clientIncoming=new DataInputStream(s.getInputStream());
				clientOutgoing=new DataOutputStream(s.getOutputStream());
				connectFlag=true;
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}





