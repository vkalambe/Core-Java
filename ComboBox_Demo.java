import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;


public class ComboBox_Demo extends JFrame implements ActionListener,MouseListener{
JComboBox<String> cb;
JPopupMenu jpop;

 public ComboBox_Demo() {
    cb=new JComboBox<String>();
    cb.addItem("menu");
    cb.addItem("movies");
    cb.addItem("details");
    setLayout(new FlowLayout());
    cb.addActionListener(this);
    jpop=new JPopupMenu();
    jpop.add("jadu");
    jpop.add("jadu1");
    jpop.add("jadu2");
    add(jpop);
    this.addMouseListener(this);
    
    add(cb);
}
	public static void main(String[] args) {
   ComboBox_Demo obj=new ComboBox_Demo();
  obj.setSize(500, 500);
   obj.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd=(String) cb.getSelectedItem();
		
		if(cmd.equals("menu"))
		{
			
			JOptionPane.showMessageDialog(null, "u select menu1");
		
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
     if(e.getButton()==1)
     {
    	 jpop.show(this, 100, 100);
     }
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
