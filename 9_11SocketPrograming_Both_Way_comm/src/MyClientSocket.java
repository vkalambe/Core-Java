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

public class MyClient extends JFrame implements ActionListener {
	JTextArea area;
	JTextField txt;
	JButton sendBtn;
	JButton accBtn;
	JButton connectBtn;
	boolean connetFlag = false;
	DataInputStream ClientIncomming;
	DataOutputStream ClientOutgoing;

	public MyClient() {
		setLayout(null);
		sendBtn = new JButton("send");
		txt = new JTextField(20);
		area = new JTextArea();
		accBtn = new JButton("accept");
		connectBtn = new JButton("connect");

		add(area);
		add(txt);
		add(sendBtn);
		add(connectBtn);
		add(accBtn);
		
		area.setBounds(0, 0, 400, 400);
		txt.setBounds(0, 420, 250, 30);
		sendBtn.setBounds(270, 420, 90, 30);
		connectBtn.setBounds(370, 420, 90, 30);
		accBtn.setBounds(470, 420, 90, 30);
		
		sendBtn.addActionListener(this);
		connectBtn.addActionListener(this);
		accBtn.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyClient Cobj = new MyClient();
		Cobj.setTitle("client");
		Cobj.setVisible(true);
		Cobj.setSize(600, 600);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String btnId = ((JButton) e.getSource()).getText();
		switch (btnId) {
		case "send":
			System.out.println("im in send");
			if (connetFlag == false) {
				System.out.println("connection not establish");
			} else {
				String sendTxt = txt.getText();
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
				System.out.println("am in connect");
				Socket s = new Socket(InetAddress.getByName("localhost"), 22200);
				// Socket s=new
				// Socket(InetAddress.getByName("localhost"),22000);
				ClientIncomming = new DataInputStream(s.getInputStream());
				ClientOutgoing = new DataOutputStream(s.getOutputStream());
				connetFlag = true;
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "accept":
			try {
				System.out.println("im in accept");
				area.setText(ClientIncomming.readUTF());
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
