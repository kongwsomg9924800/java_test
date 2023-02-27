package java1.Iop;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //1.创建对象
            fileReader = new FileReader("/Users/mac/Desktop/test.txt");
            //2.1 读取文本中第一个字符
//            int read = fileReader.read();
//            System.out.println("读取的内容是："+(char)read);
            //2.2 读取所有内容
//            int res = 0;
//            while(-1 != (res = fileReader.read())){
//                System.out.println("读取的内容是："+(char)res);
//            }
            //2.3 读取部分内容
            char[] chars = new char[5];
            fileReader.read(chars,1,2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(null != fileReader){}
                //3.关闭流
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
