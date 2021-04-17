package com.fristdaystudyidea.bean;

public class Customer {
    private int age;
    private String name;
    private char sex;
    public void show(int age,String name,char sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
        System.out.println("年龄: " + age);
        System.out.println("姓名: " +  name);
        System.out.println("性别: " + sex);
    }
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.show(17,"爱丽丝",'女');

    }
}
