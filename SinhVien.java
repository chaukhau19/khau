/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baitap5;

/**
 *
 * @author Admin
 */

    public class SinhVien {

    private String hoTen;
    private DiemHP hp1;
    private DiemHP hp2;

    public SinhVien(String hoTen, DiemHP hp1, DiemHP hp2) {
        this.hoTen = hoTen;
        this.hp1 = hp1;
        this.hp2 = hp2;
    }
    
    public String layHoTen(){
        return hoTen;
    }
    
    public DiemHP layHp1() {
        return hp1;
    }

    public DiemHP layHp2() {
        return hp2;
    }

    public double tinhDTB() {
        return (layHp1().tinhDiem() * layHp1().laySoTinChi() + layHp2().tinhDiem() * layHp2().laySoTinChi()) / (layHp1().laySoTinChi() + layHp2().laySoTinChi());
    }
}


