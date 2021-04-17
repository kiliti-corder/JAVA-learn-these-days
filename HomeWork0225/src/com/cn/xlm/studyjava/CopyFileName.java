package com.cn.xlm.studyjava;

import java.io.*;

/**
 * @author shkstart
 * @create 2021-02-26-12:16 AM
 */
//1 复制一个文件夹的内容  D:\\JAVA 复制到E:\\JAVA
    //创建两个File对象,分别输入源和输出源
    //判断目标文件夹是否存在,如果不存在就创建
    //递归方式拷贝
public class CopyFileName {

    public static void  main(String[] args) throws IOException{

        File sourceFile = new File("D:\\Junit");
        File targetFile = new File("c:\\Download");

        if (!targetFile.exists()){
            targetFile.mkdir();
        }

        int count = copyFiles(sourceFile,targetFile);
        System.out.println("copy ok!");
    }

    private static int copyFiles(File sourceFile, File targetFile) throws IOException{

        int c = 0;
        if (!targetFile.exists()){
            targetFile.mkdir();
        }

        File[] files = sourceFile.listFiles();
        if (files.length > 0){
            for (File f : files){
                if (f.isDirectory()){
                    File f3 = new File(sourceFile,f.getName());
                    File f4 = new File(targetFile,f.getName());
                    copyFiles(f3,f4);
                }else{
                    InputStream is = new FileInputStream(f);
                    OutputStream os = new FileOutputStream(targetFile + File.separator + f.getName());
                    int len = 0;
                    byte[] b = new byte[1024];
                    while ((len = is.read(b)) > 0){
                        os.write(b,0,len);
                        c += 1;

                    }
                    is.close();
                    os.close();
                }

            }
        }

        return c;
    }

}
