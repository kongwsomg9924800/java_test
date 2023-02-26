package java1.Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        Integer[] integerList = {11,22,33,44,55};
        Animal.show(integerList);
        //使用有参构造，传sex为int 1
        Animal animal1 = new Animal("小白",2,1);
        System.out.println(animal1);
        //使用无参构造，调用
        Animal<String> animal2 = new Animal<>();
        animal2.setSex("男生");
        System.out.println(animal2);

        List list1 = new ArrayList();
        list1.add(1);
        list1.add("hello");
        list1.add(new Person("小黑",2));
        System.out.println("没有泛型的集合："+list1);

        List<String> list2 =new ArrayList<>();
//        list2.add(2);
//        list2.add(new Person("小红",2));
        list2.add("小红");
        System.out.println("有泛型的List集合："+list2);
    }
}
