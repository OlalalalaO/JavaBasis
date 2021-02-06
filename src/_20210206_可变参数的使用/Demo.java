package _20210206_可变参数的使用;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = List.of("hell","weqw","weq0"); //返回元素的不可变的列表,增删改都不行

        //list.add("123");UnsupportedOperationException


        System.out.println(list);
    }
}
