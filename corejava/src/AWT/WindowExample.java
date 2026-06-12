package AWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExample extends Frame implements WindowListener{
public WindowExample() {
	this.setVisible(true);
	this.setTitle("Java Program ");
	this.setSize(500, 500);
	this.setLayout(null);
	
	//add or register windowListener to the Frame
	this.addWindowListener(this);
	this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}
@Override
public void windowOpened(WindowEvent e) {
	System.out.println("Window opened");
	
}

@Override
public void windowClosing(WindowEvent e) {
	System.out.println("Window closing");
	
}

@Override
public void windowClosed(WindowEvent e) {
	System.out.println("Window closed");
	
}

@Override
public void windowIconified(WindowEvent e) {
	System.out.println("Window Iconified");
	
}

@Override
public void windowDeiconified(WindowEvent e) {
	System.out.println("Window Deiconified");
	
}

@Override
public void windowActivated(WindowEvent e) {
	System.out.println("Window Activated");
	
}

@Override
public void windowDeactivated(WindowEvent e) {
	System.out.println("Window Deactivated");
	
}
public static void main(String[] args) {
	WindowExample w=new WindowExample();
}
}