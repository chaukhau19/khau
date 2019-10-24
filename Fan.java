/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
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
