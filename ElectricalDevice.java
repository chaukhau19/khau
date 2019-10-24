/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
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
