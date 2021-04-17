package com.cn.xlm.studyjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-02-24-2:28 AM
 */
public class ListTest02 {

   static List list  = new ArrayList();

    static Scanner  scanner = new Scanner(System.in);

    static{

        Product p1 = new Product(10,"象拔蚌",10.2f);
        Product p2 = new Product(21,"圣剑",13546.233f);
        Product p3 = new Product(11,"瓜皮",131.111f);

        list.add(p1);
        list.add(p2);
        list.add(p3);


    }


    public static void main(String[] args){


        while(true){
            System.out.println("===========欢迎进入商品管理后台===========");
            System.out.println("===========1请输入名称查找商品===========");
            System.out.println("===========2请输入名称删除商品===========");
            System.out.println("=========== 3查询全部商品===========");

            int num = scanner.nextInt();
            if(num == 1){
                findProductByName();
            }else if(num == 2){
                removeProductByName();
            }else if(num == 3){
                findAllProducts();
            }
        }
    }


    private static void findProductByName() {

        System.out.println("请输入您需要查找的商品名称:");
        String name = scanner.next();

        for(Object object : list){
            Product product = (Product)object;
            if(name.equals(product.getName())){
                System.out.println("商品信息:" + product);
                break;
            }
        }

    }

    private static void removeProductByName(){

        System.out.println("请输入你需要删除的商品名称:");
        String name = scanner.next();

        for (int i = 0; i < list.size(); i++){
            Product product = (Product)list.get(i);
            if(name.equals(product.getName())){
                list.remove(product);
                System.out.println("删除商品成功!" + product);

                System.out.println("商品元素数剩余:" + list.size());
                break;
            }
        }

    }

    private static void findAllProducts() {

        for (int i = 0; i < list.size(); i++){
            System.out.println((Product)list.get(i));
        }
    }





}
