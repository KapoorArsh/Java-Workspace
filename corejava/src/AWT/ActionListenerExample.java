package AWT;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionListenerExample extends Frame implements ActionListener {
	Label l;
	Button b;
	public ActionListenerExample() {
		this.setVisible(true);
		this.setTitle("ActionListener Example ");
		this.setSize(500,500);
		this.setLayout(null);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		l = new Label();
		l.setBounds(100,100,300,20);
		
		b = new Button("Click here");
		b.setBounds(200,200,60,30);
		
		this.add(b);
		this.add(l);
		
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Font f = new Font("consolas",Font.BOLD,28);
		l.setFont(f);
		l.setText("Hello world");
	}
	public static void main(String[] args) {
		ActionListenerExample a = new ActionListenerExample();
	}
}
