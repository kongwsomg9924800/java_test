package java1.Iop;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        //创建
        FileWriter fileWriter = null;
        try {
            //如果文件不存在，将自动创建文件并写入；如果文件存在，将文件清空
            fileWriter = new FileWriter("/Users/mac/Desktop/test.txt",true);//append表示：如果文件存在，将在文件后面添加内容（原有内容保持）
            //void write(int c)
//            fileWriter.write("a");
            fileWriter.write(97);//等同于"a"
            //void write(char cbuf[])
            char[] chars = new char[]{'h','e','l','l','o'};
            fileWriter.write(chars,1,4);
            //添加数组里的全部元素
            fileWriter.write(chars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(null != fileWriter) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
