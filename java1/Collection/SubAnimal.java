package java1.Collection;
//1.不保留泛型，并且父类没有指定类型--默认为Object类型
//public class SubAnimal extends Animal{}
//2.不保留泛型，但是父类指定类型--指定String、Integer等
//public class SubAnimal extends Animal<String>{ }
//3.保留父类泛型
//public class SubAnimal<T> extends Animal<T>{}
//4.不保留泛型，并且没有指定类型
//public class SubAnimal extends Animal{}
//5.增加自己的泛型
//public class SubAnimal<T,E> extends Animal<T>{}