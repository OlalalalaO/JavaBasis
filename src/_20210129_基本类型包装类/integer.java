package _20210129_基本类型包装类;

public class integer {
    public static void main(String[] args) {

/*        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = new Integer("abc"); //报错，数字类型的字符串
        System.out.println(i2); 全部过时，不宜使用*/


        Integer i1 = Integer.valueOf(1000);
        System.out.println(i1);


        Integer i2 = Integer.valueOf("000");
        System.out.println(i2);
    }
}
