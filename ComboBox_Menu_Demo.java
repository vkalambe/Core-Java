import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;


public class ComboBox_Menu_Demo extends JFrame implements ActionListener{
JComboBox<String> cb;
JPopupMenu jpop;
JMenuBar menuBar;
JMenu file,edit,extras;
JMenuItem New,open,close,save;
JMenuItem cut,copy,paste,delete;
JMenuItem color;
JFileChooser FileChoose;
 public ComboBox_Menu_Demo() {
	    menuBar=new JMenuBar();
	    add(menuBar);
	    file=new JMenu("file");
	    edit=new JMenu("edit");
	    extras=new JMenu("extras");
	    menuBar.add(file);
	    menuBar.add(edit);
	    menuBar.add(extras);
	    menuBar.setBounds(0,0,120, 20);
	    setLayout(null);
	    New=new JMenuItem("New");
	    open=new JMenuItem("open");
	    close=new JMenuItem("close");
	    save=new JMenuItem("save");
	    file.add(New);
	    file.add(open);
	    file.add(close);
	    file.add(save);
	    open.addActionListener(this);
	    cut=new JMenuItem("cut");
	    copy=new JMenuItem("copy");
	    paste=new JMenuItem("paste");
	    delete=new JMenuItem("delete");
	    edit.add(cut);
	    edit.add(copy);
	    edit.add(paste);
	    edit.add(delete);
	    extras.add(color);
	    color.addActionListener(this);
	    
/*	cb=new JComboBox<String>();
    cb.addItem("menu");
    cb.addItem("movies");
    cb.addItem("details");
    add(cb);
    cb.addActionListener(this);*/
    
/*    jpop=new JPopupMenu();
    jpop.add("jadu");
    jpop.add("jadu1");
    jpop.add("jadu2");
    add(jpop);
    this.addMouseListener(this);*/
    


}
	public static void main(String[] args) {
   ComboBox_Menu_Demo obj=new ComboBox_Menu_Demo();
     obj.setSize(500, 500);
   obj.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	   String cmd=e.getActionCommand();
		
		if(cmd.equals("open"))
		{
			
			FileChoose=new JFileChooser();
			FileChoose.setCurrentDirectory(new File("E:/"));
			FileChoose.showDialog(null,"open");
			//FileChoose.showOpenDialog(open);
		}else
		{
			if(cmd.equals("color"))
			{
				JColorChooser col=new JColorChooser();
				Color c=Color.red;
				Color c1=JColorChooser.showDialog(this,"red", c);
			}
		}
	}
/*	@Override
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
		
	}*/

}
