package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-01-9:14 PM
 */
public class ComputerTest02 {

    private int HDD;
    private int RAM;
    private float GHZ;

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public float getGHZ() {
        return GHZ;
    }

    public void setGHZ(float GHZ) {
        this.GHZ = GHZ;
    }

    public void show(int HDD,int RAM,float GHZ){
        System.out.println("电脑的HDD属性为:" + HDD + "G,RAM为:" + RAM + "G,GHZ为:" + GHZ + "GHz");
    }


    public static void main(String[] args){
        ComputerTest02 computerTest02 = new ComputerTest02();
        computerTest02.show(1000,32,4.59f);
    }
}
