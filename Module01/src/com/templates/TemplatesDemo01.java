package com.templates;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2021-04-16-8:39 PM
 */

/*
   1.IDEA中代码模块所处的位置:setting - Editor - Live Templates/Postfix Completion
    2.常用的模块
 */
public class TemplatesDemo01 {

    //模板零:prsf => private static final
    private static final int VIT_SIZE = 102;

    //变形:psf
    public static final int BIG_SIZE = 1000;

    //变形:psfi = >public static final int
    //变形:psfs = >public static final String

    //模板一:psvm
    public static void main(String[] args) {


        //模板二:sout
        System.out.println("hello");
        //变形:soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesDemo01.main");
        System.out.println("args = " + args);

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 29;
        System.out.println("num2 = " + num2);
        int num3 = 21;
        System.out.println(num3);

        //模板三fori
        String[] arr = new String[]{"lie","ka","woe","fao"};
        for (int i = 0; i < num3; i++) {
            System.out.println(i);
        }
        System.out.println("=====");
        //变形: iter 增强for循环  / itar 普通for循环
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("=====");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }


        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);

        for (Object o : list) {
            
        }
        System.out.println("=====");
        //变形:list.fori / list.forr
        for (int i = 0; i < list.size(); i++) {

        }
        //倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        method();
    }

    private static  void method(){

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);

        //模板五:ifn
        if (list == null) {
            System.out.println("yes, it is");
        } else {
            System.out.println("no,list is not  null!");
        }

        //变形:inn => if not null
        if (list != null) {
            System.out.println("yes,list is not  null!");
        }

        //变形:xxx.null / xxx.nn
        if (list == null) {
            if (list != null) {

            }
        }
    }
}
