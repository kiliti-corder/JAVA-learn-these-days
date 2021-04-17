package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-5:22 PM
 */
/*
2设计一个Person类，name/sex,要重写一个equals方法，如果名字相同，认为是同一个对象,不能new对象
 */
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Person person = (Person) obj;
        if(person.getName() == null | name == null) {
            return false;
        } else {
            return name.equalsIgnoreCase(person.getName());
        }

    }
}
