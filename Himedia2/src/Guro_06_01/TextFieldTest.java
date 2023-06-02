package Guro_06_01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JOptionPane;

public class TextFieldTest implements ActionListener {
	private Frame f, f2;
	private TextField id, pwd, log;
	private Button btn;
	private final String STRING_ID = "woofe";
	private final String STRING_PWD = "20230601";

	public TextFieldTest() {
		f = new Frame("Login");

		f.setSize(400, 120);
		f.setLayout(new FlowLayout());
		
		f2 = new Frame("Main");
		f2.setSize(500, 500);

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');

		btn = new Button("Login");
		log = new TextField(37);

		btn.addActionListener(this);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.add(log);
		f.setVisible(true);
		f2.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (STRING_ID.equals(id.getText()) && STRING_PWD.equals(pwd.getText())) {
			System.out.println("login!");
			log.setText("로그인 성공");
			f2.setVisible(true);
			f2.dispose();
		} else {
			System.out.println("fail!");
			log.setText("로그인 실패");
		}
	}

	public static void main(String[] args) {
		TextFieldTest t = new TextFieldTest();

	}

}

