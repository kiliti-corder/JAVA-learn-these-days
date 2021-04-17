package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-5:32 PM
 */
public class PersonTest02 {

    public static void main(String[] args) {
        Employee employee = new Employee("mily",1);
        Employee employee2 = new Employee("mily",1);
        Person p1 = new Person("mily");

        System.out.println(p1.equals(employee));
        System.out.println(p1.equals(employee2));
        System.out.println(employee.equals(employee2));

        Employee employee3 = new Employee(null,1);
        Employee employee4 = new Employee(null,1);
        Person p2 = new Person(null);
        System.out.println(p2.equals(employee3));
        System.out.println(p2.equals(employee4));
        System.out.println(employee3.equals(employee4));
    }


}
