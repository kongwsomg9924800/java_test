package java1.Iop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//使用[单个字符]进行拷贝
public class FileCharDemo {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //读取流
            fileReader = new FileReader("/Users/mac/Desktop/test.txt");
            //写入流
            fileWriter = new FileWriter("/Users/mac/Desktop/day.txt");
            //读取
            int res = 0;
            while(-1!=(res = fileReader.read())){
                char c = (char) res;
                System.out.println("读出来的内容为："+c);
                fileWriter.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != fileWriter){
                try {
                    fileWriter.close();//默认写法：后写先关
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(null != fileReader){
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

    }
}
