package _20210223_方法引用;

public class Printable1Demo {
    public static void main(String[] args) {
        usePrintable(i-> System.out.println(i));

        //方法引用
        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable1 p){
        p.print(666);
    }
}
