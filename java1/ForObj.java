package java1;

public class ForObj {
    public static void main(String[] args) {
        //打印乘法口诀表
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + "*" + j + "=" +i*j + "\t");
            }
            System.out.println();
        }
    }
}
