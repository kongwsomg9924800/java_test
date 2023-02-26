package java1.Listp;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        //List集合声明
        List arr = new ArrayList();
        //1.使用Collection添加方法
        arr.add("one");
        arr.add("two");

        //2.使用List添加方法：add(int index, E element)
        arr.add(1,1);

        arr.add(3,2);
        System.out.println("arr="+arr);

        //声明一个list
        List arr2 = new ArrayList();
        arr2.add("hello");
        arr2.add("two");
        arr2.add("list");

        //将一个数组中的全部元素按指定位置添加到到arr中
        arr.addAll(2,arr2);
        System.out.println("arr="+arr);

        //3.根据参数指定的下标l来获取元素对象
        Object o = arr.get(2);
        //String o = (String) arr.get(2);
        System.out.println(o);
        System.out.println(arr.size());
        //get重写toString
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = arr.size();
        for (int i=0;i<arr.size();i++) {
            Object o2 = arr.get(i);
            if(size-1 == i){
                sb.append(o2).append("]");
            }else {
                sb.append(o2).append(",").append(" ");
            }

        }
        System.out.println("list集合:"+sb);
        //4.元素出现的索引位置
        int index = arr.indexOf("hello");
        System.out.println("hello的下标位置:"+index);
        //5.元素最后一一次出现的位置
        int index1 = arr.lastIndexOf("two");
        int index2 = arr.indexOf("two");
        System.out.println("two最后一次出现的位置："+index1);
        System.out.println("two第一次出现的位置："+index2);
        //5.set修改元素
        Object set = arr.set(3, 2);
        System.out.println("修改的元素是："+set);
        System.out.println("修改two为2后的信集合="+arr);
        //6.删除指定位置的元素
        //Object remove = arr.remove(2);
        //删除集合里的全部元素：Collection clear()
        //使用集合方法（从前往后删除）：
//        System.out.println(arr);
//        for(int i=0; i<arr.size();/*i++*/){//i++会导致删除不干净
//            System.out.println("被删除的元素是："+arr.remove(i));
//        }
//        System.out.println(arr);
        //使用集合方法（从后往前删除）
//        System.out.println(arr);
//        for(int i =arr.size()-1;i>=0;i--){
//            System.out.println("被删除的元素是："+arr.remove(i));
//        }
//        System.out.println("删除后的新集合："+arr);
        //7.获取子集合
        List sublist = arr.subList(2, 7);//左闭右开
        System.out.println("子集合为："+sublist);
        //子集合与父集合公用一块内存空间
        sublist.remove("hello");
        System.out.println("删除后的子集合为："+sublist);
        System.out.println("删除后的父集合为："+arr);
        arr.set(3,"linkList");
        System.out.println("删除后的子集合为："+sublist);
        System.out.println("删除后的父集合为："+arr);
    }
}
