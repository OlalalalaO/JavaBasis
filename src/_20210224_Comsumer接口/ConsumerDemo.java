package _20210224_Comsumer接口;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("林青霞",(String s)->{
            System.out.println(s);
        });
        operatorString("林青霞",System.out::println);
        operatorString("林青霞",s->{

            System.out.println(new StringBuilder(s).reverse().toString());
        });
    }
    public static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
}
