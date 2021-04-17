package com.gec.work;

import java.util.concurrent.*;

/**
 * @author shkstart
 * @create 2021-04-13-9:47 PM
 */
//同一个线程池，一个完成1+100;另一个完成1+200;
class HomeWork implements Callable<Integer>{

    private int k;

    public HomeWork(int k){
        this.k = k;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= k; i++){

            sum += i;

        }
        return sum;
    }
}


public class ThreadPoolTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //创建线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        //创建对象
        HomeWork hw = new HomeWork(100);
        HomeWork hw2 = new HomeWork(200);

        //创建通道
        Future<Integer> f1 = es.submit(hw);
        Future<Integer> f2 = es.submit(hw2);

        System.out.println("1+2+3+....+100=" + f1.get());
        System.out.println("1+2+3+....+200=" + f2.get());

        //关闭线程池
        es.shutdown();
    }

}
