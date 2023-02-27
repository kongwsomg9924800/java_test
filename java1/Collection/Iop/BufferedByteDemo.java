package java1.Collection.Iop;

import java.io.*;

public class BufferedByteDemo {
    public static void main(String[] args) {
        //添加时间戳
        //获取当前时间戳
        long l1 = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("/Users/mac/Desktop/1.png"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/mac/Desktop/2.png"));
            byte[] bytes = new byte[1024];
            int read =0;
            while(-1 != (read = bufferedInputStream.read(bytes))){
                bufferedOutputStream.write(bytes,0,read);
            }
            System.out.println("copy完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != bufferedInputStream){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != bufferedInputStream){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long l2 = System.currentTimeMillis();
        long l = l2 - l1;
        System.out.println("运行时间："+l);//53
    }
}
