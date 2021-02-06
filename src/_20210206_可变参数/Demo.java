package _20210206_可变参数;

public class Demo {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
    }
    public static int sum(int b,int... a){ //a是一个数组,一个方法有多个参数，把可变参数放在最后
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }

        return sum;
    }
}
