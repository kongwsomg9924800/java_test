package java1.Collection;

import java.util.Stack;

public class Stack2Demo {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        for(int i=1;i<6;i++){
            Object push = stack1.push(i * 11);
            System.out.println("当前入栈元素为："+push);
        }

        System.out.println(stack1);//[55,44,33,22,11]
        System.out.println(stack2);//[]

        int size = stack1.size();
        for(int i=0;i<size;i++){
            Object pop = stack1.pop();
            System.out.println("当前出栈元素为："+pop);
            Object push = stack2.push(pop);
            System.out.println("stack2入栈元素为："+push);
        }
        System.out.println(stack1);//[]
        System.out.println(stack2);//[55,44,33,22,11]

        size = stack2.size();
        for(int i=0;i<size;i++){
            Object pop = stack2.pop();
            System.out.println("出栈元素为："+pop);
        }
        System.out.println(stack1);//[]
        System.out.println(stack2);//[]
    }
}
