/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baitap3;

/**
 *
 * @author Admin
 */
public class SinhVien {
     private String hoTen;
    private double dm1,dm2;
    public SinhVien(String ten,Diem x,Diem y){
       hoTen=ten;
       dm1=x.tinhDiem();
       dm2=y.tinhDiem();
    }
    public double tinhDTB(){
        return (dm1+dm2)/2;
    }
    public String toString(){
        return "Họ tên Sinh Viên: "+hoTen+"\nĐiểm trung bình: "+tinhDTB();
    }


}
