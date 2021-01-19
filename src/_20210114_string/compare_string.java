package _20210114_string;
/* 字符串比较 equels
==:比较的如果是基本数据类型，则比较数据值是否相同
    比较的如果是引用数据类型，则比较地址值是否相同
 */
public class compare_string {
    public static void main(String[] args) {
        //构造方法的方式得到对象
        char[] chs = {'a','b','c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        //直接赋值的方式得到对象
        String s3 = "abc";
        String s4 = "abc";

        //比较字符串地址是否相同

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println("-------");

        //比较内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
