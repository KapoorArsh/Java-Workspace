package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChangeBackgroundColor extends Frame implements ActionListener{
	Button b1,b2,b3;
	public  ChangeBackgroundColor() {
		this.setVisible(true);
		this.setTitle("Java Program ");
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b1=new Button("RED");
		b2=new Button("GREEN");
		b3=new Button("YELLOW");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String label=e.getActionCommand();
		if(label.equals("RED")) {
			this.setBackground(Color.red);
		}
		if(label.equals("GREEN")) {
			this.setBackground(Color.green);
		}
		if(label.equals("YELLOW")) {
			this.setBackground(Color.yellow);
		}
		
	}
public static void main(String[] args) {
	ChangeBackgroundColor c=new ChangeBackgroundColor();
}
}
