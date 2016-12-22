import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CFGUI extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t, t2;
    private JButton b, b2;

   public CFGUI() {
    this.setTitle("My first GUI");
    this.setSize(400,400);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    pane = this.getContentPane();
    pane.setLayout(new BorderLayout());
      JButton b = new JButton("Convert to Farenheit");
      b.addActionListener(this);
      b.setActionCommand("CtoF");
      JButton b2 = new JButton("Convert to Celsius");
      b2.addActionListener(this);
      b2.setActionCommand("FtoC");
     t = new JTextField(10);
     t2 = new JTextField(10);
     pane.add(t, BorderLayout.PAGE_START);
     pane.add(b, BorderLayout.LINE_START);
     pane.add(b2, BorderLayout.LINE_END);
     pane.add(t2, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("CtoF")){
       t2.setText(Double.toString(CtoF(Double.parseDouble(t.getText()))) + " F");
   }
   if(event.equals("FtoC")){
       t2.setText(Double.toString(FtoC(Double.parseDouble(t.getText()))) + " C");
   }
  }

 public static double CtoF (double a) {
	return a * 1.8 + 32;
    }
    
    public static double FtoC (double a) {
	return (a-32) / 1.8;
    }

public static void main(String[] args){
CFGUI a = new CFGUI();
a.setVisible(true);
}
  
}
