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
public class Diem {
    
    private String tenHocPhan;
    private int soTinChi;
    private int chuyenCan,GiuaKy,CuoiKy;
    public int laySTC(){
    return soTinChi;
    }
    public Diem(String thp,int stc,int cc,int gk,int ck){
        tenHocPhan=thp;
        soTinChi=stc;
        chuyenCan=cc;
        GiuaKy=gk;
        CuoiKy=ck;
    }
    public double tinhDiem(){
        return 0.1*chuyenCan+0.2*GiuaKy+0.7*CuoiKy;
    }
}
    

