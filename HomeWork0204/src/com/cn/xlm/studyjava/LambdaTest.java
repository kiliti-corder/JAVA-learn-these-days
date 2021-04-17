package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-9:41 PM
 */
public class LambdaTest {

    public static void main(String[] args){
        Lambda lambda = new Lambda() {
            @Override
            public void test() {
                System.out.println("匿名内部类test()---");
            }
        };
        lambda.test();


        System.out.println("----------------------");

        Lambda lambda1 = ()->{
            System.out.println("这是lambda表达式");
        };
        lambda1.test();


        System.out.println("----------------------");

        //简化写法
        Lambda lambda2 = ()->System.out.println("这是简化写法!");
        lambda2.test();
    }

}
