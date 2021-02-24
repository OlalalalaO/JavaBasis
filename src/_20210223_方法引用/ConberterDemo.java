package _20210223_方法引用;

public class ConberterDemo {
    public static void main(String[] args) {
        useConverter( c-> Integer.parseInt(c));

    }
    private static void useConverter(Converter c){
        int num = c.convert("666");
        System.out.println(num);
    }
}
