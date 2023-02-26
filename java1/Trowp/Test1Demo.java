package java1.Trowp;

public class Test1Demo {
    public static void main(String[] args) {
        try{
            num();
        }catch(Exception e){
            System.out.println("数字操作错误");
        }
    }
    public static void num() throws Exception{
        int a = 29;
        System.out.println("a:"+a);
    }
}
