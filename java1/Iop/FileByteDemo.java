package java1.Iop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //读图片或视频
            fileInputStream = new FileInputStream("/Users/mac/Desktop/1.png");
            //写图片或视频
            fileOutputStream = new FileOutputStream("/Users/mac/Desktop/2.png");

            //读取，以字节为单位（适用于文件大小较小的情况）
//            int res = 0;
//            while(-1!=(res = fileInputStream.read())){
//                fileOutputStream.write(res);
//            }
            //获取文件大小
            int size = fileInputStream.available();
            System.out.println("文件大小为："+size);
            //创建数组
            /*byte[] bytes = new byte[size];
            //将要拷贝的文件读进数组中
            int read = fileInputStream.read(bytes);*/

            byte[] bytes = new byte[1024];
            int read =0;
            while(-1 != (read = fileInputStream.read(bytes))){
                fileOutputStream.write(bytes,0,read);
            }
            //将读取到的文件写入
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != fileOutputStream){
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(null != fileInputStream){
                try {
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
