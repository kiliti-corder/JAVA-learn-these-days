package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-4:59 PM
 */
/*
在奶茶店，要泡一杯饮料
1 拿杯子
2 获取饮料成分
3 放进杯子并包装好拿给你

 */
public class ModModernTest01 implements ModModern {

    public void come(){
        System.out.println("我在奶茶店，要泡一杯饮料");
    }


    @Override
    public void useBottle() {
        System.out.println("店员拿" + bottle);
    }

    @Override
    public void ObtainBeverageIngredients() {
        System.out.println("店员获取" + drinks +"成分");
    }

    @Override
    public void putAndPackaging() {
        System.out.println("店员将奶茶放进杯子并包装好拿给你");
    }

    public void leave(){
        System.out.println("我离开奶茶店");
    }

    public static void main(String[] args) throws InterruptedException {
        ModModernTest01 modModernTest01 = new ModModernTest01();
        modModernTest01.come();
        Thread thread = new Thread();
        thread.sleep(1000);
        modModernTest01.useBottle();
        thread.sleep(1000);
        modModernTest01.ObtainBeverageIngredients();
        thread.sleep(1000);
        modModernTest01.putAndPackaging();
        thread.sleep(1000);
        modModernTest01.leave();
    }
}
