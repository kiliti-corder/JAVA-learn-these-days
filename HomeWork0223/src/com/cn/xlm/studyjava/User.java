package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-24-9:49 PM
 */

//dto :data transfer object 数据传输对象
public class User {

    private String name;
    private String sex;
    private String password;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public User(String name,String sex,String password,String phone) {
        super();
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.phone = phone;
    }


}
