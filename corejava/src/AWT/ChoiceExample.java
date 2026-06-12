package AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ChoiceExample extends Frame implements ItemListener,ActionListener{
	Choice c;
	Label l;
	Button b1,b2,b3;
	TextField tf;
	public ChoiceExample() {
		this.setVisible(true);
		this.setTitle("Java Program to add items manually");
		this.setSize(500,500);
		this.setLayout(null);
		
		Font f = new Font("consolas",Font.BOLD,28);
		
		l=new Label();
		l.setAlignment(Label.CENTER);
		l.setFont(f);
		l.setSize(400,100);
		
		c=new Choice();
		c.setFont(f);
		c.setBounds(200,100,170,30);
		
		tf=new TextField();
		tf.setFont(f);
		tf.setBounds(50,150,100,30);
		
		b1=new Button("Add");
		b1.setFont(f);
		b1.setBounds(150,150,100,30);
		
		b2=new Button("Remove");
		b2.setFont(f);
		b2.setBounds(250,150,100,30);
		
		b3=new Button("Remove All");
		b3.setFont(f);
		b3.setBounds(350,150,100,30);
		
		this.add(c);
		this.add(l);
		this.add(tf);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		c.addItemListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String b4 = e.getActionCommand();
		if(b4.equals("Add")) {
			c.add(tf.getText());
			l.setText("Item added -->" + tf.getText());	
		}
		if(b4.equals("Remove")) {
			String s = c.getSelectedItem();
			c.remove(s);
			l.setText("Selected item removed -->" + s);
		}
		if(b4.equals("Remove All")) {
			c.removeAll();
			l.setText("Removed all the items");
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		l.setText("Selected item -->" + c.getSelectedItem());
	}
	public static void main(String[] args) {
		ChoiceExample e = new ChoiceExample();
	}
}
