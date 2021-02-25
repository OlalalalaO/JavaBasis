package _20210225_Stream流;

import java.util.ArrayList;

public class Stream终结操作 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("刘岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");

        arrayList.stream().forEach(System.out::println);


        //统计有几个以张开头的
        System.out.println(arrayList.stream().filter(s->s.startsWith("张")).count());
    }
}
