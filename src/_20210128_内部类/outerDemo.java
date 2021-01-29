package _20210128_内部类;

public class outerDemo {
    public static void main(String[] args) {
        outer.inner i = new outer().new inner(); //创建内部类，成员内部类在另一个类中使用
        i.show();

        /*
        * */
        outer o = new outer(); //间接调用
        o.method();


    }
}
