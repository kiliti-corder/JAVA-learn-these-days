package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-5:15 PM
 */
public class CarKeyStartsTheCarTest02   implements CarKeyStartsTheCar {
    @Override
    public void openCarDoor() {
        System.out.println("打开" + carDoor);
    }

    @Override
    public void GetOnCar() {
        System.out.println("上" + car);
    }

    @Override
    public void closeCarDoor() {
        System.out.println("关上" + carDoor);
    }

    @Override
    public void insertCarKeyIntoJack() {
        System.out.println("将" + carKey + "插入插孔扭转");
    }

    @Override
    public void startsTheCar() {
        System.out.println("发动" + car);
    }

    public static void main(String[] args) throws InterruptedException {
        CarKeyStartsTheCarTest02 carKeyStartsTheCarTest02 = new CarKeyStartsTheCarTest02();
        Thread thread = new Thread();

        carKeyStartsTheCarTest02.openCarDoor();
        thread.sleep(1000);

        carKeyStartsTheCarTest02.GetOnCar();
        thread.sleep(1000);

        carKeyStartsTheCarTest02.closeCarDoor();
        thread.sleep(1000);

        carKeyStartsTheCarTest02.insertCarKeyIntoJack();
        thread.sleep(1000);

        carKeyStartsTheCarTest02.startsTheCar();
    }
}
