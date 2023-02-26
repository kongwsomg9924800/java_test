package java1.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionOtherMenthon {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        Collection c3 = new ArrayList();
//        c3.add(22);
        c2.add("python");
        c2.add(76);
        c1.add("java");
        c1.add(45);
        c1.add(c2);
        c1.add(new Person("小蓝",18));
        System.out.println("c2:"+c2);
        System.out.println("c1:"+c1);

        //1.判断集合长度
        System.out.println("c1长度:"+c1.size());
        //2.判断集合是否唯恐
        System.out.println("c1是否为空集合:"+c1.isEmpty());
        System.out.println(0==c3.size()?"c3是一个空集合":"c3不是一个空集合");
        //3.清空集合
        c3.clear();
        //4.比较元素内容
        Collection co1 = new ArrayList();
        co1.add(22);
        co1.add("java");
        Collection co2 = new ArrayList();
        co2.add(22);
        co2.add("java");
        boolean equals = co1.equals(co2);//比较的是两个集合的元素内容是否相等，而不是比较内存地址相等
        System.out.println(equals);//true
        //5.集合转换为数组  集合是取代数组的结构
        Object[] toArray = c1.toArray();
        System.out.println("数组的元素:"+ Arrays.toString(toArray));
        //6.数组转为集合
        List<Object> objectList = Arrays.asList(toArray);
        System.out.println("集合的元素:"+objectList);
    }
}
