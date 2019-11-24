import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener,WindowListener{
    Frame f=new Frame("Máy tính");
    Button b[]=new Button[10];
    TextArea ss=new TextArea();
    TextArea sss=new TextArea();
    Button c=new Button("+");
    Button t=new Button("-");
    Button nh=new Button("x");
    Button ch=new Button(":");
    Button s=new Button("=");
    public Calculator(){
        f.add(ss); f.add(sss);
        f.addWindowListener(this);
        f.setLayout(new GridLayout(4,5));
        
        for(int i=0;i<10;i++){
            b[i]=new Button(""+i);
            b[i].addActionListener(this);
        }
        c.addActionListener(this);
        t.addActionListener(this);
        nh.addActionListener(this);
        ch.addActionListener(this);
        s.addActionListener(this);
        f.add(b[9]); f.add(b[8]); f.add(b[7]); 
        f.add(b[6]); f.add(b[5]); f.add(b[4]); 
        f.add(b[3]); f.add(b[2]); f.add(b[1]); 
        f.add(b[0]); f.add(c);  f.add(t); f.add(nh); f.add(ch); f.add(s);
        f.setSize(350, 400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b[0]) ss.setText(ss.getText()+"0");
        if(e.getSource()==b[1]) ss.setText(ss.getText()+"1");
        if(e.getSource()==b[2]) ss.setText(ss.getText()+"2");
        if(e.getSource()==b[3]) ss.setText(ss.getText()+"3");
        if(e.getSource()==b[4]) ss.setText(ss.getText()+"4");
        if(e.getSource()==b[5]) ss.setText(ss.getText()+"5");
        if(e.getSource()==b[6]) ss.setText(ss.getText()+"6");
        if(e.getSource()==b[7]) ss.setText(ss.getText()+"7");
        if(e.getSource()==b[8]) ss.setText(ss.getText()+"8");
        if(e.getSource()==b[9]) ss.setText(ss.getText()+"9");
        if(e.getSource()==c) {
            ss.setText(ss.getText()+"+");
        }
        if(e.getSource()==t) ss.setText(ss.getText()+"-");
        if(e.getSource()==nh) ss.setText(ss.getText()+"*");
        if(e.getSource()==ch) ss.setText(ss.getText()+"/");
        if(e.getSource()==s){
            String a=ss.getText();
            if((a.indexOf("+")==-1) && (a.indexOf("-")==-1) && (a.indexOf("*")==-1) && (a.indexOf("/")==-1) )
                    sss.setText(a);
        }
    }
    public static void main(String args[]){
        new Calculator();
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    
}
