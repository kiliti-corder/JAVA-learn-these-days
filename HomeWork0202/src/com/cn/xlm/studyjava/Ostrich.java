package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-02-12:34 PM
 */
public class Ostrich extends Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void say(int age, String color, double weight,String name) {

        System.out.println(color + "的" + "拥有" + weight + "公斤的" + age +"岁的" + name + "鸟在叫");
    }

    public static void main(String[] args){
        Ostrich ostrich = new Ostrich();
        ostrich.say(18,"绿色",10,"鸵");

    }
}
