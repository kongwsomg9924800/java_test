package java1.Collection;

import java.util.Stack;

//1.准备一个Stack集合，将数据11，22，33，44，55依次放入栈并打印
//2.查看栈顶元素并打印，然后将栈中所有数据依次出栈并打印
public class StackDemo {
    public static void main(String[] args) {
        //1.声明一个Stack集合
        Stack stack = new Stack();
        //2.入栈元素
        for(int i=1;i<6;i++){
            Object push = stack.push(i * 11);
            System.out.println("当前入栈元素为："+push);
        }
        System.out.println("Stack集合"+stack);
        //search()
        int search = stack.search(55);//从后往前数，最后一个元素距离栈顶为1
        System.out.println("55距离栈顶距离："+search);
        //查看栈顶元素
        Object peek = stack.peek();
        int size = stack.size();
        System.out.println("栈顶元素是："+peek);
        //查看栈顶元素并打印，然后将栈中所有数据依次出栈并打印
        for(int i=0;i<size;i++){
            System.out.println("出栈元素是："+stack.pop());
        }
        System.out.println("stack集合为："+stack);
    }
}
