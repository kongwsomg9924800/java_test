package java1.Basicp.Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] oldArray = new int[] {10,20,30,40,50};
        int[] newArray = new int[oldArray.length];
        for(int i=0;i<newArray.length;i++){
            newArray[i] = oldArray[oldArray.length-1-i];
            System.out.println(newArray[i]);
        }
    }
}
