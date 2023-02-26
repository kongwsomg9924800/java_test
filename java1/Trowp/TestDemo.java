package java1.Trowp;

public class TestDemo {
    public static void main(String[] args) {
        try{
            int a = 16/0;
            System.out.println("a:"+a);
        }catch(Exception e){
            //异常报错的处理逻辑
            System.out.println("该方法异常，无法执行");
        }finally{
            System.out.println("ending...");
        }
    }
}
