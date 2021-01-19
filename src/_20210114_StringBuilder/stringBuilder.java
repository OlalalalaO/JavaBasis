package _20210114_StringBuilder;
//string和stringbuilder的区别
//string内容不会变，每次只改变地址指向
//stringbuilder内容会改变,创建时不含任何对象
public class stringBuilder {
    public static void main(String[] args) {
        //第一种创建方法
        StringBuilder sb = new StringBuilder();
        String s = new String();
        System.out.println("s:"+s); //输出 s:
        System.out.println("sb:"+sb); // 输出 sb:不含任何对象
        System.out.println("sb.length:"+sb.length()); //输出  0


        //第二种创建方法
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:"+sb2); // 输出 hello
        System.out.println("sb2.length:"+sb2.length()); //输出  5


    }
}
