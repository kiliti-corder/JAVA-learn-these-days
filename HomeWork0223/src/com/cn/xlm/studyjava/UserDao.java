package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-24-9:55 PM
 */
public interface UserDao {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
    /**
     * 删除用户
     * @param String
     */
    void removeUser(String name);
    /**
     * 修改用户
     * @param user
     */
    void updaterUser(User user);
    /**
     * 查找用户
     * @param name
     */
    User getUserByName(String name);



}
