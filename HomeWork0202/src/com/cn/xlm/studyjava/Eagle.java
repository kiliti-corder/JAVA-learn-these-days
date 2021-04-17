package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-02-12:40 PM
 */
public class Eagle extends Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(int age, String color, double weight,String name) {
        System.out.println(color + "的" + "拥有" + weight + "公斤的" + age +"岁的" + name + "在叫");
    }

    public static void main(String[] args){
        Eagle eagle = new Eagle();
        eagle.say(20,"红色",20,"鹰");
    }
}
