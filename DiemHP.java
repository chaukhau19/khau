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
public class DiemHP {

    protected String tenHP;
    protected int soTinChi;

    public DiemHP(String tenHP, int soTinChi) {
        this.tenHP = tenHP;
        this.soTinChi = soTinChi;
    }

    public String layTenHP() {
        return tenHP;
    }

    public int laySoTinChi() {
        return soTinChi;
    }

    public double tinhDiem() {
        return 0;
    }
}
