package _20210204_列表迭代器;

public class forList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i :arr){
            System.out.println(i);
        }
        System.out.println("--------");
        String[] strarray = {"hello","sdasd","sdasd"};
        for (String s :strarray){
            System.out.println(s);
        }
    }
}
