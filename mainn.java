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
    

