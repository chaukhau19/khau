/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baitap3;

import SinhVien;

/**
 *
 * @author Admin
 */
public class Main {
   
public static void main(String[] args) {
    SinhVien[] sv = new SinhVien[3];
    Diem[] monhoc = new Diem[6];
    monhoc[0]= new Diem("Tư tưởng",3,8,7,6);
    monhoc[1]= new Diem("gdtc",3,7,5,8);
    monhoc[2]= new Diem("Mác",3,4,1,5);
    monhoc[3]= new Diem("Toán logic",3,9,9,7);
    monhoc[4]= new Diem("Đại số tuyến tính",3,8,7,6);
    monhoc[5]= new Diem("Lập trình java",3,7,8,5);
    sv[0]= new SinhVien("châu khâu",monhoc[0],monhoc[1]);
    sv[1]= new SinhVien("hạnh trang ",monhoc[2],monhoc[3]);
    sv[2]= new SinhVien("Kim Luyện",monhoc[4],monhoc[5]);
    
    for(int i=0;i<3;i++)
        System.out.println(sv[i]);
    }

    
}


