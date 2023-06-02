package Guro_06_01;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter{
	private Frame f;
	private Dialog info;
	
	@Override
	public void windowClosing(WindowEvent e) {
//		System.exit(0);
		info.dispose();
	}

	
	public DialogTest() {
		f = new Frame("Parent");
		f.setSize(300,200);
		f.addWindowListener(this);
		
		info = new Dialog(f, "Information", true);
		info.setSize(170, 100);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		info.addWindowListener(this);
		
		
		
		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("Ok");
		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				info.dispose();
			}
		});
		
		info.add(msg);
		info.add(ok);
		
		f.setVisible(true);
		info.setVisible(true);
	}
	public static void main(String[] args) {
		DialogTest DT = new DialogTest();
	}
}
