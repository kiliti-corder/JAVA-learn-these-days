package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-22-6:13 PM
 */
public class Product {


        private int size;
        private String name;
        private float price;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int size, String name, float price) {
            super();
            this.size = size;
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            return "Product [size=" + size + ", name=" + name + ", price=" + price + "]";


        }

}

