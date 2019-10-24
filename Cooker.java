/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
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
