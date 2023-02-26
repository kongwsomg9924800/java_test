package java1.Collection;

import java.util.LinkedList;
import java.util.Queue;

//1.准备一个Queue集合，将11，22，33，44，55一次入队并打印
//2.查看队首元素并打印，然后将队列中所有数据依次出队并打印
public class QueueDemo {
    public static void main(String[] args) {
        //定义一个Queue集合
        Queue que = new LinkedList();
        for(int i=1;i<6;i++){
            boolean offer = que.offer(i * 11);
        }
        System.out.println("que="+que);
        //打印队首元素
        Object peek = que.peek();
        System.out.println("队首元素是:"+peek);
        //然后将队列中所有数据依次出队并打印
        int size = que.size();
        for(int i=0;i<size;i++){
            Object poll = que.poll();
            System.out.println("出队元素是："+poll);
        }
        System.out.println("queue="+que);
    }
}
