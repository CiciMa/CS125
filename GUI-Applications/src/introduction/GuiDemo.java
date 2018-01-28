package introduction;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GuiDemo extends JFrame {
	
	
	public static void main(String[] args) {
		new GuiDemo();
	}
	
	public GuiDemo() { 
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open...");
		
		setJMenuBar(bar);
		bar.add(menu);
		menu.add(openItem);
		
		JButton btn = new JButton("Keeping up!");
		getContentPane().add(btn);
		
		pack();
		setVisible(true);
		
		JMenuBar bar1 = new JMenuBar();
		JMenu menu1 = new JMenu("File");
		JMenuItem openItem1 = new JMenuItem("Open...");
		
		setJMenuBar(bar1);
		bar.add(menu1);
		menu.add(openItem1);
		
		JButton btn1 = new JButton("Keeping up 1111!");
		getContentPane().add(btn1);
		
		
	}
}
