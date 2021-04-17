package com.cn.xlm.studyjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * @author shkstart
 * @create 2021-03-07-9:51 AM
 */
public class CopyFilesByNIOAndChannelDome02 {

    public static void main(String[] args) {

        File file = new File("D:\\360安全浏览器下载\\2117906336\\FileRecv\\day0127(运算符和流程控制).zip");
        File file2 = new File("D:\\a\\day0127(运算符和流程控制).zip");



        //创建FileInputInputStream
        //创建FileOutputInputStream
        //创建读的FileChannel
        //创建写的FileChannel
        try(
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(file2)
        ){
            FileChannel fcr = fis.getChannel();
            FileChannel fcw = fos.getChannel();

            //从读取的通道传输到写入的通道
            //fcr.transferTo(0,fcr.size(),fcw);

            //从读取的通道进行传输
            fcw.transferFrom(fcr,0,fcr.size());

            System.out.println("ok...");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
