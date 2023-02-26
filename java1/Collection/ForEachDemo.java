package java1.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachDemo {
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
        System.out.println("------------------------");



        for(Object obj : c1){
            System.out.println("c1集合对象是:"+obj);
        }

        int[] arr = new int[]{22,44,66,77};
        for(int i : arr){
            System.out.println("数组内容:"+i);
        }
    }
}
