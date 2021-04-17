package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-02-12:29 PM
 */
public class Bird {
    private int age;
    private String color;
    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void say(int age,String color,double weight){
        System.out.println(color + "的" + "拥有" + weight + "公斤的" + age +"岁的" + "鸟再叫");
    }
}
