package _20210114_string;
/*
string 构造方法
 */
public class string {
    public static void main(String[] args) {
        //无参构造
        String s1 = new String();
        System.out.println("s1 = "+s1);
        //根据字符数组创建对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2="+s2);

        //根据字节数组创建对象
        byte[] bys = {97,98,99}; //ascii
        String s3 = new String(bys);
        System.out.println("s3="+ s3);

        //直接赋值
        String s4 = "abc";
        System.out.println("s4 = "+s4);
    }
}
