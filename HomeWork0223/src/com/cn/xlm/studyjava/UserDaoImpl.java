package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-24-9:58 PM
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println("添加" + user + "成功!");
    }

    @Override
    public void removeUser(String name) {
        System.out.println( "删除用户" + name + "成功!");
    }

    @Override
    public void updaterUser(User user) {
        System.out.println("修改用户" + user + "成功!");
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }
}
