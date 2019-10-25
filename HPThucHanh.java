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
public class HPThucHanh extends DiemHP {

    private double db1;
    private double db2;
    private double db3;

    public HPThucHanh(String tHP, int sTC, double db1, double db2, double db3) {
        super(tHP, sTC);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }

    public String layTenHP() {
        return tenHP;
    }

    public int laySoTinChi() {
        return soTinChi;
    }

    public double tinhDiem() {
        return (db1 + db2 + db3) / 3;
    }
}
