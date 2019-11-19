package giaoDien;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Math.sqrt;

/**
 *
 * @author SV
 */
public class PTB2 implements ActionListener, KeyListener {
    // Khai thuoc tinh la cac thanh phan
public Frame t;
public Label a,b,c,d,e;
    private Button btExit;
    private Button btRun;
    private Button btReset;
    private TextField aa,bb,cc;
    public PTB2() {
        // Tao cac component
        taoThanhPhan();
        // Them cac components vao frame: add()
        themThanhPhan();
        // Layout cac components
        xepThanhPhan();
        dangKy();
        // Dang ky cac components voi thanh phan xu ly su kien: THIS
        t.setVisible(true);
    }
   
    private void taoThanhPhan() {
    t=new Frame("Thuc thi");
    a=new Label("Nhap a"); 
    aa=new TextField();
    
    b=new Label("Nhap b");
    bb=new TextField();
    
    c=new Label("Nhap c");
    cc=new TextField();
    
    d=new Label("Chon: ");
    btExit = new Button("Exit");
    btRun= new Button("Run");
    btReset=new Button("Reset");
    e=new Label("          "
            + ""
            + ""
            + "                                                                                                                 ");
    }
   
    private void themThanhPhan() {
    t.add(a);   t.add(aa);
    t.add(b);   t.add(bb);
    t.add(c);   t.add(cc);
    t.add(e);
    t.add(d);   t.add(btRun);   t.add(btExit); t.add(btReset);
    
    }
   
    private void xepThanhPhan() {
    a.setBounds(10, 40, 100 ,30 );
    aa.setBounds(140, 40, 130 ,30 );
    b.setBounds(10, 80, 100 , 30);
    bb.setBounds(140, 80, 130 , 30);
    c.setBounds(10, 120, 100 , 30);
    cc.setBounds(140, 120, 130 , 30);
    d.setBounds(10, 240, 100 , 40);
    btRun.setBounds(130,240,100,100);
    btRun.setSize(30,30);
    btExit.setBounds(180,240,100,100);
    btExit.setSize(30,30);
    btReset.setBounds(230,240,100,100);
    btReset.setSize(40,30);
    e.setBounds(400, 40, 500, 200);
    t.setSize(700, 600);
    t.setLayout(null);
    }
   
    private void dangKy() {
          btExit.addActionListener(this);
          btRun.addActionListener(this);
          btReset.addActionListener(this);
    }
   
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    if(e.getSource()==this.btExit) {
        System.exit(0);
    }
    if(e.getSource()==this.btRun){
        int a1,b1,c1;
        float n,dt,nk,n1,n2,cdt;
        a1=Integer.parseInt(aa.getText());
        b1=Integer.parseInt(bb.getText());
        c1=Integer.parseInt(cc.getText());
        dt=b1*b1-4*a1*c1;
        cdt=(float) sqrt(dt);
        nk=-b1/(2*a1);
        n1=(-b1+cdt)/(2*a1);
        n2=(-b1-cdt)/(2*a1);
        if(dt<0) {
            this.e.setText("Phuong trinh vo nghiem!");
        } else{
            if(dt==0) {
                this.e.setText("Phuong trinh co nghiem kep"+"\n="+nk);
            } else {
                this.e.setText("Phuong trinh co 2 nghiem: "+"\nn1="+n1+"\n"+"\nn2"+n2);       
            }
            }     
        }
        if(e.getSource()==this.btReset){
            
        }
    }
   
    public static void main(String args[]) {
        new PTB2();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
