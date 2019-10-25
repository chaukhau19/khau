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

import java.util.Date;
import java.util.StringTokenizer;

 class SV {

    private String hoTen;
    private Date ngaySinh;
    private double dtb;

    public SV(String ht, Date ns, double dtb) {
        hoTen = ht;
        ngaySinh = ns;
        this.dtb = dtb;
    }

    public String layHoTen() {
        return hoTen;
    }

    public void ganHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date layNgaySinh() {
        return ngaySinh;
    }

    public void ganNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double layDTB() {
        return dtb;
    }

    public void ganDTB(double d) {
        this.dtb = d;
    }

    public void hienthi() {
        System.out.println("\n Em tên là:" + hoTen
                + "\n Ngày sinh:" + ngaySinh.getDate()
                + "/" + ngaySinh.getMonth() + "/" + ngaySinh.getYear()
                + "\n Điểm trung bình đạt được:" + dtb
                + "\n Họ của tôi là:" + this.layHo()
                + "\n Tên của tôi là:" + this.layTen()
                + "\n Đệm của tôi là:" + this.layDem()
                + "\n Tuổi của tôi là:" + this.layTuoi()
                + "\n Xếp loại:" + this.layXepLoai());
    }

    public String layXepLoai() {
        if (dtb < 5) {
            return "Yếu";
        } else {
            if (dtb < 7) {
                return "Trung bình";
            } else {
                if (dtb < 8) {
                    return "Khá";
                } else {
                    return "Giỏi";
                }

            }
        }
    }

    public String layHo() {
        String a = this.layHoTen();
        return a.split(" ")[0];
    }

    public String layTen() {
        StringTokenizer a = new StringTokenizer(this.layHoTen());
        return this.layHoTen().split(" ")[a.countTokens() - 1];
    }

    public String layDem() {
        StringTokenizer a = new StringTokenizer(this.layHoTen());
        int dem = a.countTokens() - 1;
        String s = " ";
        for (int i = 1; i < dem; i++) {
            s = s.concat(this.layHoTen().split(" ")[i]);
            if (i != dem - 1) {
                s = s.concat(" ");
            }
        }
        return s;
    }

    public int layTuoi() {
        Date ngayht = new Date();
        return (ngayht.getYear() + 1900) - this.ngaySinh.getYear();
    }

}


