import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JTextFieldDemo" width=300 height=50>
</applet>
*/
public class q2 extends JApplet{
JTextField jtf1,jtf2,jtf3,jtf4;
JButton jb;
JLabel jlab[]=new JLabel[8];
int p,n,p_fee;
double emi,pr_fee,interest,amount,rate,r;
public void init() {
try {
SwingUtilities.invokeAndWait(
new Runnable() {
public void run() {
makeGUI();
}
}
);
}
catch (Exception exc) {
System.out.println("Cannot create");
}
}
private void makeGUI() {
// Change to flow layout.
setLayout(new FlowLayout());
// Add text field to content pane.
jtf1 = new JTextField(15);
jtf2 = new JTextField(15);
jtf3 = new JTextField(15);
jtf4 = new JTextField(15);

jb = new JButton("calculate");
jlab[0]=new JLabel("Loan amount : ");
jlab[1]=new JLabel("Interest% : ");
jlab[2]=new JLabel("No. Of Months : ");
jlab[3]=new JLabel("Processing Fee% : ");
add(jlab[0]);
add(jtf1);
add(jlab[1]);
add(jtf2);
add(jlab[2]);
add(jtf3);
add(jlab[3]);
add(jtf4);
add(jb);

jtf1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
// Show text when user presses ENTER.
        showStatus(jtf1.getText());
p=Integer.parseInt(jtf1.getText());
}
});
jtf2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
// Show text when user presses ENTER.
        showStatus(jtf2.getText());
        r=Double.parseDouble(jtf2.getText());
        rate=r/(12*100);
}
});
jtf3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
// Show text when user presses ENTER.
        showStatus(jtf3.getText());
        n=Integer.parseInt(jtf3.getText());
}
});
jtf4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
// Show text when user presses ENTER.
        showStatus(jtf4.getText());
        p_fee=Integer.parseInt(jtf4.getText());
}
});
jb.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
// Show text when user presses ENTER.
        emi=(p*rate*Math. pow(1+rate,n))/(Math. pow(1+rate,n)-1);
        pr_fee=(p*p_fee)/100;
        amount=emi*n;
        interest=amount-p;
        jlab[4].setText("Emi : "+ emi);
        jlab[5].setText("Processing Fee : "+pr_fee);
        jlab[6].setText("Total Interest : "+interest);
        jlab[7].setText("Total Amount : "+amount);
        
       
}
});
jlab[4] = new JLabel();
jlab[5] = new JLabel();
jlab[6] = new JLabel();
jlab[7] = new JLabel();
//Add the label to the content pane.
add(jlab[4]);
add(jlab[5]);
add(jlab[6]);
add(jlab[7]);

}
}
