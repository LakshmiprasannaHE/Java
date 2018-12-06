import java.awt.*;
import java.awt.event.*;
import java.applet.*;



public class week6q1 extends Applet implements
ActionListener,MouseListener,KeyListener {
    public void init(){
        Button Button1 =new Button("ok");
        add(Button1);
        Button1.addActionListener(this);
        addMouseListener(this);
        Button1.addKeyListener(this);
    }
    public void paint(Graphics g){
        g.drawString("hello",10,20);
    }
    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub
    showStatus("keyPressed");    
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        showStatus("keyReleased");    
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
        showStatus("keyTyped");    
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        showStatus("mouseClicked");    
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        showStatus("mouseEntered");    
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        showStatus("mouseExited");    
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
        showStatus(" mousePressed");    
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        showStatus("mouseReleased");    
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        showStatus("actionPerformed");    
    }
    

}
