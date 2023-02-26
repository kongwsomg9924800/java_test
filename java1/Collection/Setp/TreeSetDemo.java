package java1.Collection.Setp;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //声明TreeSet
        Set<Student> studentSet = new TreeSet<>();
        System.out.println("stringSet="+studentSet);
        //添加元素
        boolean add = studentSet.add(new Student("gaigai",30));
        System.out.println("是否添加成功："+add);
        System.out.println("stringSet="+studentSet);
        add = studentSet.add(new Student("xiaosheng",30));
        System.out.println("是否添加成功："+add);
        System.out.println("stringSet="+studentSet);
        //添加失败，因为无法比较，重写的比较器方法返回0（完全相等），在Student类中修改compareTo方法实现
    }
}
