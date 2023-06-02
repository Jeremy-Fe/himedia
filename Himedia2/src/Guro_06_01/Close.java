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

public class Close extends WindowAdapter implements ActionListener {
   private Frame f;
   private Dialog info;
   private Label msg;
   private Button ok;

   public Close() {
      f = new Frame("Parent");
      info = new Dialog(f, "Infomation", true);
      msg = new Label("This is modal Dialog", Label.CENTER);
      ok = new Button("OK");
   }

   public void windowClosing(WindowEvent e) {
      if (e.getComponent() == info) {
         info.dispose();
//         System.out.println(e.getComponent());
//         System.out.println(info);
      } else {
         System.exit(0);
      }

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      info.dispose();
   }

   public void startFrame() {
      f.setSize(300, 200);

      info.setSize(140, 90);
      info.setLocation(50, 50);
      info.setLayout(new FlowLayout());

      info.add(msg);
//      info.add(오케이);
      info.addWindowListener(this);
      f.addWindowListener(this);
      ok.addActionListener(this);

      f.setVisible(true);
      info.setVisible(true);
   }

   public static void main(String[] args) {
      DialogTest dt = new DialogTest();
//      dt.startFrame();
   }
}