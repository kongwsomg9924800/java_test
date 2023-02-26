package java1.Collection.Setp;

public class Student implements Comparable<Student>{
    //有参构造方法与无参构造方法，getter和setter方法、toString方法、实现接口Comperable
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Student o) {
        //调用对象 参数对象0是相等的
        //return 0;
        //return 1;
        //return -1;
        //1.根据name进行判断
        //return this.getName().compareTo(o.getName());
        //2.根据年龄判断
        //return this .getAge()-o.getAge();//可以保证不相等就添加，相等不添加
        //3.现根据name判断，name相等根据年龄判断
        int i = this.getName().compareTo(o.getName());
        if(i==0){
            return this .getAge()-o.getAge();
        }else{
            return i;
        }
    }
}
