package Guro_06_01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest00 implements WindowListener{
	private Frame frame;
    private Button button1, button2, button3;
 
    public FlowTest00() {
        frame = new Frame("adapter example");
        button1 = new Button("Ok");
        button2 = new Button("Open");
        button3 = new Button("Close");
    }
 
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) {    }
    public void windowActivated(WindowEvent e) {    }
    public void windowDeactivated(WindowEvent e) {    }
    public void windowDeiconified(WindowEvent e) {    }
    public void windowIconified(WindowEvent e) {    }
    public void windowOpened(WindowEvent e) {    }
 
    public void startFrame() {
        frame.addWindowListener(this);
        frame.setLayout(new FlowLayout());
 
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        FlowTest00 g = new FlowTest00();
        g.startFrame();
    }

}
