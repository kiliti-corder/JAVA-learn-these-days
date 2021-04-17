package com.gec.work;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-04-14-10:18 PM
 */
public class Client {

    public static void main(String[] args) throws IOException{

        //客户端套字节
        Socket s = new Socket(InetAddress.getLocalHost(),6666);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入内容:");

        while (true){

            OutputStream os = s.getOutputStream();
            String line = scan.nextLine();

            line += "\r\n";

            //写
            os.write(line.getBytes());

        }


    }

}
