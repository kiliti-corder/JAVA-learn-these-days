package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-9:36 PM
 */
// 函数式编程（确保只有一个抽象方法,FunctionalInterface的出现只是为了编译时检查是否只有一个抽象方法）
@FunctionalInterface
public interface Lambda {
    void test();
    //void test2();
    //Multiple non-overriding abstract methods found in interface com.cn.xlm.studyjava.Lamdba
}
