package _20210128_Math;

public class math {
    public static void main(String[] args) {
        /**********绝对值**********/
        System.out.println(Math.abs(888));
        System.out.println(Math.abs(-888));

        /**********向上取整********/
        System.out.println("============");
        System.out.println(Math.ceil(13.88)); //返回值类型为double
        /**********向下取整********/
        System.out.println(Math.ceil(12.888));
        /************四舍五入***********/
        System.out.println(Math.round(13.89));
        System.out.println(Math.round(12.45));
        /***********返回较大者********/
        System.out.println(Math.max(88,66));
        /*******返回a的b次幂*********/
        System.out.println(Math.pow(2,3));
        /**********随机数******/
        System.out.println(Math.random()); //double类型
    }
}
