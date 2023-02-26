package java1.Listp;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        arrayList.add(2);
        //int newCapacity = oldCapacity + (oldCapacity >> 1)
        //动态扩容 1+0.5=1.5
        //数组长度在10以内的直接添加，10以外的需要动态1.5倍扩容
        arrayList.add(9);
        System.out.println("arrayList:"+arrayList);

        //动态扩容代码
        //newCapacity(int minCapacity):
        //  int newCapacity = oldCapacity + (oldCapacity >> 1)
    }
}
