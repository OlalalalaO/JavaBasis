package _20210223_方法引用_未完;

public class PrintableDemo {
    public static void main(String[] args) {

        usePrintable( s-> System.out.println(s));

        //方法引用  ：：
        usePrintable(System.out::println);


    }
    private static void usePrintable(Printable p){
        p.printString("爱生活，爱JAVA");
    }
}
