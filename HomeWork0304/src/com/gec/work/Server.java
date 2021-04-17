package com.gec.work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shkstart
 * @create 2021-04-14-10:12 PM
 */

//tcp服务端接收客户端内容并保存到txt文件中，可以追加内容

public class Server {

    public static void main(String[] args) throws IOException{
        //服务端套字节
        ServerSocket ss = new ServerSocket(6666);

        //监听客户端套字节
        Socket s = ss.accept();

        //数据缓冲
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];

        //创建一个文件保存内容
        File file = new File("D:\\code\\ab.txt");

        //输出流
        FileOutputStream fos = new FileOutputStream(file,true);
        int len = 0;
        while ((len = is.read(b)) > 0){
            fos.write(b,0,len);

            fos.write("\r\n".getBytes());
        }

        //

    }

}
