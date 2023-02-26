package java1.Collection.Setp;

import java.util.HashSet;
import java.util.Set;

//准备一个Set集合指向Hash对象，
// 向该集合中添加元素“two”并打印，
// 再向集合中添加元素“one”并打印，
// 再向集合中添加元素“three”并打印，
// 再向集合中添加“one”并打印。
public class SetDemo {
    public static void main(String[] args) {
        //准备一个Set集合指向Hash对象
        Set s1 =new HashSet();
        // 向该集合中添加元素“two”并打印
        boolean add = s1.add("two");
        System.out.println(s1);
        // 再向集合中添加元素“one”并打印
        add = s1.add("one");
        System.out.println(s1);
        // 再向集合中添加元素“three”并打印
        add = s1.add("three");
        System.out.println(s1);
        // 再向集合中添加元素“one”并打印
        add = s1.add("one");
        System.out.println(s1);//向集合中添加重复元素不报错，但无法添加成功，集合元素保持不变
    }
}
