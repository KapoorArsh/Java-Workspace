package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTExample extends Frame {
	AWTExample(){
		Button b = new Button("click me!!!");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setTitle("First AWT Example");
		setLayout(null);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
	public static void main(String[] args) {
		AWTExample a = new AWTExample();
	}
}
