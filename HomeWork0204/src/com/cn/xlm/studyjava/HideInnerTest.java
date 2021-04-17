package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-10:14 PM
 */
public class HideInnerTest {

    public static void main(String[] args) {

        HideInner hideInner = new HideInner() {
            @Override
            public void test() {
                System.out.println("匿名内部类方法test()----");
            }
        };
        hideInner.test();

        System.out.println("----------------------------------");


        HideInnerB hideInnerB = new HideInnerB() {
            @Override
            public void TestB() {
                super.TestB();
                System.out.println("这是通过继承的方式创建匿名内部类,调用TestB().....");
            }
        };
        hideInnerB.TestB();
    }
}
