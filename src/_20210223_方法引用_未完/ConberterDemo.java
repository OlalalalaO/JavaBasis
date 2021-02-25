package _20210223_方法引用_未完;

public class ConberterDemo {
    public static void main(String[] args) {
        useConverter( c-> Integer.parseInt(c));
        useConverter(Integer::parseInt);
    }
    private static void useConverter(Converter c){
        int num = c.convert("666");
        System.out.println(num);
    }
}
