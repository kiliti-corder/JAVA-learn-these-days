package com.cn.xlm.studyjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-02-22-6:13 PM
 */
/*
    1. 用一个List作为集合类
    2.要添加3个商品对象进去 Product:商品类 属性 :名称 价格 库存
    3.定义方法根据名称搜索商品并返回商品对象
    4.根据商品名称删除商品对象
    5.查询全部商品对象
 */
public class ListTest {


    public void search() {
        //要添加3个商品对象进去 Product:商品类 属性 :名称 价格 库存
        Product pd1 = new Product(10000, "Dynamite Pack", 23);
        Product pd2 = new Product(15000, "Grenade", 100);
        Product pd3 = new Product(20000, "rocket missile", 250);

        List list = new ArrayList();
        list.add(pd1);
        list.add(pd2);
        list.add(pd3);

        System.out.println("=========原地起飞器==========");
        for (int i = 0; i < list.size(); i++) {
            Product product = (Product) list.get(i);
            System.out.println(product);
        }
    }

    public void remove(){
        Product pd1 = new Product(10000, "Dynamite Pack", 23);
        Product pd2 = new Product(15000, "Grenade", 100);
        Product pd3 = new Product(20000, "rocket missile", 250);

        List list = new ArrayList();
        list.add(pd1);
        list.add(pd2);
        list.add(pd3);

        System.out.println("=========删除商品了==========");
        //根据商品名称删除商品对象
        for(int i = 0; i <= list.size(); i++){
            list.remove(i);
        }
        System.out.println("商品剩余量为:" + (list.size()-1) );
    }

    public void searchAllElement(){
        Product pd1 = new Product(10000, "Dynamite Pack", 23);
        Product pd2 = new Product(15000, "Grenade", 100);
        Product pd3 = new Product(20000, "rocket missile", 250);

        List list = new ArrayList();
        list.add(pd1);
        list.add(pd2);
        list.add(pd3);

        Iterator it=list.iterator();
        System.out.println("=========查询所有商品==========");

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }



    public static void main(String[] args) {

        //定义方法根据名称搜索商品并返回商品对象
        ListTest listTest = new ListTest();
        listTest.search();
        listTest.remove();
        listTest.searchAllElement();
    }
}
