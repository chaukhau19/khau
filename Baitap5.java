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
public class Baitap5 {

    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien[] ds = new SinhVien[3];
        DiemHP m1, m2;
        m1 = new HPLyThuyet("CTDL", 4, 10, 10, 10);
        m2 = new HPThucHanh("LTHDT", 3, 10, 10, 10);
        ds[0] = new SinhVien("Nguyen Van A", m1, m2);
        m1 = new HPLyThuyet("THDC", 4, 7, 8, 10);
        m2 = new HPThucHanh("GDTC", 3, 8, 9, 8);
        ds[1] = new SinhVien("Nguyen Van B", m1, m2);
        m1 = new HPLyThuyet("TinHoc", 4, 9, 5, 8);
        m2 = new HPThucHanh("Pascal", 3, 9, 8, 9);
        ds[2] = new SinhVien("Nguyen Van C", m1, m2);
        for (int i = 0; i < 3; i++) {
            System.out.println(
                    ds[i].layHoTen()
                    + "\nDiem " + ds[i].layHp1().layTenHP() + " " + ds[i].layHp1().tinhDiem()
                    + "\nDiem " + ds[i].layHp2().layTenHP() + " " + ds[i].layHp2().tinhDiem()
                    + "\nDiem TB: " + ds[i].tinhDTB()
                    + "\n");
        }

    }
}
