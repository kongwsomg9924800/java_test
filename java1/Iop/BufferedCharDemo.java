package java1.Iop;

import java.io.*;

public class BufferedCharDemo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //读文件
            bufferedReader = new BufferedReader(new FileReader("/Users/mac/Desktop/test.txt"));
            //写文件
            bufferedWriter = new BufferedWriter(new FileWriter("/Users/mac/Desktop/test1.txt"));
            String str = null;
            while(null != (str = bufferedReader.readLine())){
                System.out.println("读出来的内容为："+str);
                bufferedWriter.write(str
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != bufferedWriter){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != bufferedReader){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
