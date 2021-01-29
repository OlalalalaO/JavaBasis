package _20210129_int和String相互转换;

public class Demo {
    public static void main(String[] args) {
        int number = 100;
        //int ------ string
        //方式一
        String s1 = ""+number; //字符串连接
        System.out.println(s1);

        //方式二
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------");

        //string ----- int
        String s = "100";
        //方式一
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        //方式二
        int y= Integer.parseInt(s);
        System.out.println(y);

    }
}
