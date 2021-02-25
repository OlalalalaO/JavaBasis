package _20210225_Stream流;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("刘岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");


        //所有以张开头的元素存储到一个新的集合
        ArrayList<String> zhangList = new ArrayList<String>();
        for (String s : arrayList) {
            if(s.startsWith("张")){
                zhangList.add(s);
            }
        }
        System.out.println(zhangList);

        //将张集合中长度为3的集合储存到一个新的集合

        ArrayList<String> threeList = new ArrayList<String>();
        for (String s : zhangList) {
            if(s.length() == 3){
                threeList.add(s);
            }
        }
        System.out.println(threeList);
        System.out.println("--------");

        arrayList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

    }




}
