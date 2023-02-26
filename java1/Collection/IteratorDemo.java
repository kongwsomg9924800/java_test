package java1.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        //添加String
        c1.add(new String("hello"));//字符串放在常量池里面，String类型放在堆区里面
        c1.add("你好");//直接放在常量池里面
        //添加Integer包装类
        c1.add(Integer.valueOf(77));
        System.out.println("集合c1:"+c1);
        c1.add(88);//自动拆装箱机制
        System.out.println("集合c1:"+c1);
        //添加对象
        c1.add(new Person("小红",22));
        System.out.println("集合c1:"+c1);


        System.out.println("---------------");

        //遍历打印集合，使用到hasNext()方法与next()方法
        //获取迭代器对象
        Iterator iterator1 = c1.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        //使用while循环 判断是否有元素可以访问Iterator
        while(iterator1.hasNext()){
            Object next = iterator1.next();
            if (!iterator1.hasNext()) {
                stringBuilder.append(next).append("]");
            }else{
                stringBuilder.append(next).append(",").append(" ");
            }
        }
        System.out.println(stringBuilder);

        //使用迭代器remove元素
        iterator1 = c1.iterator();//重置迭代器
        while(iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println(next);
            if("你好".equals(next)){
                //迭代器取出对象
                System.out.println("要删除的元素是："+next);
                iterator1.remove();
            }
        }
        System.out.println("c1集合："+c1);

    }
}
