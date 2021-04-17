package com.cn.xlm.studyjava;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author shkstart
 * @create 2021-03-07-9:13 AM
 */
//利用NIO进制文件复制，FileChannel
public class CopyFilesByNIOAndChannel {

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

            //创建Buffer对象
            ByteBuffer bbf = ByteBuffer.allocate(1024);

            int count = 0;
            //循环读取
            while(true) {
                count++;
                //把缓冲里面的数据刷出去
                bbf.clear();

                //把数据读到缓冲
                int read = fcr.read(bbf);
                //判断 -1：到达这个文件内容的末尾处
                if(read == -1) {
                    break;//退出循环
                }

                //进入读取模式
                bbf.flip();

                //写到写的通道中
                fcw.write(bbf);
            }

            System.out.println("使用1024字节" + count + "次");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
