package com.cn.xlm.studyjava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-03-05-9:23 AM
 */

//1 利用Scanner 输入内容  一直等到输入 :wq 退出程序并保存内容到txt中（IO流）
public class WriteSthToTxt {
    /*
        1.创建File文件实例
        2.创建Scanner实例,用于控制台输入
        3.循环
            在等待控制台输入,只要不是:wq这个字符串,就用StringBuilder.append(输入的字符串)
            如果是:wq ,break循环
        4.写出这个字符串
     */
    public void TestWrite(){

        File file = new File("D:\\Something.txt");
        try (OutputStream os = new FileOutputStream(file);
             Scanner scanner = new Scanner(System.in);
        ){
            System.out.println("请输入要输入的内容,一行一行输入:,要退出请输入:wq");

            StringBuilder stringBuilder = new StringBuilder();
            String str = null;
            while (scanner.hasNext()){
                //下一行字符串
                str  = scanner.next();
                //判断是否要中断
                if(str.equals(":wq")){
                    break;//退出循环
                }else{
                    stringBuilder.append("\r\n");//window的换行
                }
            }

            //把输入的内容一次写出去
            os.write(stringBuilder.toString().getBytes());
            System.out.println("写出ok......");
        }catch (IOException e){
            e.printStackTrace();
        }





    }

    public static void main(String[] args){


        WriteSthToTxt writeSthToTxt = new WriteSthToTxt();
        writeSthToTxt.TestWrite();
    }

}
