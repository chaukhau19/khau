package giaodien;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class QLHD implements ActionListener, KeyListener {
    public Frame t;
    public Label ten, thuNhap, kieuThuNhap, thanhTien, tThanhTien;
    private Button btExit;
    private Button btAdd;
    private Button btEnter;
    private TextField tTen, tThuNhap;
    private Choice tKieuThuNhap;

    public QLHD() throws FileNotFoundException {
        // Tao cac component
        taoThanhPhan();
        // Them cac components vao frame: add()
        themThanhPhan();
        // Layout cac components
        xepThanhPhan();
        // Dang ky cac components voi thanh phan xu ly su kien: THIS
        dangKy();
        new FileOutputStream("Tienthue.txt");
        t.setVisible(true);
    }

    private void taoThanhPhan() {
        t = new Frame("Ho so ho dan");
        ten = new Label("Ho Ten");
        tTen = new TextField();
        thuNhap = new Label("Thu Nhap");
        tThuNhap = new TextField();
        kieuThuNhap = new Label("Kieu Thu Nhap");
        tKieuThuNhap = new Choice();
        tKieuThuNhap.addItem("Thuong xuyen");
        tKieuThuNhap.addItem("Khong thuong xuyen");
        btExit = new Button("Exit");
        btAdd = new Button("Add");
        btEnter = new Button("Enter");
        thanhTien = new Label("Thanh tien");
        tThanhTien = new Label("");
    }

    private void themThanhPhan() {
        t.add(ten);
        t.add(tTen);
        t.add(thuNhap);
        t.add(tThuNhap);
        t.add(kieuThuNhap);
        t.add(tKieuThuNhap);
        t.add(thanhTien);
        t.add(tThanhTien);
        t.add(btAdd);
        t.add(btExit);
        t.add(btEnter);

    }

    private void xepThanhPhan() {
        ten.setBounds(40, 40, 50, 30);
        tTen.setBounds(40, 80, 100, 20);
        thuNhap.setBounds(170, 40, 60, 30);
        tThuNhap.setBounds(170, 80, 100, 20);
        kieuThuNhap.setBounds(300, 40, 100, 30);
        tKieuThuNhap.setBounds(300, 80, 100, 20);
        thanhTien.setBounds(430, 40, 60, 30);
        tThanhTien.setBounds(430, 80, 100, 20);
        btAdd.setBounds(170, 130, 100, 100);
        btAdd.setSize(40, 30);
        btExit.setBounds(220, 130, 100, 100);
        btExit.setSize(40, 30);
        btEnter.setBounds(270, 130, 100, 100);
        btEnter.setSize(40, 30);
        t.setSize(530, 260);
        t.setLayout(null);
    }

    private void dangKy() {
        btExit.addActionListener(this);
        btAdd.addActionListener(this);
        btEnter.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == btExit) {
            System.exit(0);
        }
        if (e.getSource() == btEnter) {
            int st, tt;
            String ltn;
            st = Integer.parseInt(tThuNhap.getText());
            ltn = String.valueOf(tKieuThuNhap.getSelectedItem());
            if (ltn.equals("Thuong xuyen")) {
                if (st > 5000000) {
                    tt = (st - 5000000) * 10 / 100;
                } else {
                    tt = 0;
                }
            } else {
                tt = st * 5 / 100;
            }
            tThanhTien.setText("" + tt);
        }
        if (e.getSource() == btAdd) {
            try {
                PrintWriter pw = new PrintWriter("Tienthue.txt");
                String name, ltn, tt;
                int st;
                name = String.valueOf(tTen.getText());
                st = Integer.parseInt(tThuNhap.getText());
                ltn = String.valueOf(tKieuThuNhap.getSelectedItem());
                tt = String.valueOf(tThanhTien.getText());
                pw.print(name + " ");
                pw.print(st + " ");
                pw.print(ltn + " ");
                pw.print(tt + " ");
                pw.close();
            } catch (FileNotFoundException ex) {

            }

        }

    }

    public static void main(String args[]) throws FileNotFoundException {
        new QLHD();
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
