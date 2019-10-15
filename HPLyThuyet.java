
package diemhp;

 class HPLyThuyet extends DiemHP {
    private final int chuyenCan;
    private final int giuaKy;
    private final int cuoiKy;
    
    public HPLyThuyet(String tenHP, int soTinChi, int chuyenCan, int giuaKy, int cuoiKy) {
        super(tenHP, soTinChi);
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }
 
    @Override
    public double tinhDiem() {
        if ((this.chuyenCan >0 && this.chuyenCan <10) 
   &&(this.giuaKy>0 && this.giuaKy <10)&&(this.cuoiKy>0 && this.cuoiKy <10));
        double DTB = ((this.chuyenCan*0.1)+(this.giuaKy*0.2)+(this.cuoiKy*0.7));
        System.out.println("Toan"+ DTB);
        return 0;
        
    
  }
    

}
