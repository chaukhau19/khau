package khaucntt;

public class DiemHP {
	public abstract class DiemHP {
	    protected String tenHP;
	    protected int soTinChi;
	    public DiemHP (String tenHP,int soTinChi){
	        this.tenHP=tenHP;
	        this.soTinChi=soTinChi;
	    }
	   
	    public String laytenHP(){
	        return tenHP;
	    }
	    public void laytenHP(String tenHP){
	        this.tenHP=tenHP;
	    }
	    public int laysoTinChi(){
	        return soTinChi;
	    }
	    public void laysoTinChi(int soTinChi){
	        this.soTinChi=soTinChi;
	        
	    }
	    public abstract void tinhDiem();



	    
	}

}
class HPLyThuyet extends DiemHP{
	private double chuyenCan;
	private double giuaKy;
	private double cuoiKy;
	
	public HPLyThuyet(String tenHP,int soTinChi, double chuyenCan,double giuaKy,double cuoiKy ) {
		super ();
		this.chuyenCan=chuyenCan;
		this.giuaKy=giuaKy;
		this.cuoiKy=cuoiKy;
	}
	public double tinhDiem() {
		if ((this.chuyenCan>=0 && this.chuyenCan<=10 ) && (this.giuaKy>=0 &&this.giuaKy<=10) && (this.cuoiKy>=0 && this.cuoiKy<=10));
		double dtb = (this.chuyenCan*0.1)+(this.giuaKy*0.2)+(this.cuoiKy*0.7);
		System.out.println ("toan"+dtb);
		return 0;
		
	}
}

class HPThucHanh extends DiemHP{
	private float db1,db2,db3;
	
	public HPThucHanh(String tenHP,int soTinChi,float db1,float db2,float db3) {
		super();
		this.db1=db1;
		this.db2=db2;
		this.db3=db3;
	}
	public double tinhDiem() {
		return (this.db1+this.db2+this.db3)/3;
	}
}


public class main {
    public static void main(String[] args) {
        HPLyThuyet p = new HPLyThuyet("asdahufg", 2, 3, 4, 4);
        p.tinhDiem();
        HPThucHanh q = new HPThucHanh("Van",2,4,7,9) {} ;
        System.out.println(q.tinhDiem());;        
    }
}
