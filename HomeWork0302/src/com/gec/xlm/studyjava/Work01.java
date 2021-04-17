package com.gec.xlm.studyjava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author shkstart
 * @create 2021-03-30-11:35 PM
 */

/*
    用同一个线程类完成1+100  另一个完成1+200的结果并返回
    通过私有静态方法进行封装,有利于后期维护
 */

class CalThread implements Callable<Integer>{

    int i,j;

    public CalThread(int i,int j){

        this.i = i;
        this.j = j;

    }


    @Override
    public Integer call(){

        int sum = 0;
        for (int a = i; a < j; a++){

            sum += a;

        }

        return sum;
    }

}



public class Work01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Work01 work01 = new Work01();
        int sum1 = work01.TestAddSum(1,101);
        System.out.println("1加到100的和:" + sum1);

        int sum2 = work01.TestAddSum(1,201);
        System.out.println("1加到200的和为:" + sum2);

    }

    private static int TestAddSum(int i, int j) throws ExecutionException, InterruptedException {
        CalThread ct = new CalThread(i,j);
        FutureTask<Integer> ft = new FutureTask<Integer>(ct);

        Thread t = new Thread(ft);
        t.start();

        int sum = ft.get();

        return sum;

    }

}
