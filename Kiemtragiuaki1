
public class Cooker extends ElectricalDevice {
    protected boolean cooking;
    public Cooker(String m,int p,String id,boolean s ,boolean c){
        super(m,p,id,s);
        cooking=c;
        
    }
    public boolean getCooking(){
        return cooking;
    }
    public void setCooking( boolean x){
        cooking=x;
    }
    public void cook(){
        cooking=true;
    }
    public void warn(){
        cooking=false;
    }
    
    
}
------------------------------------------------------------------
public class ElectricalDevice implements Swithchable {
    protected String manuFacture;
    protected int price;
    protected String id;
    protected boolean switcher;
    public ElectricalDevice(String m,int p,String id,boolean s ){
        manuFacture=m;
        price=p;
        this.id=id;
        switcher=s;
    }
    public void setManuFacture(String x){
        manuFacture=x;
        
    }
    public String getManuFacture(){
        return manuFacture;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int x){
        price=x;
        
    }
    public String getId(){
        return id;
        
    }
    public void setId(String x){
        id=x;
        
    }
    public boolean getSwitcher(){
        return switcher;
    }
    public void setSwitcher(boolean x){
        switcher=x;
        
    }
    public String toString(){
        return id+manuFacture+",giá: "+price+","+switcher;
    }
    public void turnOn(){
        switcher=true;
    }
    public void turnOff(){
        switcher=false;
    }
    
    
}
-----------------------------------------------------------------

public class Fan extends ElectricalDevice {
        protected String speed;

    protected boolean swing; 

    public Fan(String m, int p, String id, boolean s,boolean sw,String sp) {
        super(m, p, id, s);
        swing=sw;
        speed=sp;
        
        
    }
 
    public String getSpeed() {
        return speed;
    }

    public boolean isSwing() {
        return swing;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void incSpeed() {
        System.out.println("toc do quay cua quat la 1000 vong/phut");
    }

    
    public void upDate() {
    }

    
}
-------------------------------------------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public interface Swithchable {
    public void turnOn();
    public void turnOff();

    
}
---------------------------------------------------------------------
import java.util.Vector;

public class Swithcher implements Swithchable {
    private Vector devices;
    private boolean state;
    public Swithcher(){
        devices=new Vector();
        state=true;
    }
    public boolean getState(){
        return state;
    }
    public void setState(boolean x){
        state=x;
    }
    public void addDevice(ElectricalDevice x){
        devices.addElement(x);
        
        
    }
    public void removeDevice(ElectricalDevice x){
        devices.removeElement(x);
    }
    public void turnOn(){
        state=true;
        for(int i=0;i<devices.size();i++)
            ((ElectricalDevice)devices.elementAt(i)).turnOn();
    }
    public void turnOff(){
        state=false;
        for(int i=0;i<devices.size();i++)
            ((ElectricalDevice)devices.elementAt(i)).turnOff();
        
    }
    
}
------------------------------------------------------------------
  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Mainn{
public static void main(String[] args) {
    Swithcher cauDao=new Swithcher();
    Cooker noiCom=new Cooker("LG",150,"123",true,false);
    Fan mayQuat=new Fan("Toshiba",70,"456",true,3,true);
    cauDao.addDevice(noiCom);
    cauDao.addDevice(mayQuat);
    cauDao.showDevice();
    cauDao.update();
    cauDao.turnOff();
    }
    
}
   
