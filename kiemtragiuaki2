public class Main {
    public static void main(String args[]){
        Hinh dsHinh[]=new Hinh[4];
        dsHinh[0]=new HinhTron(1,0,2,3,5);
        dsHinh[1]=new HinhChuNhat(2,1,4,6);
        dsHinh[2]=new HinhChuNhat(0,2,7,3);
        dsHinh[3]=new HinhVuong(0,1,5);
       
        double tongChuVi=0;
        double tongDienTich=0;
        for(int i=0;i<4;i++){
            dsHinh[i].veHinh();
            tongChuVi+=dsHinh[i].tinhChuVi();
            tongDienTich+=dsHinh[i].tinhDienTich();
        }
        System.out.println("Tổng chu vi là:"+tongChuVi);
        System.out.println("Tổng diện tích là:"+tongDienTich);
       
        dsHinh[1].doiMauTo(Hinh.DEN);
        dsHinh[1].doiMauVe(Hinh.DO);
        ((HinhTron)dsHinh[0]).diChuyen(4,5);
        ((HinhTron)dsHinh[0]).doiBanKinh(6);
        dsHinh[1].veHinh();
        dsHinh[0].veHinh();
       
    }
}
---------------------------------------------------------------------------------------------
abstract class Hinh {
    public static final int DEN=0;
    public static final int XANH=1;
    public static final int DO=2;
    protected int mauVe;
    protected int mauTo;
    public Hinh(){
        mauVe=0;
        mauTo=0;
    }
    public Hinh(int mauVe,int mauTo){
        this.mauVe=mauVe;
        this.mauTo=mauTo;
    }
    public int layMauVe(){
        return mauVe;
    }
    public int layMauTo(){
        return mauTo;
    }
    public void doiMauVe(int mauVe){
        this.mauVe=mauVe;
    }
    public void doiMauTo(int mauTo){
        this.mauTo=mauTo;
    }
    public abstract void veHinh();
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();
}
------------------------------------------------------------------------------------
class HinhTron extends Hinh{
    private double x;
    private double y;
    private double R;
    public HinhTron(){
        super(0,0);
        x=0;
        y=0;
        R=0;
    }
    public HinhTron(int mauVe,int mauTo,double x,double y,double R){
        super(mauVe,mauTo);
        this.x=x;
        this.y=y;
        this.R=R;
    }
    public double layX(){
        return x;
    }
    public double layY(){
        return y;
    }
    public double layR(){
        return R;
    }
    public void diChuyen(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void doiBanKinh(double R){
        this.R=R;
    }
    public void veHinh(){
      
    }
    public double tinhDienTich(){
        return (R*R*3.14);
    }
    public double tinhChuVi(){
        return (R*2*3.14);
    }
    public String toString(){
        return "Hình tròn tọa độ x="+x+",y="+y+",R="+R;
    }
}
-------------------------------------------------------------------------------
class HinhChuNhat extends Hinh{
    protected double dai;
    protected double rong;
    public HinhChuNhat(int mauVe,int mauTo,double d,double r){
        super(mauVe,mauTo);
        dai=d;
        rong=r;
    }
    public double layDai(){
        return dai;
    }
    public double layRong(){
        return rong;
    }
    public void doiDai(double dai){
        this.dai=dai;
    }
    public void doiRong(double rong){
        this.rong=rong;
    }
    public void veHinh(){
        System.out.println("Vẽ hình chữ nhật");
    }
    public double tinhDienTich(){
        return (dai*rong);
    }
    public double tinhChuVi(){
        return (dai+rong)*2;
    }
    public String toString(){
        return "Hình chữ nhật chiều dài="+dai+",chiều rộng="+rong;
    }
}
---------------------------------------------------------------------
class HinhVuong extends HinhChuNhat{
    private double canh;
    public HinhVuong(int mauVe,int mauTo,double canh){
        super(mauVe,mauTo,canh,canh);
        this.canh=canh;
    }
    public String toString(){
        return "Hình vuông độ dài cạnh="+canh;
    }
}

