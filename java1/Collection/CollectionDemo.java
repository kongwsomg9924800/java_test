package java1.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
//        Collection c1 = new Collection();
        Collection c1 = new ArrayList();
        System.out.println("集合c1:"+c1);
        //六、1.add
        //添加String
        c1.add(new String("hello"));//字符串放在常量池里面，String类型放在堆区里面
        c1.add("你好");//直接放在常量池里面
        System.out.println("集合c1:"+c1);
        //添加Integer包装类
        c1.add(Integer.valueOf(77));
        System.out.println("集合c1:"+c1);
        c1.add(88);//自动拆装箱机制
        System.out.println("集合c1:"+c1);
        //添加对象
        c1.add(new Person("小红",22));
        System.out.println("集合c1:"+c1);

        Collection c2 = new ArrayList();
        c2.add(22);
        c2.add("java");

        //2.addALl
        boolean b = c1.addAll(c2);
        System.out.println("元素添加是否成功："+b);

        c1.add(c2);
        System.out.println("集合c1:"+c1);

        //七、判断单个元素Contains
        boolean b1 = c1.contains("hello");
        System.out.println("是否包含Str："+b1);

        b1 = c1.contains("hogwarts");
        System.out.println("是否包含Str："+b1);

        b1 = c1.contains(77);
        System.out.println("是否包含int："+b1);

        b1 = c1.contains(29);
        System.out.println("是否包含int："+b1);

        b1 = c1.contains(new Person("小红",22));
        System.out.println("是否包含对象:"+b1);

        //判断另一个集合所有元素
        Collection c3 = new ArrayList();
        c3.add(77);
        System.out.println("c1:"+c1);
        System.out.println("c3:"+c3);

        boolean b2 = c1.containsAll(c3);
        System.out.println("c1-contains-c3:"+b2);

        Collection c4 = new ArrayList();
        c4.add(77);
        c4.add("hello");

        b2 = c1.containsAll(c4);
        System.out.println("c1-contains-c4:"+b2);
        b2 = c1.contains(c4);
        System.out.println("c1-contain-c4:"+b2);
        //add(Object)添加的是集合的每一个元素
        //addAll(collection)添加的是集合对象
        //contains(Object)比较的是集合的对象
        //containsAll(collection)比较的是集合的每一个元素

        System.out.println("c1集合:"+c1);
        //remove 删除不存在的元素对象
        boolean remove = c1.remove(66);
        System.out.println("c1remove:"+remove);  //false

        //remove 删除存在的元素对象
        remove = c1.remove(77);
        System.out.println("c1:"+c1);

        //remove集合对象
        remove = c1.remove(c2);
        System.out.println("c1:"+c1);

        Collection collection = new ArrayList();
        collection.add(new Person("小红",22));
        System.out.println(collection);

        //remove = c1.remove(collection);
        remove = c1.remove(new Person("小红",22));
        System.out.println("c1remove:"+remove);//true
        System.out.println("c1:"+c1);

        //removeAll c1中只要有元素被删除就是true，collection中没有的元素就不操作
        boolean b3 = c1.removeAll(collection);
        System.out.println("c1removeAll:"+b3);//true

        //remove(Object)删除集合对象
        //removeAll(collection)删除集合的每个元素
    }
}