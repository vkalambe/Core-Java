import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class MyClient extends JFrame implements ActionListener{
	        JTextArea area=new JTextArea();
			JTextField txt=new JTextField(20);
			JButton sendBtn=new JButton("send");
			boolean connetFlag=false;
			JButton connectBtn=new JButton("connect");
			DataInputStream ClientIncomming;
			DataOutputStream ClientOutgoing;
			
     public MyClient() {
    	 setLayout(null);
    		add(area);
    		add(txt);
    		add(sendBtn);
    		add(connectBtn);
    		area.setBounds(0, 0, 400, 400);
    		txt.setBounds(0,420, 250, 30);
    		sendBtn.setBounds(270, 420, 90, 30);
    		connectBtn.setBounds(370, 420, 90, 30);
    		sendBtn.addActionListener(this);
    		connectBtn.addActionListener(this);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
     MyClient Cobj=new MyClient();
     Cobj.setTitle("client");
     Cobj.setVisible(true);
    Cobj.setSize(500, 500);

     }

	@Override
	public void actionPerformed(ActionEvent e) {
	
		String btnId=((JButton)e.getSource()).getText();
		switch (btnId) {
		case "send":
			if(connetFlag==false)
			{
				System.out.println("connection not establish");
			}
			else
			{
				String sendTxt=txt.getText();
				try {
					ClientOutgoing.writeUTF(sendTxt);
					area.setText(sendTxt);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			break;
        case "connect":
			try {
				Socket s=new Socket(InetAddress.getByName("localhost"),22000);
				//Socket s=new Socket(InetAddress.getByName("localhost"),22000);
				ClientIncomming=new DataInputStream(s.getInputStream());
				ClientOutgoing=new DataOutputStream(s.getOutputStream());
				connetFlag=true;
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		default:
			System.out.println("default switch case");
			break;
		}
		
		
		
     
		
	}

}
