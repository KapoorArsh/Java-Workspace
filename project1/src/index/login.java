package index;
import java.awt.Font;

import javax.swing.*;
public class login {
	login(){
		JFrame f = new JFrame();
		JLabel l = new JLabel("Welcome to RPS!!!");
		l.setBounds(300,40,500,100);
		f.setLayout(null);
		f.add(l);
		f.setVisible(true);
		f.setSize(1000,1000);
		f.setTitle("My Frame");
		Font t1 = new Font("consolas",Font.ITALIC, 40);
		l.setFont(t1);
		JLabel a = new JLabel("Enter your name: ");
		f.add(a);
		a.setFont(t1);
		a.setBounds(300,150,500,100);
		JTextArea j = new JTextArea();
		f.add(j);
		j.setBounds(300,300,400,100);
		j.setFont(t1);
		JButton h = new JButton("Lets go!");
		f.add(h);
		h.setBounds(450,500,100,100);
	}
	public static void main(String[] args) {
		new login();
	}
}
