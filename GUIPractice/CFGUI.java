import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class CFGUI extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;
    private JButton b, b2;

   public CFGUI() {
    this.setTitle("My first GUI");
    this.setSize(600,400);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    pane = this.getContentPane();
    pane.setLayout(new FlowLayout());
      JButton b = new JButton("Convert to Farenheit");
      b.addActionListener(this);
      b.setActionCommand("CtoF");
      JButton b2 = new JButton("Convert to Celsius");
      b2.addActionListener(this);
      b2.setActionCommand("FtoC");
     t = new JTextField(10);
     j = new JLabel("Temperature Converter");
     pane.add(t);
     pane.add(b);
     pane.add(b2);
     pane.add(j);
  }

  public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("CtoF")){
       j.setText(Double.toString(CtoF(Double.parseDouble(j.getText()))) + " F");
   }
   if(event.equals("FtoC")){
       j.setText(Double.toString(FtoC(Double.parseDouble(j.getText()))) + " C");
   }
  }

 public static double CtoF (double a) {
	return a * 1.8 + 32;
    }
    
    public static double FtoC (double a) {
	return (a-32) / 1.8;
    }
  
}
