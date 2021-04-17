package com.cn.xlm.studyjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author shkstart
 * @create 2021-02-24-10:00 PM
 */
public class Demo {

    static Map users  = new HashMap();
    UserDao dao = new UserDaoImpl();

    static Scanner scanner = new Scanner(System.in);

    static{
        User user = new User("张三","男","123","13612341234");
        users.put(user.getName(),user);

    }


    public static void main(String[] args){

        while(true){
            System.out.println("=========欢迎进入用户管理后台!=========");
            System.out.println("    =========1添加用户信息=========");
            System.out.println("    =========2删除用户信息=========");
            System.out.println("    =========3修改用户信息=========");
            System.out.println("    =========4查询用户信息=========");

            //提示
            System.out.println("请输入数字进行操作:");

            //接收
            int num  = scanner.nextInt();

            //判断
            if(num == 1){
                addUser();
            } else if(num  == 2){
                removeUser();
            } else if(num == 3){
                updateUser();
            } else if(num == 4){
                findAllUsers();
            }

        }

    }

    private static void addUser() {

        System.out.println("请输入用户名");
        String name = scanner.next();

        System.out.println("请输入性别");
        String sex = scanner.next();

        System.out.println("请输入密码");
        String password = scanner.next();

        System.out.println("请输入手机号");
        String phone = scanner.next();

        User user = new User(name,sex,password,phone);

        users.put(name,user);
        System.out.println("所有的用户 : " + users);

        System.out.println("添加用户成功!");

    }

    private static void removeUser() {

        System.out.println("请输入用户名进行删除!");
        /*
        输入名字后,进行所有的用户遍历,在遍历过程中,判断输入的名字是否与遍历的用户 对象的名字相同,如果相同,删除,如没有,则提示没有这个用户
         */

        String name = scanner.next();
        boolean flag = false;

        Set s = users.keySet();
        for (Object key_name : s) {
            if (name.equals(key_name)){

                flag = true;
                break;
            }
        }
        if (flag){
            users.remove(name);
            System.out.println("删除用户成功!");
            System.out.println(users);
        }else{
            System.out.println("没有这个用户 ");
        }


    }

    private static void updateUser() {

        System.out.println("请输入用户名进行修改!");
        String name = scanner.next();
        if(users.containsKey(name)){
            System.out.println("请输入用户名,性别,密码,手机号,用逗号隔开");
            String strs = scanner.next();
            String[] arrs = strs.split(",");

            User user = new User(name,arrs[0],arrs[1],arrs[2]);
            users.put(name,user);

        }else {
            System.out.println("不存在这个用户!");
        }

    }

    private static void findAllUsers() {

        System.out.println(users);

    }



}
